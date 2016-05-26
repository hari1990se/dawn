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

	public void display(Node head)
	{
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data +"->");
			ptr = ptr.next;
		}
	}

}

class PrintElements
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(10);
		linkList.push(20);
		linkList.push(30);
		linkList.push(40);
		linkList.display(linkList.head);
	}
}
