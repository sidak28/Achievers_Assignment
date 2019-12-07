import java.util.Scanner;

public class HighestPrimeFactor
{
	public static boolean primeDivisor(int d)
	{
		int ct=0;
		for(int i=1;i<=d;i++)
		{
			if(d%i==0)
				ct++;
		}
		if(ct==2)
			return true;
		
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int res=0;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(primeDivisor(i))
				{
					res=i;
				}
			}		
		}
		System.out.println("Highest Prime: "+res);
	}
