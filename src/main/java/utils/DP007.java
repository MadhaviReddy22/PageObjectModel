package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP007 {
	
	//@Test
	@DataProvider(name="fetchData")
	public static String[][] getData() {
		
		String[][] testData = null ;
		
	/*	testData[0][0] = "Madhavi";
		testData[0][1] = "Reddy";
		testData[0][2] = "madhavi@gmail.com";
		testData[0][3] = "madhavi@gmail.com";
	
		testData[1][0] = "Padma";
		testData[1][1] = "Dasari";
		testData[1][2] = "padma@gmail.com";
		testData[1][3] = "padma@gmail.com";*/
		
		try {
			FileInputStream fis = new FileInputStream("./testData/TC007.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum();
			
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			System.out.println("Row Count "+rowCount);
			
			System.out.println("Column Count "+columnCount);
			
			testData = new String[rowCount][columnCount];
			
			for(int i=1; i<=rowCount; i++) {
				
				XSSFRow row = sheet.getRow(i);
				
				for(int j=0; j<columnCount; j++) {
					
					String cellData = row.getCell(j).getStringCellValue();
					
					
					System.out.println("The value of row "+i+" anc column "+j+" is : "+cellData);
					
					testData[i-1][j]=cellData;
					
				}
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testData;
		
	}

}
