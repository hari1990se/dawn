class Node
{
	private int data;
	private Node left;
	private Node right;

	public int getData()
	{
		return this.data;
	}

	public Node getLeft()
	{
		return this.left;
	}

	public Node getRight()
	{
		return this.right;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public void setLeft(Node left)
	{
		this.left = left;
	}

	public void setRight(Node right)
	{
		this.right = right;
	}
}

class BinaryTree
{
	private Node root;

	BinaryTree()
	{
		this.root = null;
	}

	public void setRoot(Node root)
	{
		this.root = root;
	}

	public Node getRoot()
	{
		return this.root;
	}

	public Node newNode(int data)
	{
		Node newNode = new Node();
		newNode.setLeft(null);
		newNode.setRight(null);
		newNode.setData(data);
		return newNode;
	}

	public void inorder(Node root)
	{
		if(root != null) {
			inorder(root.getLeft());
			System.out.print(root.getData() +"->");
			inorder(root.getRight());
		}
	}
}

class BinaryTreeDemo
{
	public static void main(String... strings)
	{
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(binaryTree.newNode(10));
		binaryTree.getRoot().setLeft(binaryTree.newNode(7));
		binaryTree.getRoot().setRight(binaryTree.newNode(30));
		binaryTree.getRoot().getLeft().setLeft(binaryTree.newNode(4));
		binaryTree.getRoot().getLeft().setRight(binaryTree.newNode(9));
		binaryTree.getRoot().getRight().setRight(binaryTree.newNode(40));
		binaryTree.getRoot().getRight().getRight().setLeft(binaryTree.newNode(38));
		binaryTree.inorder(binaryTree.getRoot());
	}
}