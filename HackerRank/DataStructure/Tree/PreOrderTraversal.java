class Node
{
	int data;
	Node left;
	Node right;
}

class BinaryTree
{
	Node root;

	BinaryTree()
	{
		root = null;
	}

	public Node newNode(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

	public void preOrder(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data +" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}

class PreOrderTraversal
{
	public static void main(String... strings)
	{
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = binaryTree.newNode(4);
		binaryTree.root.left = binaryTree.newNode(1);
		binaryTree.root.left.right = binaryTree.newNode(3);
		binaryTree.root.right = binaryTree.newNode(7);
		binaryTree.preOrder(binaryTree.root);
	}
}