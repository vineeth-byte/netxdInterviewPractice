package loop;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		int y =2;
		boolean flag = true;
		while(y<=x)
		{
			if(x%y==0)
			{
				System.out.println("not a prime");
				flag = false;
				break;
			}
			y++;
		}
		if(flag==true)
		{
			System.out.println("prime number");
		}
		
	}

}
