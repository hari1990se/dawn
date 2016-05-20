import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class LinkedList
{
	static Node prev = null;
	static Node head;
	void insert(int data)
	{
		Node newNode = new Node(data);
		if(prev == null)
		{
			prev = newNode;
			head = newNode;
		}
		else
		{
			prev.next = newNode;
			prev = newNode;
		} 
	}
	void display()
	{
		Node ptr = head;
		while(ptr != null)
		{
			System.out.print(ptr.data +"->");
			ptr = ptr.next;
		}
	}
}

class LinkedListDemo
{
	public static void main(String... strings)
	{
		LinkedList linkedList = new LinkedList();
		int data;
		int choice;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		while(flag)
		{
			System.out.println("Enter 1 for insertion\nEnter 2 for exit");
			choice = scanner.nextInt();
			System.out.println("Choice = " +choice);
			switch(choice)
			{
				case 1:
					System.out.print("Enter data: ");
					data = scanner.nextInt();
					linkedList.insert(data);
					break;
				case 2:
					flag = false;
					break;
				default:
					System.out.println("Please enter right option");
					break;
			}
		}
		linkedList.display();
	}
}