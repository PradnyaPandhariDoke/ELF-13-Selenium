package genericLibrary;

import java.util.Date;

public class Demo {
	public static void main(String[] args) throws Exception {
		
	


	ExcelUtil ex=new ExcelUtil();
	double data = ex.getNumericCellValue("./TestData/data4.xlsx", "Sheet1", 2, 0);
	int data1 = ex.getNumericCellValue1("./TestData/data4.xlsx", "Sheet1", 1, 0);
	String data2 = ex.getStringCellValue("./TestData/data4.xlsx", "Sheet1", 0, 0);
	Date data3 =  ex.getDateCellValue("./TestData/data4.xlsx", "Sheet1", 3, 0);
	System.out.println(data);
	System.out.println(data1);
	System.out.println(data2);
	System.out.println(data3);
	String[][] array = ex.getMultipleData("./TestData/data4.xlsx", "Sheet1");
	for (String[] strings : array) {
		for (String[] strings2 : array) {
			System.out.println(strings2.toString());
		}
		
	}
	}
	}
	

