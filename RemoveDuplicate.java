import java.util.Scanner;

public class RemoveDuplicate {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	public RemoveDuplicate insert(RemoveDuplicate li,int data)
	{
		Node n1 =new Node(data);
		if(li.head==null)
		{
			li.head = n1;
		}
		else
		{
			Node last = li.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = n1;
		}
		return li;
	}
	public static void display(RemoveDuplicate li)
	{
		Node current = li.head;
		while(current.next!=null)
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print(current.data);
	}
	
	public static void removeDuplicate(RemoveDuplicate li) {
		int count = 0;
		Node current = li.head;
		while(current.next!=null) {
			int flag = 0;
			int a = current.data;
			Node current2 = current;
			while(current2.next!=null) {
				if(current2.next.data==a) {
					flag=1;
					break;
				}
				current2 = current2.next;
			}
			if(flag==1) {
				current2.next = current2.next.next;
			}
			if(flag==1) {
				continue;
			}
			current=current.next;
		}	
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	RemoveDuplicate li=new RemoveDuplicate();
	int n = sc.nextInt();
	for(int i=0;i<n;i++) {
		int a = sc.nextInt();
		li.insert(li, a);
	}
	li.removeDuplicate(li);
	li.display(li);
}
}