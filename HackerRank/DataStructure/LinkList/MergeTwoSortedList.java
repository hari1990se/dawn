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

	public Node merge(Node headA, Node headB)
	{
		Node newHead = null;
		if(headA == null) {
			return headB;
		}
		if(headB == null) {
			return headA;
		}
		while(headA != null && headB != null) {
			Node ptr = new Node();
			ptr.next = newHead;
			newHead = ptr;
			if(headA.data < headB.data) {
				ptr.data = headA.data;
				headA = headA.next;
			} else {
				ptr.data = headB.data;
				headB = headB.next;
			}
		}
		while (headA != null) {
			Node ptr = new Node();
			ptr.data = headA.data;
			ptr.next = newHead;
			newHead = ptr;
			headA = headA.next;
		}
		while (headB != null) {
			Node ptr = new Node();
			ptr.data = headB.data;
			ptr.next = newHead;
			newHead = ptr;
			headB = headB.next;
		}
		/*return newHead;*/
		Node current = newHead;
		Node prev = null;
		Node temp = null; 
		while(current.next != null) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
			if(current.next == null) {
				newHead = current;
				current.next = prev;
				break;
			}
		}
		return newHead;
	}
}

class MergeTwoSortedList
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(12);
		linkList.push(5);
		linkList.push(3);
		linkList.push(2);
		linkList.push(1);
		linkList.display();
		System.out.println();
		LinkList linkList2 = new LinkList();
		linkList2.push(34);
		linkList2.push(23);
		linkList2.push(13);
		linkList2.push(8);
		linkList2.push(3);
		linkList2.push(2);
		linkList2.display();
		linkList.head = linkList.merge(linkList.head, linkList2.head);
		System.out.println();
		linkList.display();
	}
} 