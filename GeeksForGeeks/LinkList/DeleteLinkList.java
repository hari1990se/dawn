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

	public void deleteLinkList(Node head)
	{
		this.head = null;
	}
}

class DeleteLinkList
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(8);
		linkList.push(16);
		linkList.push(24);
		linkList.push(32);
		linkList.push(40);
		linkList.push(48);
		linkList.push(56);
		linkList.display(linkList.getHead());
		System.out.println();
		linkList.deleteLinkList(linkList.getHead());
		linkList.display(linkList.getHead());
	}
}
