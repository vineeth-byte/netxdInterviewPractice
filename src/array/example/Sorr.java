package array.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorr {
public static void main(String[] args) {
	ArrayList  a1 = new ArrayList ();
	a1.add("vineeth");
	a1.add("vidhya");
	a1.add("devika");
	a1.add("gopika");
	a1.add("shyam");
	a1.add("abi");
	 
	Collections.sort(a1);
	System.out.println(a1);
	Iterator ii = a1.iterator();
	while(ii.hasNext())
	{
		System.out.println(ii.next());
		
	}
}
}
