import java.util.*;

public class DblyLinkedList {

	static int n;
	Node head;
	
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data = d;
			prev = null;
			next = null;
		}
	}
	
	public static void insert(DblyLinkedList l1, int data)
	{
		Node newNode = new Node(data);
		
		if(l1.head == null)
		{
			l1.head = newNode;
			newNode.prev = null;
			newNode.next = null;
		}
		else
		{
			Node current = l1.head;
			
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
			newNode.next = null;
		}
	}
	
	public static void display(DblyLinkedList li)
	{	
		Node current = li.head;
		System.out.println("The LinkedList is as follows: ");
		
		while(current.next != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}
	
	public static void displayrev(DblyLinkedList li)
	{	
		Node current = li.head;
		System.out.println("The LinkedList is as follows: ");
		
		while(current.next != null)
		{
			current = current.next;
		}
		while(current != li.head)
		{
			System.out.println(current.data);
			current = current.prev;
		}
		System.out.println(current.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		int i,ele,n;
		String s = new String();
		
		DblyLinkedList li = new DblyLinkedList();
			
		System.out.println("Enter the number of elements to insert");
		n = S.nextInt();
		System.out.println("Enter the elements");
			for(i=0;i<n;i++)
			{
					ele = S.nextInt();
					insert(li,ele);
			}	
			
					
			if(li.head != null)
			{
				displayrev(li);			
			}
							
			else
				System.out.println("No list!");
			
		}
	}


