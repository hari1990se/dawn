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

	Node deleteDuplicate(Node head)
	{
		Node ptr = head;
		if(head == null) {
			return null;
		}
		while(ptr != null && ptr.next != null) {
			Node temp = ptr.next;
			while (temp != null && ptr.data == temp.data) {
				temp = temp.next;
			}
			ptr.next = temp;
			ptr = ptr.next;
		}
		return head;	
	}
}

class DeleteDuplicate
{
	public static void main(String... strings)
	{
		LinkList linkList = new LinkList();
		linkList.push(6);
		linkList.push(6);
		linkList.push(4);
		linkList.push(3);
		linkList.push(3);
		linkList.push(1);
		linkList.display();
		linkList.deleteDuplicate(linkList.head);
		System.out.println();
		linkList.display();
	}
}