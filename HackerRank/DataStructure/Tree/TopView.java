import java.util.Queue;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class QueueItem
{
	Node node;
	int hd;
	QueueItem(Node node, int h)
	{
		this.node = node;
		this.hd = h;
	}
}

class BinaryTree
{
	Node root;

	BinaryTree()
	{
		root = null;
	}

	public void top_view(Node root)
	{
		if(root == null)
		{
			return;
		}

		Stack <Integer> stack = new Stack <Integer> ();
		List <Integer> list = new ArrayList <Integer> ();
		HashSet <Integer> set = new HashSet <Integer> ();
		Queue <QueueItem> queue = new LinkedList <QueueItem> ();
		queue.add(new QueueItem(root, 0));
		
		while(!queue.isEmpty())
		{
			QueueItem queueItem = queue.remove();
			int hd = queueItem.hd;
			Node node = queueItem.node;

			if(!set.contains(hd))
			{
				set.add(hd);
				if(hd <= 0)
				{
					stack.push(node.data);
				}
				else
				{
					list.add(node.data);
				}
			}

			if(node.left != null)
			{
				queue.add(new QueueItem(node.left, hd - 1));
			}
			if(node.right != null)
			{
				queue.add(new QueueItem(node.right, hd + 1));
			}
		}

		while(!stack.empty())
		{
			System.out.print(stack.pop() +" ");
		}

		ListIterator <Integer> it = list.listIterator(); 
		while(it.hasNext())
		{
			System.out.print(it.next() +" ");
		} 
	}
}

class TopView
{
	public static void main(String... strings)
	{
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(10);
		binaryTree.root.left = new Node(4);
		binaryTree.root.right = new Node(15);
		binaryTree.top_view(binaryTree.root);
	}
}