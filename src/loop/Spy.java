package loop;

public class Spy {
	public static void main(String[] args) {
		int number = 1124;
		int sum = 0;
		int multiply = 1;
		while(number>0)
		{
			int n = number%10;
			sum = sum+n;
			multiply = multiply*n;
			number = number/10;
		}
		if(sum==multiply)
		{
			System.out.println("the given number is spy");
		}
		else
		{
			System.out.println("this is not spy number");
		}
	}

}
