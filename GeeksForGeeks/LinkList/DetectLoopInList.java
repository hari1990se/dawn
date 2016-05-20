class Node
{
	private int data;
	private Node next;

	Node()
	{
		this.data = -1;
		this.next = null;
	}

	public int getData()
	{
		return this.data;
	}

	public Node getNext()
	{
		return this.next;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}
}

class LinkList
{
	private Node head;

	LinkList()
	{
		head = null;
	}

	public void push(int data)
	{
		Node newNode = new Node();
		newNode.setNext(head);
		newNode.setData(data);
		head = newNode;
	}

	public void display()
	{
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.getData() +"->");
			ptr = ptr.getNext();
		}
	}

	public void makeLoop()
	{
		Node ptr = head;
		while(ptr.getNext() != null) {
			ptr = ptr.getNext();
		}
		ptr.setNext(head.getNext().getNext().getNext());
	}

	public boolean detectLoop()
	{
		Node slow = head;
		Node fast = head;
		while(fast != null && slow != null){
			slow = slow.getNext();
			if(fast.getNext() == null) {
				fast = null;
			} else {
				fast = fast.getNext().getNext();
			}
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}

class DetectLoopInList
{
	public static void main(String... strings)
	{
		LinkList linkKist = new LinkList();
		linkKist.push(3);
		linkKist.push(6);
		linkKist.push(9);
		linkKist.push(12);
		linkKist.push(15);
		linkKist.display();
		linkKist.makeLoop();
		System.out.println();
		if(linkKist.detectLoop() == true) {
			System.out.println("Loop is present");
		} else {
			System.out.println("Loop is not present");
		}
	}
}