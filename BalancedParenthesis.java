import java.util.Stack;
import java.util.Scanner;
public class Question3{
	public static void main(String args[])
	{
		 Scanner in = new Scanner(System.in);
		    String expression = in.nextLine();
		    boolean output = CheckForBalanced(expression);
		    if (output) { System.out.println("Balanced");}
		    else { System.out.println("Not Balanced");}
	}
	public static boolean CheckForBalanced(String expression) {
		  if ((expression.length() % 2) == 1) return false;
		  else {
		    Stack<Character> s = new Stack<>();
		    for (char bracket : expression.toCharArray())
		      switch (bracket) {
		        case '{': s.push('}'); break;
		        case '(': s.push(')'); break;
		        case '[': s.push(']'); break;
		        default :
		          if (s.isEmpty() || bracket != s.peek()) { return false;}
		          s.pop();
		      }
		    return s.isEmpty();
		  }
		}
}
