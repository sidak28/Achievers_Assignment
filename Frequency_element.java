import java.util.Scanner;


public class Frequency_element {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of array :");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j] && a[j]!=0)
                {
                    c++;
                    a[j]=0;
                }
            }
            if(a[i]!=0)
            {
                System.out.println(a[i]+":-> "+c);
            }
        }
        
    }
    
}