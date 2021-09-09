package utils;

import org.testng.annotations.DataProvider;

public class DP010 {
	
	@DataProvider(name = "bringData") 
	public static String [][] getData() {
		
		String[][] testdata = new String[3][3];
		
		testdata[0][0] = "Madhavi";
		testdata[0][1] = "Reddy";
		testdata[0][2] = "Madhavi@gmail.com";
		
		testdata[1][0] = "Manju";
		testdata[1][1] = "Reddy";
		testdata[1][2] = "Manju@yahoo.com";
		
		testdata[2][0] = "Manitha";
		testdata[2][1] = "Reddy";
		testdata[2][2] = "ManithaReddy@gmail.com";
		
		return testdata;
			
	}

}
