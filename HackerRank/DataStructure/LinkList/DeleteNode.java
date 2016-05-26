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

	public Node deleteNode(Node head, int position)
	{
		Node ptr = head;
		if(position == 0) {
			return ptr.next;
		}
		while(ptr.next != null && position > 1) {
			ptr = ptr.next;
			position--;
		}
		if(ptr.next != null) {
			ptr.next = ptr.next.next;
		}
		return head;
	}
}

class DeleteNode
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
		linkList.push(70);
		linkList.display();
		System.out.println();
		Node newNode = linkList.deleteNode(linkList.head, 8);
		linkList.head = newNode;
		linkList.display();
	}
}