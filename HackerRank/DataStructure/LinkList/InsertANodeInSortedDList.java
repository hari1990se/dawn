class Node
{
	int data;
	Node prev;
	Node next;
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
			newNode.next = null;
			newNode.prev = null;
			head = newNode;
		} else {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = head;
			head.prev = newNode;
			newNode.prev = null;
			head = newNode;
		}
	}

	void display(Node head)
	{
		if(head != null) {
			System.out.print(head.data +"->");
			display(head.next);
		}
	}

	Node insert(Node head, int data)
	{
		Node ptr = head;
		Node prev = null;
		boolean flag = false;
		while(ptr != null && ptr.data > data) {
			prev = ptr;
			ptr = ptr.next;
			flag =true;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = ptr;
		newNode.prev = prev;
		if(ptr != null) {
			ptr.prev = newNode;
		}
		if(prev != null) {
			prev.next = newNode;
		}
		if(!flag) {
			head = newNode;
		}
		return head;
	}
}

class InsertANodeInSortedDList
{
	public static void main(String... strings)
	{
		DList dList = new DList();
		dList.push(2);
		dList.push(4);
		dList.push(6);
		dList.push(8);
		dList.display(dList.head);
		Node newHead = dList.insert(dList.head, 5);
		System.out.println();
		dList.display(newHead);
	}
}