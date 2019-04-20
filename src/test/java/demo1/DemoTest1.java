package demo1;

class DemoTest1{  
		 public static void main(String args[]){  
		  try{  
		    try{  
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }catch(ArithmeticException e){System.out.println(e);}  
		   
		     
		    int a[]=new int[5];  
		    a[5]=4;  
		   
		     
		    System.out.println(a[5]);  
		  }catch(Exception e){System.out.println("handeled");}  
		  
		  System.out.println("normal flow..");  
		 }  
		}  
