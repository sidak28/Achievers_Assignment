import java.util.*;

public class PrefixToPostfix {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		Stack<String> st = new Stack<String>();

		String res = "";
		String op1 = "";
		String op2 = "";

		for (int i = str.length() - 1; i >= 0; i--)
		{
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) 
			{
				String s = "";
				s = s + str.charAt(i);
				st.push(s);
			} 
			else 
			{
				if (!st.empty())
				{
					op1 = st.pop();
				}
				if (!st.empty())
				{
					op2 = st.pop();
				}
				res = op1 + op2 + str.charAt(i);
				st.push(res);
			}
		}
		System.out.println(st.pop());
	}

}