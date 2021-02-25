package Pattern;

public class Zero {
	public static void main(String[] args) {
		int x =0;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=x;k>=0;k--)
			{
				System.out.print(k);
			}
			
			for(int l=1;l<i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
			x=x+1;
		}
	}

}
