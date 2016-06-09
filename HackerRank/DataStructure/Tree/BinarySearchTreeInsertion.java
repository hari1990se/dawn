class Node
{
	int data;
	Node left;
	Node right;
}

class BinarySearchTree
{
	Node root;

	BinarySearchTree()
	{
		root = null;
	}

	public Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	static Node insert(Node root, int data)
	{
		Node node;
		if(root == null)
		{
			node = (new BinarySearchTree()).newNode(data);
		}
		else
		{
			node = root;
			if(root.data < data)
			{
				root.right = BinarySearchTree.insert(root.right, data);
			}
			else
			{
				root.left = BinarySearchTree.insert(root.left, data);
			}
		}
		return node;
	}

	public void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.data +" ");
			inorder(root.right);
		}
	}
}

class BinarySearchTreeInsertion
{
	public static void main(String... strings)
	{
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.root = BinarySearchTree.insert(binarySearchTree.root, 10);
		binarySearchTree.root = BinarySearchTree.insert(binarySearchTree.root, 13);
		binarySearchTree.root = BinarySearchTree.insert(binarySearchTree.root, 20);
		binarySearchTree.root = BinarySearchTree.insert(binarySearchTree.root, 1);
		binarySearchTree.root = BinarySearchTree.insert(binarySearchTree.root, 45);
		binarySearchTree.root = BinarySearchTree.insert(binarySearchTree.root, 12);
		binarySearchTree.inorder(binarySearchTree.root);
	}
}