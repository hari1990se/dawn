class Node
{
	int data;
	Node next;
}

class LinkList
{
	private 	Node head;

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

	public int compareLists(Node headA, Node headB)
	{
		while(headA != null && headB != null) {
			if(headA.data == headB.data) {
				headA = headA.next;
				headB = headB.next;
			} else {
				break;
			}
		}
		if(headA == null && headB == null) {
			return 1;
		}
		return 0;
	}
}

class CompareTwoList
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(1);
		linkList.push(2);
		linkList.push(3);
	/*	linkList.push(40);
		linkList.push(50);
		linkList.push(60);*/
		LinkList linkList1 = new LinkList();
		linkList1.push(1);
		linkList1.push(2);
		linkList1.push(3);
		linkList1.push(4);
		/*linkList1.push(50);
		linkList1.push(60);
*/		System.out.println(linkList.compareLists(linkList.getHead(), linkList1.getHead()));

		linkList.display();
	}
}