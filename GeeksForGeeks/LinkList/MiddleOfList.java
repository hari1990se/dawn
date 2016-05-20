class Node
{
	private int data;
	private Node next;
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public Node getNext()
	{
		return this.next;
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
		if(head == null) {
			head = new Node();
			head.setData(data);
			head.setNext(null);
		} else {
			Node newNode = new Node();
			newNode.setData(data);
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void display(Node head)
	{
		if(head != null) {
			System.out.print(head.getData() +"->");
			display(head.getNext());
		}
	}

	public Node getMiddle(Node head)
	{
		Node ptr1 = head;
		Node ptr2 = head;
		while(ptr2.getNext() != null && ptr1.getNext() != null)
		{
			ptr1 = ptr1.getNext();
			ptr2 = ptr2.getNext().getNext();
		}
		return ptr1;
	}
}

class MiddleOfList
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(2);
		linkList.push(4);
		linkList.push(6);
		linkList.push(8);
		linkList.push(10);
		linkList.push(12);
		linkList.push(14);
		linkList.push(16);
		linkList.push(18);
		linkList.display(linkList.getHead());
		System.out.println();
		System.out.println((linkList.getMiddle(linkList.getHead())).getData());
	}
}