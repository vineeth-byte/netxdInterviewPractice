package loop;

public class Factorial {
	public static void main(String[] args) {
		int x=5;
		int sum=1;
		while(x>0)
		{
			sum=sum*x;
			x--;
		}
		System.out.println(sum);
	}

}
