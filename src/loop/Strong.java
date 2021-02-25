package loop;
import java.util.Scanner;
public class Strong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		int s = x;
		int sum = 0;
		while(s>0)
		{
			int n=s%10;
			int sum1 = 1;
			for(int i=n;i>0;i--)
			{
				sum1 = sum1*i;
			}
			sum = sum+sum1;
			s=s/10;
		}
		if(x==sum)
		{
			System.out.println("number is strong number");
		}
		else
		{
			System.out.println("this is not strong number");
		}
	}

}
