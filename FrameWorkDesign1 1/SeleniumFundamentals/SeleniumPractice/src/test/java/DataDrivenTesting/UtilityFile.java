package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilityFile {

    public static FileInputStream fileInput;
    public static FileOutputStream fileOutput;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static XSSFCellStyle cellstyle;

    public static int getRowCount(String xlFile, String sheetName) throws IOException {
        fileInput = new FileInputStream(xlFile);
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        fileInput.close();
        workbook.close();

        return rowCount;
    }

    public static int colCount(String xlFile, String sheetName, int rowNum) throws IOException{
        fileInput = new FileInputStream(xlFile);
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        int colCount = row.getLastCellNum();
        workbook.close();
        fileInput.close();

        return colCount;
    }

    public static String getCellData(String xlFile, String sheetName, int rowNum, int cellNum) throws IOException{
        fileInput = new FileInputStream(xlFile);
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        cell = row.getCell(cellNum);

        String cellData;

        try {
            cellData = cell.toString();
        }
        catch (Exception e) {
            cellData = "";
        }

        workbook.close();
        fileInput.close();

        return cellData;
    }

    public static void setCellData(String xlFile, String sheetName, int rowNum, int cellNum, String data) throws IOException{
        fileInput = new FileInputStream(xlFile);
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        cell = row.createCell(cellNum);
        cell.setCellValue(data);
        fileOutput = new FileOutputStream(xlFile);
        workbook.write(fileOutput);
        workbook.close();
        fileInput.close();
        fileOutput.close();
    }
}
