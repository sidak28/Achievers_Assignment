import java.util.*;
class LeftView
{
    public static Node root;
    static int prev_lev=0;
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static int height(Node n1)
    {
        if(n1==null)
            return 0;
        return 1+Math.max(height(n1.left),height(n1.right));
    }
    public static  void leftView(Node root)
    {
        int h=height(root);
        for(int i=1;i<=h;i++)
        {
            prev_lev=1;
            printLeftView(root,i);
        }
    }
    public static void printLeftView(Node root,int level)
    {
        if(root==null)
            return;
        if(level==1 && prev_lev==1)
        {
            System.out.println(" "+root.data);
            prev_lev++;
        }
        else
        {
            printLeftView(root.left, level-1);
            printLeftView(root.right, level-1);
        }

    }
    public static void main(String[] args) {
        LeftView t1=new LeftView();
        t1.root=new Node(1);
        t1.root.left=new Node(2);
        t1.root.right=new Node(3);
        t1.root.left.left=new Node(4);
        t1.root.left.right=new Node(5);
        t1.root.right.right=new Node(6);
        t1.root.left.right.left=new Node(7);  
        t1.root.left.right.left.right=new Node(8); 
        leftView(t1.root);
    }
}