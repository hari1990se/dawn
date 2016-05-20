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

	public void display()
	{
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.getData() +"->");
			ptr = ptr.getNext();
		}
	}
	
	/*A recursive approach*/

	public void reverseLinkList()
	{
		if(head == null)
			return;
		reverseLinkListUtil(head, null);
	}
	
	public void reverseLinkListUtil(Node current, Node prev)
	{
		if(current.getNext() == null) {
			head = current;
			current.setNext(prev);
			return;
		}
		Node newNode = current.getNext();
		current.setNext(prev);
		reverseLinkListUtil(newNode, current);
	}

	/*An iterative approach*/

	public void reverseList()
	{
		Node current = head;
		Node prev = null;
		Node temp = null;
		while(current.getNext() != null) {
			temp = current.getNext();
			current.setNext(prev);
			prev = current;
			current = temp;
			if(current.getNext() == null) {
				head = current;
				current.setNext(prev);
				break;
			}
		}
	}
}

class ReverseLinkList
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(3);
		linkList.push(6);
		linkList.push(9);
		linkList.push(12);
		linkList.push(15);
		linkList.display();
		linkList.reverseLinkList();
		System.out.println();
		linkList.display();
		linkList.reverseList();
		System.out.println();
		linkList.display();
	}
}

