package Collections_Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Assignment_1 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> h1 = new TreeMap<Integer, String>();
		h1.put(1, "mango");
		h1.put(2, "apple");
		h1.put(3, "orange");
		h1.put(4,"pine apple");
		h1.put(5, "jackfruit");
		h1.put(6, "banana");
		h1.put(7, "cucumber");
		h1.put(8, "water melon");
		h1.put(9, "grapes");
		h1.put(10, "sapota");
		
		System.out.println(h1);
		 for (Integer key : h1.keySet()) 
		 {
	            System.out.println(key + ":\t" + h1.get(key));
		 }
		 System.out.println(h1.remove(4));
		 System.out.println(h1.remove(7));
		 System.out.println(h1.containsValue("banana"));
		 System.out.println(h1.containsValue("apple"));
		 System.out.println(h1.containsKey(4));
		 System.out.println(h1.hashCode());
		 //h1.clear();
		 System.out.println(h1);
		 
	}


}
