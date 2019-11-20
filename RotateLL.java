import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public class RotateLL {
	static Node head;
	public static Node insert(int d){
		Node n=new Node(d);
		if(head==null)
			head=n;
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
		return head;
	}
	public static Node rotate(int k){
		if(k==0)
			return head;
		Node current=head;
		int count=1;
		while(count<k&&current!=null){
			current=current.next;
			count++;
		}
		if(current==null)
			return head;
		Node n1=current;
		while(current.next!=null)
			current=current.next;
		current.next=head;
		head=n1.next;
		n1.next=null;
		return head;
	}
	public static void display(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of nodes you want in linked list: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("Enter data: ");
			int d=sc.nextInt();
			insert(d);
		}
		System.out.print("Enter number of rotations of linkedlist: ");
		int k=sc.nextInt();
		if(k<=n){
		rotate(k);
		display(head);
		}
		else{
			System.out.println("Number of Nodes are less in linked list");
		}
	}
}