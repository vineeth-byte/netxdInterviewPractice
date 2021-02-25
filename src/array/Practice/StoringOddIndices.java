package array.Practice;

public class StoringOddIndices {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60,70,80};
		int[] br = new int[ar.length/2];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i%2!=0)
			{
				br[j]=ar[i];
				j++;
			}
		}
		for(int i=0;i<br.length;i++)
		{
			System.out.print(br[i]+" |");
		}
	}

}
