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

	public void createCycle()
	{
		Node ptr = head;
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = head.next.next.next;
	}

	public int hasCycle(Node head)
	{
		Node slow = head;
		Node fast = null;
		if(head != null) {
			fast = head.next;
		}
		while(fast != null && slow != null && slow != fast) {
			slow = slow.next;
			if(fast.next != null) {
				fast = fast.next.next;
			}
			else {
				fast = null;
			}
		}
		if(slow == null || fast == null) {
			return 0;
		}
		else {
			return 1;
		}
	}
}

class DetectCycle
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(2);
		/*linkList.push(4);
		linkList.push(6);
		linkList.push(8);
		linkList.push(10);
		linkList.push(12);
*/		linkList.display();
		//linkList.createCycle();
		System.out.println();
		System.out.println(linkList.hasCycle(linkList.head));
	}
}