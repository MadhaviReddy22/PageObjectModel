package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC008 extends GenericWrappers {
	
	@Test
	public void panIndiaApp() {
		
		invokeApp("chrome", "https://panind.com/india/new_pan/");
		waitProperty(3000);
		
		selectValueById("pan_title", "2");
		waitProperty(2000);
		
		enterById("pan_firstname", "Nala");
		enterById("pan_middlename", "M");
		enterById("pan_lastname", "Reddy");
		enterById("pan_fatherfirstname", "Ajay");
		enterById("pan_fathermiddlename", "M");
		enterById("pan_fatherlastname", "Reddy");
		enterById("pan_mobilenumber", "9800775643");
		enterById("pan_email", "nalareddy@gmail.com");
		
		selectValueById("pan_sourceofincome", "1");
		waitProperty(2000);
		
		clickById("office");
		enterById("pan_dob", "07071991");
		waitProperty(2000);
		
		enterById("pan_addressline1", "1000");
		enterById("pan_addressline2", "Home Street");
		enterById("pan_cityname", "Hyderabad");
		
		selectValueById("pan_state", "Telangana");
		waitProperty(2000);
		
		scrollPageDown("//html/body");
		waitProperty(3000);
		
		enterById("pan_pincode", "500312");
		selectValueById("pan_country", "INDIA");
		waitProperty(2000);
		
		enterById("pan_officename", "ABCD Inc.");
		enterById("pan_officeaddressline1", "1001");
		enterById("pan_officeaddressline2", "Office Street");
		enterById("pan_officecityname", "Hyderabad");
		
		selectValueById("pan_officestate", "Telangana");
		waitProperty(2000);
		
		enterById("pan_officepincode", "500313");
		selectValueById("pan_officecountry", "INDIA");
		waitProperty(2000);
		
		scrollPageDown("//html/body");
		waitProperty(3000);
		
		selectValueById("pan_identityproof", "4");
		waitProperty(2000);
		selectValueById("pan_addressproof", "5");
		waitProperty(2000);
		selectValueById("pan_DOBproof", "14");
		waitProperty(2000);
		selectValueById("pan_aadhaarproof", "Copy of Aadhaar Card/Letter");
		waitProperty(2000);
		selectValueById("pan_officeaddressproof", "3");
		waitProperty(2000);
		
		clickById("pan_source");
		
		//clickByXpath("//*[@id=\"msform\"]/div[16]/div[2]/input[2]");
		
		//closeAllBrowsers();
		
		
		
		
		
		
		
		
	}

}
