package array.Practice;
import java.util.Scanner;
public class Merge {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60};
		int[] br = {10,44};
		int len = ar.length>br.length?ar.length:br.length;
		int[] cr = new int[len];
		int small = ar.length<br.length?ar.length:br.length;
		for(int i=0;i<len;i++)
		{
			if(i<small)
			{
				cr[i]=ar[i]+br[i];
			}
			else
			{
				cr[i]=ar[i];
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(cr[i]+" |");
		}
		System.out.println();
	}

}
