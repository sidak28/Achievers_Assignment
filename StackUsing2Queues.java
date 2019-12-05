import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class StackUsing2Queues 
{
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();
		public static void push(int data)
		{
			while (!q1.isEmpty())
			{
				q2.add(q1.poll());
			}
			q1.add(data);
			while (!q2.isEmpty()) 
			{
				q1.add(q2.poll());
			}
		}
		public static void pop() 
		{
			q1.poll();
		}
		public static void display() 
		{
			System.out.println("The stack is:" + q1);
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			StackUsing2Queues s = new StackUsing2Queues();
			s.push(1);
			s.push(2);
			s.push(3);
			display();
			s.pop();
			display();
		}
	}