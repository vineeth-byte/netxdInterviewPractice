package array.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MMAAPP {
	public static void main(String[] args) {
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(1, "vineeth");
		h1.put(2, "aakash");
		h1.put(3, "mukesh");
		h1.put(4, "ashwin");
		h1.put(5, "ashok");
		
		System.out.println("normal");
		System.out.println(h1);
		System.out.println("***********************************");
		System.out.println();
		
		
		Set<Integer> s = h1.keySet();
		System.out.println("key");
		System.out.println(s);
		System.out.println("**********************************");
		System.out.println();
		
		Collection<String> k = h1.values();
		System.out.println("value");
		System.out.println(k);
		System.out.println("**********************************");
		System.out.println();
		
		
		Set<Entry<Integer,String>> ss = h1.entrySet();
		System.out.println("entry");
		for(Entry sk : ss)
		{
			System.out.println(sk.getKey()+" "+sk.getValue());
		}
		
		
	}

}
