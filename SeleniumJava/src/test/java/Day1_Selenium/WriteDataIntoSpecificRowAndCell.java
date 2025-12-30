package Day1_Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\CustomisedData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =  workbook.createSheet("CustomData");
		
		XSSFRow curtRow = sheet.createRow(3);
		XSSFCell cell = curtRow.createCell(4);
		cell.setCellValue("Welcome");
		
		System.out.println("File is created");
		
		workbook.write(file);
		workbook.close();
		file.close();
	}
}
