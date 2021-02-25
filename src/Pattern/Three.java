package Pattern;

public class Three {
	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=x;k>0;k--)
			{
				System.out.print(k);
			}
			x=x+2;
			System.out.println();
			
		}
	}

}
