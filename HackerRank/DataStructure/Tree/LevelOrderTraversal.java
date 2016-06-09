import java.util.Queue;
import java.util.LinkedList;

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

	public void levelOrderTraversal(Node root)
	{
		Queue <Node> queue = new LinkedList <Node> ();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node temp = queue.remove();
			System.out.print(temp.data +" ");
			
			if(temp.left != null)
			{
				queue.add(temp.left);
			}

			if(temp.right != null)
			{
				queue.add(temp.right);
			}
		}
	}
}

class LevelOrderTraversal
{
	public static void main(String... strings)
	{
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = binaryTree.newNode(10);
		binaryTree.root.left = binaryTree.newNode(4);
		binaryTree.root.right = binaryTree.newNode(14);
		binaryTree.levelOrderTraversal(binaryTree.root);
	}
}