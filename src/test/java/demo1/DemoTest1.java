package demo1;

import org.testng.annotations.Test;

public class DemoTest1 {

	
	@Test
	public static void arrayPrint() {
		
		
		int ar1[] = new int[2];
				ar1[0]=1;
		ar1[1]=2;
		
		
		for(int st1 :ar1)
		{
			System.out.println(st1);
		}
			
			
			
			
			
	}
	
	
	
}
