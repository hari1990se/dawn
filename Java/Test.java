class Node
{
	private int data;
	private Node next;

	public int getData()
	{
		return this.data;
	}

	public Node getNext()
	{
		return this.next;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}
}

class LinkList
{
	private Node head;

	LinkList()
	{
		head = null;
	}

	public Node getHead()
	{
		return this.head;
	}

	public void push(int data)
	{
		Node newNode = new Node();
		newNode.setNext(head);
		newNode.setData(data);
		head = newNode;
	}

	public void display()
	{
		Node ptr = head;
		while(ptr != null)
		{
			System.out.print(ptr.getData() +"->");
			ptr = ptr.getNext();
		}
	}
}

class Test
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(10);
		linkList.push(20);
		linkList.push(30);
		linkList.push(40);
		linkList.push(50);
		linkList.display();
	}
}