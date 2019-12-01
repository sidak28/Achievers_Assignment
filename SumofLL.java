import java.util.Scanner;

public class sum_of_list {
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	Node root;
	
	sum_of_list()
	{
		root=null;
	}
	
	void insert(int data)
	{
		if(root==null)
			root=new Node(data);
		
		Node temp=new Node(data);
		temp.next=root;
		root=temp;
		
	}
	
	void get_sum_list(Node root1,Node root2)
	{
		sum_of_list obj3=new sum_of_list();
	    int num=0,num1=0;	
		while(root1.next!=null)
		{
			num=num*10+root1.data;
			root1=root1.next;
		}
		while(root2.next!=null)
		{
			num1=num1*10+root2.data;
			root2=root2.next;
		}
		num1=num+num1;
		while(num1!=0)
		{
			int a=num1%10;
			num=num*10+a;
			num1=num1/10;
		}
		//System.out.println(num);
		while(num!=0)
		{
			int a=num%10;
			obj3.insert(a);
			num=num/10;
		}
		
		obj3.print(obj3.root);
		
		
	}

	void print(Node root)
	{
		Node temp=root;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		sum_of_list obj=new sum_of_list();
		sum_of_list obj1=new sum_of_list();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no elements");
		int n=sc.nextInt();
		System.out.println("enter elemenst");
		for(int i=0;i<n;i++)
		{
			obj.insert(sc.nextInt());
		}
		obj.print(obj.root);
		
		System.out.println("enter the number of elements");
		int m=sc.nextInt();
		System.out.println("enter elemenst");
		for(int i=0;i<m;i++)
		{
			obj1.insert(sc.nextInt());
		}
		
		obj1.print(obj1.root);
		System.out.println();
		obj.get_sum_list(obj.root,obj1.root);
	}

}