package array.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList  a1 = new ArrayList ();
		a1.add(new Emp(1,"vineeth","chennai"));
		a1.add(new Emp(2,"vidhya","kerala"));
		a1.add(new Emp(3,"devika","delhi"));
		a1.add(new Emp(4,"gopika","bangalore"));
		 
	 
		
		ListIterator ii = a1.listIterator();
		while(ii.hasNext())
		{
			 
			Emp s = (Emp)ii.next();
			if(s.eName.equals("vineeth"))
			{
				ii.remove();
			}
		}
		ListIterator ir = a1.listIterator();
		while(ir.hasNext())
		{
			 
			Emp s = (Emp)ir.next();
			 System.out.println(s.eid+" "+s.eName+" "+s.eAddress);
		}
	}

}
