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
	Node head;
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

	public void display()
	{
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.getData() +"->");
			ptr = ptr.getNext();
		}
	}

	public void deleteNode(Node ptr)
	{
			ptr.setData(ptr.getNext().getData());
			ptr.setNext(ptr.getNext().getNext());
	}
}

class DeleteNodeWithSingleReference
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
		linkList.deleteNode(linkList.getHead().getNext().getNext().getNext().getNext());
		System.out.println();
		linkList.display();
	}
}