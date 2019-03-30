package collections;

import java.util.*;

import org.testng.annotations.Test;


import com.graphbuilder.struc.LinkedList;

public class ArrayListPracticeTest {

	@Test(enabled=false)
	public  void readArrayList()
	
	{
	ArrayList<String> str= new ArrayList<String>();
	str.add("Com1");
	str.add("Com2");
	str.add("Com3");
	str.add("Com4");
	
	Iterator<String> itr=str.iterator();
    
	while(itr.hasNext())
	{
	       String st  =itr.next();
	System.out.println(st);
	}
	
	}
	@Test(priority=1)
public void HashMapData()
{
	HashMap<Integer,String> hm= new HashMap<Integer,String>();
 	hm.put(12, "Col1");
 	hm.put(12, "Col1");
 	hm.put(12, "Col1");
 	
 	Set set=hm.entrySet();
 	
 	Iterator its=set.iterator(); 	
 	while(its.hasNext())
 	{
 		Map.Entry data =(Map.Entry)its.next();
 		System.out.println(data.getValue()+""+data.getKey());
 	}
	
	}
	}


	
	
