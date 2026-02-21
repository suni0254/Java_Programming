package seleniumPractice;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//Excel File -> Workbook -> Sheet -> Row -> Cell
public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception{

        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\ReadFromSelenium.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet1 = workbook.getSheet("Sheet1");

        int noOfRow = sheet1.getLastRowNum();
        int noOfCell = sheet1.getRow(0).getLastCellNum();

        System.out.println("No. of Rows : " + noOfRow+ " No. of cells : " + noOfCell);

        for(int r=0; r<=noOfRow; r++) {
            XSSFRow currRow = sheet1.getRow(r);
            for(int c=0; c<noOfCell; c++) {
                System.out.print(currRow.getCell(c) + "\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();


        FileOutputStream writeFile = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\writeFile.xlsx");

        Scanner sc = new Scanner(System.in);

        int noOfRows = sc.nextInt();
        int noOfColumns = sc.nextInt();

        XSSFWorkbook workbook1 = new XSSFWorkbook();

        XSSFSheet writeData = workbook1.createSheet();

        for(int r=0; r<noOfRows; r++) {

            XSSFRow currRow = writeData.createRow(0);

            for(int c=0; c<noOfColumns; c++) {
                System.out.print("Enter value for Row : " + r + " Column : " + c);
                currRow.createCell(c).setCellValue(sc.next());
            }
        }

        workbook1.write(writeFile);

        writeFile.close();
        workbook1.close();


        System.out.println("Created file");

    }
}
