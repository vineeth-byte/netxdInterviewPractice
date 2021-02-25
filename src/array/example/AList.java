package array.example;

import java.util.ArrayList;
import java.util.Iterator;

public class AList {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("vineeth");
		a1.add("vidhya");
		a1.add("devika");
		a1.add("gopika");
		a1.add("shyam");
		a1.add("abi");
		a1.add(27);
		a1.add(24);
		a1.add(22);
		a1.add(14);
	//	System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		a2.add("all values are added");
		//System.out.println(a2);
		Iterator  ii = a1.iterator();
	//	while(ii.hasNext())
		{
		// 	System.out.println(ii.next());
		}
	//	for(Object s : a1)
		{
		//	System.out.println(s);
			 
		}
		
		System.out.println("getting "+a1.get(2));
		a1.set(2, "iyyooo");
		System.out.println("after setting "+a1.get(2));
		
	}

}
