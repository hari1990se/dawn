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

	public int getNode(Node head, int n)
	{
		Node ptr = head;
		while(n > 0) {
			ptr = ptr.next;
			n--;
		}
		while(ptr != null && ptr.next != null) {
			ptr = ptr.next;
			head = head.next;
		}
		return head.data;
	}
}

class GetNodeValue
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
		System.out.println(linkList.getNode(linkList.head, 2));
	}
}