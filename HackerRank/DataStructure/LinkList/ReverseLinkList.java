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

	public Node reverseList(Node head)
	{
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}

class ReverseLinkList
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(2);
		linkList.push(4);
		linkList.push(6);
		linkList.push(8);
		linkList.push(10);
		linkList.display();
		System.out.println();
		Node newHead = linkList.reverseList(linkList.head);
		linkList.head = newHead;
		linkList.display();
	}
}