import java.util.*;
class Node2{
	Node2 left,right;
	int key;
	Node2(int item){
		key=item;
		left=right=null;
	}
}

public class MirrorTree {
	static Node2 root;
	MirrorTree(){
		root=null;
	}
	MirrorTree(int key){
		root =new Node2(key);
	}
	
	boolean check(Node2 root,Node2 root1){
		if(root1==null && root==null)
			return true;
		if(root!=null && root1!=null && root.key==root1.key)
			return (check(root.left,root1.right) && check(root.right,root1.left));
		return false;
		
	}
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		MirrorTree tree=new MirrorTree();
		tree.root=new Node2(1);
		tree.root.left=new Node2(2);
		tree.root.right=new Node2(2);
		tree.root.left.left=new Node2(3);
		tree.root.left.right=new Node2(4);
		tree.root.right.left=new Node2(4);
		tree.root.right.right=new Node2(3);
		boolean output=tree.check(root,root);
		if(output==true)
			System.out.print("Tree is Mirror of itself");
		else
			System.out.print("Tree is not Mirror of itself");
	}
}