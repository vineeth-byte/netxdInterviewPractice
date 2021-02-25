package loop;

public class Fibo {
	public static void main(String[] args) {
		int n=13;
		int f = 0;
		int s= 1;
		find(f,s,n);
	}
	static void find(int f,int s,int n)
	{
		while(n>0)
		{
			System.out.println(f);
			int t = f+s;
			f=s;
			s=t;
			n--;
		}
	}

}
