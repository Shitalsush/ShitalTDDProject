package TestNGDemo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		ExcelReader obj= new ExcelReader();
		obj.getData();
	}
	
	public Object[][] getData() throws IOException {
		String filePath = "./src/test/java/TestNGDemo/TestData.xlsx";
		String sheetName = "data";
		
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet(sheetName);
		
//		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//		
//		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row Count is = " +rowCount);
		System.out.println("Cell count is = "+cCount);
		
		Object[][] data = new Object[rowCount][cCount];
		for(int row=0;row<rowCount;row++)
		{
			for(int col=0;col<cCount;col++)
			{
				//System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
				data[row][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			}
		}
		return data;
		
	}
}
