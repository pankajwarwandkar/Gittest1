package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelReader1 {

	
	//public static FileInputStream fis;
	//public static Workbook wb;
	
	public static Object[][] readDataFromXcel(String Filename)
	{
	
		
			FileInputStream fis=null;;
			try {
				fis = new FileInputStream(Filename);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Workbook wb=null;
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    Sheet sheet=wb.getSheet("Sheet");
		               int rownum= sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		               int cellnum =sheet.getRow(0).getLastCellNum();
		           
		               
		               String data[][]  = new String[rownum][cellnum];
		            	   for(int i=0;i<=rownum;i++)
		           
		               {
		            	   
		            	   for(int j=0;j<=cellnum;j++)
		            		   
		            	   {
		            		   
		            	 data[i] [j]=sheet.getRow(i).getCell(j).getStringCellValue().toString();
		            	   
		            	   System.out.println(data[i][j]+" ");
		            	   
		            	   }
		            	         
		               }
						return data;
		
		       
	}

	
	public static void main(String srgs[])
	{
	
		
		
		XcelReader1.readDataFromXcel(System.getProperty("C:\\Users\\Vaio\\Desktop\\demo.xlsx"));
}
	}