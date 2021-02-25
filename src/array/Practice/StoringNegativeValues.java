package array.Practice;

public class StoringNegativeValues {
public static void main(String[] args) {
	int[] a = {10,-20,-30,40,-60,-80,88,90,-9};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<0)
		{
			count++;
		}
	}
	int[] b = new int[count];
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<0)
		{
			b[j]=a[i];
			j++;
		}
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" |");
	}
}
}
