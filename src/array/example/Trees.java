package array.example;

import java.util.Set;
import java.util.TreeMap;

public class Trees {
	public static void main(String[] args) {
		TreeMap<EmpMap,StudentMap> h1 = new TreeMap<EmpMap,StudentMap>();
		h1.put(new EmpMap(1,"vineeth"), new StudentMap(11,"mukesh"));
		h1.put(new EmpMap(2,"arun"), new StudentMap(22,"siranjeevi"));
		h1.put(new EmpMap(3,"vivek"), new StudentMap(44,"yeshwanth"));
		h1.put(new EmpMap(4,"pavithra"), new StudentMap(44,"lakshmi"));
		Set<EmpMap> s = h1.keySet();
		for(EmpMap ss : s)
		{
			System.out.println(ss.id+" "+ss.eName);
		}
	}

}
