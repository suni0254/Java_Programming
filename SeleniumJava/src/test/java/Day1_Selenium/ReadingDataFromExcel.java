package Day1_Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File---->Workbook--->Sheets----->Rows---->Cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\ReadFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("number of rows: "+rows);	//3===Rows are counting from 0
		System.out.println("number of cells: "+cells);	//4===As per Excel Cells are counting from 1 but as per java  count take from 0
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell curtCell = currentRow.getCell(c);
				System.out.print(curtCell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}
}
