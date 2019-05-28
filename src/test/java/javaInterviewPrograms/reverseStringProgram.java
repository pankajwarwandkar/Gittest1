package javaInterviewPrograms;

public class reverseStringProgram {


public static void main(String args[])
{
	String inputString="java";
	
	           char[]ch=inputString.toCharArray();        	
		for(int i=ch.length-1;i<=0;i--)
		{
     System.out.print(ch[i]);
		}
	}
		



}