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

	public int lowestCommonAncestor(Node root, int v1, int v2)
	{
		if(root.data >= v1 && root.data <= v2)
		{
			return root.data;
		}
		else if(root.data <= v1 && root.data >= v2)
		{
			return root.data;
		}
		else
		{
			if(root.data < v1 && root.data < v2)
			{
				return lowestCommonAncestor(root.right, v1, v2);
			}
			else
			{
				return lowestCommonAncestor(root.left, v1, v2);
			}
		}
	}
}

class LowestCommonAncestor
{
	public static void main(String... strings)
	{
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = binaryTree.newNode(10);
		binaryTree.root.left = binaryTree.newNode(7);
		binaryTree.root.right = binaryTree.newNode(15);
		binaryTree.root.right.left = binaryTree.newNode(13);
		binaryTree.root.right.right = binaryTree.newNode(19);
		System.out.println(binaryTree.lowestCommonAncestor(binaryTree.root, 13, 19));
	}
}