package array.example;

import java.util.ArrayList;

public class CtoA {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("vineeth");
		a1.add("mukesh");
		a1.add("aakash");
		a1.add("anu");
		
		String[] ar = new String[a1.size()];
		a1.toArray(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
