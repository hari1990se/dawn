class Node
{
	private char data;
	private Node next;

	Node()
	{
		this.data = '\0';
		this.next = null;
	}

	public char getData()
	{
		return this.data;
	}

	public Node getNext()
	{
		return this.next;
	}

	public void setData(char data)
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

	public void push(char data)
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void display()
	{
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.getData() +"->");
			ptr = ptr.getNext();
		}
	}
}

class CheckListIsPalindrome
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push('W');
		linkList.push('O');
		linkList.push('R');
		linkList.push('D');
		linkList.display();
	}
}