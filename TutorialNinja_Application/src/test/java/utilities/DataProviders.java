package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	//Data Provider1
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path = "./testData//Opencart_LoginData.xlsx";		//Taking Excel file from TestData
		ExcelUtility xlUtil = new ExcelUtility(path);				//Creating Object for excel utility
		
		int totalRows = xlUtil.getRowCount("Sheet1");
		int totalCells = xlUtil.getCellCount("Sheet1", 0);	//Here we can place any row number i.e 0/1/2 etc
		
		String logindata[][] = new String[totalRows][totalCells];		//Creating two dimensional array to store excel data
		for(int i=1;i<=totalRows;i++)		//1 
		{
			for(int j=0;j<totalCells;j++)		//0
			{
				logindata[i-1][j] = xlUtil.getCellData("Sheet1", i, j);
			}
		}
		return logindata;
	}



}
