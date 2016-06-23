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

	public void insert(Node root, int data)
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setLarge(null);
		newNode.setSmall(null);
		if(root == null) {
			this.root = newNode;
		} else {
			if(root.getData() >= data) {
				if(root.getSmall() != null) {
					insert(root.getSmall(), data);
				} else {
					root.setSmall(newNode);
				}
			} else {
				if(root.getLarge() != null) {
					insert(root.getLarge(), data);
				} else {
					root.setLarge(newNode);
				}
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

	public static void join(Node a, Node b)
	{
		a.setLarge(b);
		b.setSmall(a);
	}

	public static Node append(Node a, Node b)
	{
		if(a == null)
		{
			return b;
		}
		if(b == null)
		{
			return a;
		}
		Node aLast = a.getSmall();
		Node bLast = b.getSmall();
		join(aLast, b);
		join(bLast, a);
		return a;
	}

	public static Node treeToList(Node root)
	{
		if(root == null)
		{
			return null;
		}
		Node aList = treeToList(root.getSmall());
		Node bList = treeToList(root.getLarge());
		root.setSmall(root);
		root.setLarge(root);
		aList = append(aList, root);
		aList = append(aList, bList);
		return aList;
	}

	public void printList(Node head)
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.getData() + "->");
			current = current.getLarge();
			if(current == head)
			{
				break;
			}
		}
	}
}

class TreeListRecursion
{
	public static void main(String... strings) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(binaryTree.getRoot(), 2);
		binaryTree.insert(binaryTree.getRoot(), 12);
		binaryTree.insert(binaryTree.getRoot(), -1);
		binaryTree.insert(binaryTree.getRoot(), 0);
		binaryTree.insert(binaryTree.getRoot(), 9);
		binaryTree.inorder(binaryTree.getRoot());
		System.out.println("\nList:");
		Node head = BinaryTree.treeToList(binaryTree.getRoot());
		binaryTree.printList(head);
	}
}