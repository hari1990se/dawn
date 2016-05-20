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

	public void createMergePoint(LinkList linkList2)
	{
		Node ptr = linkList2.head;
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = this.head.next.next.next;
	}

	public int findMergePoint(Node headA, Node headB)
	{
		int len1 = 0;
		int len2 = 0;
		Node ptr1 = headA;
		Node ptr2 = headB;
		while(ptr1.next != null) {
			len1++;
			ptr1 = ptr1.next;
		}
		while(ptr2.next != null) {
			len2++;
			ptr2 = ptr2.next;
		}
		if(len1 > len2) {
			int diff = len1 - len2;
			while(diff > 0) {
				headA = headA.next;
				diff--;
			}
		}
		else {
			int diff = len2 - len1;
			while(diff > 0) {
				headB = headB.next;
				diff--;
			}
		}
		while(headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA.data;
	}
}

class FindMergePointOfTwoList
{
	public static void main(String... strings)
	{
		LinkList linkList1 = new LinkList();
		linkList1.push(10);
		linkList1.push(20);
		linkList1.push(30);
		linkList1.push(40);
		linkList1.push(50);
		linkList1.display();
		System.out.println();
		LinkList linkList2 = new LinkList();
		linkList2.push(1);
		linkList2.push(2);
		linkList2.push(3);
		linkList2.push(4);
		linkList2.push(5);
		linkList2.display();
		System.out.println();
		System.out.println("After merge both lists are");
		linkList1.createMergePoint(linkList2);
		linkList1.display();
		System.out.println();
		linkList2.display();
		System.out.println();
		System.out.println(linkList1.findMergePoint(linkList1.head, linkList2.head));

	}
}