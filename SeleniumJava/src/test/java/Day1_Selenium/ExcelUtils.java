package Day1_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static int getRowCount(String excFile, String excSheet) throws IOException
	{
		fi = new FileInputStream(excFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(excSheet);
		int rowCount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowCount;	
	}
	
	public static int getCellCount(String excFile, String excSheet,int rowNum) throws IOException
	{
		fi = new FileInputStream(excFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(excSheet);
		row = ws.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellCount;
	}
	
	public static String getCellData(String excFile, String excSheet,int rowNum,int colNum) throws IOException
	{
		fi = new FileInputStream(excFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(excSheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);
		
		String data;
		try
		{
			data = cell.toString();
			/*
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);	//Returns formatted value of cell as a string regardless of type
			*/
		}
		catch(Exception ex)
		{
			data ="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	public static void setCellData(String excFile, String excSheet, int rowNum, int colNum, String data) throws IOException
	{
		//Reading Excel File
		fi = new FileInputStream(excFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.createSheet(excSheet);
		row = ws.createRow(rowNum);
		//Writing Excel File
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		fo = new FileOutputStream(excFile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	public static void fillGreenColor(String excFile, String excSheet, int rowNum, int colNum) throws IOException
	{
		fi = new FileInputStream(excFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(excSheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);
		
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(excFile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	public static void fillRedColor(String excFile, String excSheet, int rowNum, int colNum) throws IOException
	{
		fi = new FileInputStream(excFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(excSheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);
		
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(excFile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();

	}


	
}
