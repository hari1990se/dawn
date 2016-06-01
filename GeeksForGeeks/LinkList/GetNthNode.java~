class Node
{
	private int data;
	private Node next;

	public void setData(int data)
	{
		this.data = data;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}

	public int getData()
	{
		return this.data;
	}

	public Node getNext()
	{
		return this.next;
	}
}

class LinkList
{
	Node head;
	
	LinkList()
	{
		head = null;
	}
	
	void push(int data)
	{
		if(head == null)
		{
			head = new Node();
			head.setNext(null);
			head.setData(data);
		}
		else
		{
			Node newNode = new Node();
			newNode.setData(data);
			newNode.setNext(head);
			head = newNode;
		}
	}

	void display()
	{
		Node ptr = head;
		while(ptr != null)
		{
			System.out.print(ptr.getData() +"->");
			ptr = ptr.getNext();
		}
	}
	int getNthNode(int index) throws Exception
	{
		Node ptr = head;
		int data = 0;
		while(ptr != null && index > 0)
		{
			if(ptr == null)
			{
				throw new Exception("Ptr reached to null");
			}
			ptr = ptr.getNext();
			index--;
		}
		if(ptr != null)
		{
			data = ptr.getData();;
		}
		return data;
	}

}

class GetNthNode
{
	public static void main(String... strings) throws Exception
	{
		LinkList linkList = new LinkList();
		linkList.push(2);
		linkList.push(4);
		linkList.push(6);
		linkList.push(8);
		linkList.push(10);
		linkList.display();
		System.out.println();
		System.out.println(linkList.getNthNode(3));
	}
}