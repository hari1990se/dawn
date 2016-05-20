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
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void display(Node head)
	{
		if(head != null) {
			System.out.print(head.getData() +"->");
			display(head.getNext());
		}
	}

	public int getOccurrence(Node head, int item)
	{
		int count = 0;
		while(head != null) {
			if(head.getData() == item) {
				count++;
			}
			head = head.getNext();
		}
		return count;
	}
}

class CountOccurrenceOfItem
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(4);
		linkList.push(8);
		linkList.push(8);
		linkList.push(16);
		linkList.push(8);
		linkList.push(24);
		linkList.display(linkList.getHead());
		System.out.println();
		System.out.println(linkList.getOccurrence(linkList.getHead(), 8));
	}
}