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

	public Node insert(Node head, int data, int position)
	{
		Node ptr = head;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		while(ptr.next != null && position > 1) {
			ptr = ptr.next;
			position--;
		}
		Node temp = ptr.next;
		ptr.next = newNode;
		newNode.next = temp;
		return head;
	}
}

class InsertAtSpecificPosition
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
		linkList.display();
		linkList.head = linkList.insert(linkList.head, 34, 1);
		System.out.println();
		linkList.display();
	}
}