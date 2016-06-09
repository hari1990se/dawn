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

	public int getMax(int a, int b)
	{
		return (a > b) ? a : b;
	}

	public int getHeight(Node root)
	{
		if((root == null) || (root.right == null && root.left == null))
		{
			return 0;
		}
		return 1 + getMax(getHeight(root.left), getHeight(root.right));
	}
}

class HeightOfBinaryTree
{
	public static void main(String... strings)
	{
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = binaryTree.newNode(4);
		binaryTree.root.left = binaryTree.newNode(1);
		binaryTree.root.left.right = binaryTree.newNode(3);
		binaryTree.root.right = binaryTree.newNode(7);
		System.out.println(binaryTree.getHeight(binaryTree.root));
	}
}