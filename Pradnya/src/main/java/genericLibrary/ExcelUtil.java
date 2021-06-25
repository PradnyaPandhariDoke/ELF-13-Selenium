package genericLibrary;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelUtil {
	public double getNumericCellValue(String path,String sheetName,int row,int cell) throws Exception {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		double data = workbook.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}
	public int getNumericCellValue1(String path,String sheetName,int row,int cell) throws Exception {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		int data = (int) workbook.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}
	public String getStringCellValue(String path,String sheetName,int row,int cell) throws Exception {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public Date getDateCellValue(String path,String sheetName,int row,int cell) throws Exception {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Date date = workbook.getSheet(sheetName).getRow(row).getCell(cell).getDateCellValue();
		return date;
	}
	public String[][] getMultipleData(String path,String sheetName) throws Exception {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount =sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		String [][] str=new String [rowCount][cellCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				try {
					str[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				} catch (Exception e) {
				}
			}
		}
		return str;
	}
}
