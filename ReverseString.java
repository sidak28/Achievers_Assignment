import java.util.Scanner;

public class Specialstring{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		int l=0;
		int h=arr.length-1;
		while(l<h) {
			if(!(arr[l]>='a'&&arr[l]<='z')) {
				l++;
				continue;
			}
			if(!(arr[h]>='a'&&arr[h]<='z')) {
				h--;
				continue;
			}
			char temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
		str = new String(arr);
		System.out.println(str);
	}
}