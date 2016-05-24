class Node
{
	private int data;
	private Node large;
	private Node small;

	public int getData()
	{
		return this.data;
	}

	public Node getLarge()
	{
		return this.large;
	}

	public Node getSmall()
	{
		return this.small;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public void setLarge(Node large)
	{
		this.large = large;
	}

	public void setSmall(Node small)
	{
		this.small = small;
	}
}

class BinaryTree
{
	private Node root;

	BinaryTree()
	{
		root = null;
	}

	public Node getRoot()
	{
		return this.root;
	}

	public void setRoot(Node root)
	{
		this.root = root;
	}

	public Node insert(Node root, int data)
	{
		if(root == null) {
			Node newNode = new Node();
			newNode.setSmall(null);
			newNode.setLarge(null);
			newNode.setData(data);
			return newNode;
		} else {
			if(root.getData() < data) {
				return insert(root.getLarge(), data);
			} else {
				return insert(root.getSmall(), data);
			}
		}
	}

	public void inorder(Node root)
	{
		if(root != null) {
			inorder(root.getSmall());
			System.out.print(root.getData() +"->");
			inorder(root.getLarge());
		}
	}
}

class TreeListRecursion
{
	public static void main(String... strings) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(binaryTree.insert(binaryTree.getRoot(), 5));
		binaryTree.setRoot(binaryTree.insert(binaryTree.getRoot(), 15));
		binaryTree.setRoot(binaryTree.insert(binaryTree.getRoot(), 52));
		binaryTree.setRoot(binaryTree.insert(binaryTree.getRoot(), 2));
		binaryTree.setRoot(binaryTree.insert(binaryTree.getRoot(), 4));
		binaryTree.setRoot(binaryTree.insert(binaryTree.getRoot(), 1));
		binaryTree.inorder(binaryTree.getRoot());
	}
}