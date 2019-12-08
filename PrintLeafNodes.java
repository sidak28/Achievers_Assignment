import java.util.Scanner;
class Node
{
	Node left;
	Node right;
	int data;
	Node()
	{
		left=right=null;
	}
	Node(int d)
	{
		data=d;
	}
}
public class PrintLeafNodes {
	 static Node root;
	 PrintLeafNodes()
		{
			root=null;
		}
	 PrintLeafNodes(int data)
		{
			root=new Node(data);
		}
		public static void insert(int data)
		{
			root=insertItem(root,data);
		}
		public static Node insertItem(Node root,int data)
		{
			if(root==null)
			{
				root=new Node(data);
				return root;
			}
			else
			{
				if(data<root.data)
				{
					root.left=insertItem(root.left,data);
				}
				else
				{
					root.right=insertItem(root.right,data);
				}
			}
			return root;
		}
		public static void leafNodes(Node root)
		{
			if(root==null)
			{
				return;
			}
			 if(root.left==null && root.right==null)
			{
				System.out.print(root.data+" ");
			}
			else
			{
				leafNodes(root.left);
				leafNodes(root.right);
			}
		}
	public static void main(String[] args) {
		 PrintLeafNodes t=new  PrintLeafNodes();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of elements:");
		 int n=sc.nextInt();
		 System.out.println("Enter the elements of the tree:");
		 for(int i=0;i<n;i++)
		 {
			 int num=sc.nextInt();
			 insert(num);
		 }
		 System.out.println("The leaf nodes are:");
		 leafNodes(root);
}

}