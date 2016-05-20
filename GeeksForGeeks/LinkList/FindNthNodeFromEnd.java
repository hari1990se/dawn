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
			head.setNext(null);
			head.setData(data);
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

	public int nthNodeFromEnd(Node head, int n)
	{
		Node ptr1 = head;
		Node ptr2 = head;
		while(ptr2 != null && n > 0) {
			ptr2 = ptr2.getNext();
			n--;
		}
		while(ptr2 != null) {
			ptr1 = ptr1.getNext();
			ptr2 = ptr2.getNext();
		}
		return ptr1.getData();
	}
}

class FindNthNodeFromEnd
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(10);
		linkList.push(20);
		linkList.push(30);
		linkList.push(40);
		linkList.push(50);
		linkList.push(60);
		linkList.display(linkList.getHead());
		System.out.println(linkList.nthNodeFromEnd(linkList.getHead(), 1));
	}
}