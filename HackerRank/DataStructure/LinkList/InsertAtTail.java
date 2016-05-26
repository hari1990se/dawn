class Node
{
	int data;
	Node next;
}

class LinkList
{
	Node head;

	LinkList()
	{
		head = null;
	}

	public void push(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	public void display()
	{
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data +"->");
			ptr = ptr.next;
		}
	}

	public Node insert(Node head, int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			return newNode;
		}
		Node ptr = head;
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = newNode;
		return head;
	}
}

class InsertAtTail
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(10);
		linkList.push(20);
		linkList.push(30);
		linkList.push(40);
		linkList.display();
		System.out.println();
		linkList.head = linkList.insert(linkList.head, 22);
		linkList.display();
	}
}
