package demo1;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class StringSplit {
	
	@Test(priority=0)
	public static void readMap()
	{
		
	TreeMap<Integer, String> st= new TreeMap<Integer,String>();
		st.put(1,"Pankaj");
		st.put(2,"Parag");
		st.put(3,"rahul");
		
		for(Entry<Integer, String> mp:st.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}

	}
	
	@Test(priority =1)
	public static void readTree()
		{
			
			HashMap<Integer, String> hm= new HashMap<Integer,String>();
				hm.put(1,"India");
				hm.put(2,"austr");
				hm.put(3,"usa");
				
				for(Entry<Integer, String> hs:hm.entrySet())
				{
					System.out.println(hs);
				}
	}
}
