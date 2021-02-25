package string.example;
import java.util.*;
public class Rev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.nextLine();
		String[] ar = name.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				String temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
