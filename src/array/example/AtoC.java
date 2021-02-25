package array.example;

import java.util.ArrayList;

public class AtoC {
	public static void main(String[] args) {
		String[] ar = {"murugan","vinayagar","iyyappan","hanuman"};
         ArrayList a1 = new ArrayList();
         for(int i=0;i<ar.length;i++)
         {
        	 a1.add(ar[i]);
         }
         System.out.println(a1);
	}

}
