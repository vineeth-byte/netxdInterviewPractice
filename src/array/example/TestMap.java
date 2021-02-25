package array.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		LinkedHashMap<EmpMap,StudentMap> h1 = new LinkedHashMap<EmpMap,StudentMap>();
		h1.put(new EmpMap(1,"vineeth"), new StudentMap(11,"mukesh"));
		h1.put(new EmpMap(2,"arun"), new StudentMap(22,"siranjeevi"));
		h1.put(new EmpMap(3,"vivek"), new StudentMap(44,"yeshwanth"));
		h1.put(new EmpMap(4,"pavithra"), new StudentMap(44,"lakshmi"));
		
		Set<EmpMap> s = h1.keySet();
		for(EmpMap ss : s)
		{
			System.out.println(ss.id+" "+ss.eName);
		}
		
		System.out.println("************************");
		System.out.println();
		
		Collection<StudentMap> d = h1.values();
		for(StudentMap dd : d)
		{
			System.out.println(dd.id+" "+dd.sname);
		}
		
		System.out.println("****************************");
	     System.out.println();
	     
	     Set<Entry<EmpMap,StudentMap>> jj = h1.entrySet();
	   Iterator<Entry<EmpMap,StudentMap>> ii = jj.iterator();
	   while(ii.hasNext())
	   {
		   Entry<EmpMap,StudentMap> dk = ii.next();
		   EmpMap oo = dk.getKey();
		   if(oo.id==1)
		   {
			   ii.remove();
		   }
				  
	   }
	   
	     
	     
	     Set<Entry<EmpMap,StudentMap>> gh = h1.entrySet();
	     for(Entry<EmpMap,StudentMap> hh : gh)
	     {
	    	 EmpMap e = hh.getKey();
	    	 {
	    	 System.out.println(e.id+" "+e.eName);
	    	 }
	    	 
	    	 StudentMap sj = hh.getValue();
	    	 {
	    		 System.out.println(sj.id+" "+sj.sname);
	    	 }
	     }
	     
		
	}

}
