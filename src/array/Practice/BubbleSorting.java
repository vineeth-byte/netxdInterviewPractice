package array.Practice;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60,70,80};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" |");
		}
	}

}
