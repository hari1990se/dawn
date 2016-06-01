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

	public void insertion(Node root, int data)
	{
		if(root == null) {
			Node newNode = new Node();
			newNode.data = data;
			newNode.left = null;
			newNode.right = null;
		}
	}
}