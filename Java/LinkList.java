class Node
{
	private int data;
	private Node next;
	public int getData()
	{
		return data;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setNext(Node next)
	{
		this.next = next;
	}
}

class LinkList
{
	Node head = null;
	static Node prev = null;
	void insert(int data)
	{
		if(head == null)
		{
			head = new Node();
			head.setData(data);
			head.setNext(null);
			prev = head;
		}
		else
		{
			Node newNode = new Node();
			newNode.setData(data);
			newNode.setNext(null);
			prev.setNext(newNode);
			prev = newNode;
		}
	}
	void display()
	{
		Node ptr = head;
		while(ptr != null)
		{
			System.out.print(ptr.getData() +"->");
			ptr = ptr.getNext();
		}
	}
	public static void main(String... strings)
	{
		LinkList linklist = new LinkList();
		linklist.insert(2);
		linklist.insert(4);
		linklist.insert(6);
		linklist.insert(8);
		linklist.insert(10);
		linklist.insert(12);
		linklist.insert(14);
		linklist.insert(16);
		linklist.insert(18);
		linklist.insert(20);
		linklist.insert(22);
		linklist.insert(24);
		linklist.display();
	}
}