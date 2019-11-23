import java.util.*;

public class SubArrayWindow {
    public static void main(String args[])
    {
        int max=0;
    Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=input.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter subarray size");
        int s=input.nextInt();

        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<=size;j++)
            {
                int demo=j-i;
                if(demo==s)
                {
                for(int z=i;z<j;z++)
                {
                       max=0;
                       for(int l=i;l<j;l++)
                       {
                           if(arr[l]>max)
                           {
                               max=arr[l];
                           }
                       }

                }
                System.out.print(max+" ");
                }
            }
        }
    }

}