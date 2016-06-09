class Node
{
	private int data;
	private Node left;
	private Node right;

	public Node getLeft()
	{
		return this.left;
	}

	public void setLeft(Node left)
	{
		this.left = left;
	}

	public int getData()
	{
		return this.data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public Node getRight()
	{
		return this.right;
	}

	public void setRight(Node right)
	{
		this.right = right;
	}
}

class BinarySearchTree
{
	Node root;

	BinarySearchTree()
	{
		root = null;
	}

	public Node getRoot()
	{
		return this.root;
	}

	public Node setRoot(Node root)
	{
		this.root = root;
	}

	public void insert(Node root, int data)
	{
		if(root == null) {
			root = new Node();
			root.setLeft(null);
			root.setRight(null);
			root.setData(data);
			this.setRoot(root);
		} else {
			if(root.getData() < data) {
				insert(root.getRight(), data);
			} else {
				insert(root.getLeft(), data);
			}
		}
	}	
}