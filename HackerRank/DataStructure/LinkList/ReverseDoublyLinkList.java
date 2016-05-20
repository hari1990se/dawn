class Node
{
	int data;
	Node next;
	Node prev;
}

class DList
{
	Node head;
	
	DList()
	{
		head = null;
	}

	void push(int data)
	{
		if(head == null) {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = head;
			newNode.prev = null;
			head = newNode;
		} else {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = head;
			newNode.prev = null;
			head.prev = newNode;
			head = newNode;
		}
	}

	void display(Node head)
	{
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data +"->");
			ptr = ptr.next;
		}
	}

	Node reverse(Node head)
	{
		Node temp_prev = null;
		Node temp_next = null;
		Node newHead = null;
		while (head != null) {
			newHead = head;
			temp_next = head.next;
			temp_prev = head.prev;
			head.next = temp_prev;
			head.prev = temp_next;
			head = temp_next;
		}
		return newHead;
	}
}

class ReverseDoublyLinkList
{
	public static void main(String... strings)
	{
		DList dList = new DList();
		dList.push(10);
		dList.push(20);
		dList.push(30);
		dList.push(40);
		dList.push(50);
		dList.push(60);
		dList.display(dList.head);
		Node newHead = dList.reverse(dList.head);
		System.out.println();
		dList.display(newHead);
	}
}