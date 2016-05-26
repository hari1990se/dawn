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

	public void printReverse(Node head)
	{
		if(head != null) {
			printReverse(head.next);
			System.out.print(head.data +"->");
		}
	}
}

class ReversePrint
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
		linkList.printReverse(linkList.head);
	}
}