package array.Practice;

public class BinarySearching {
public static void main(String[] args) {
	int[] ar = {10,20,30,40,50,60,70};
	int key = 30;
	int min = 0;
	int max = ar.length-1;
	while(min<=max)
	{
		int avg = (min+max)/2;
		if(ar[avg]==key)
		{
			System.out.println("got the number");
			break;
		}
		else if(ar[avg]>key)
		{
			max=avg-1;
		}
		else
		{
			min = avg+1;
		}
	}
	if(min>max)
	{
		System.out.println("number not found");
	}
}
}
