import java.util.Scanner;
public class PalindromeLL {
	Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void insert(int d)
	{
		Node newnode=new Node(d);
		newnode.next=null;
		
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node last;
			last=head;
			while(last.next!=null)
			{
				last=last.next;
				
			}
			last.next=newnode;
		}
	}
	public void check()
	{
		int orignal=0;
		int rev=0;
		int var=1;
		Node temp=head;
		while(temp!=null)
		{
			orignal=orignal*10+temp.data;
			rev=rev+temp.data*var;
			var*=10;
			temp=temp.next;
			
		}
		if(orignal==rev)
		{
			System.out.println("No is Palindrome");
		}
		else
			System.out.println("No is not Palindrome");
		
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	PalindromeLL li =new PalindromeLL();
	System.out.println("Enter no of elements");
	int n=sc.nextInt();
	System.out.println("Enter elements");
	for(int i=0;i<n;i++)
	{
		int a=sc.nextInt();
		li.insert(a);
	}
li.check();
	}

}