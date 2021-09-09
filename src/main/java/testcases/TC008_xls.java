package testcases;

import org.testng.annotations.Test;

import utils.DP008xls;
	import wrappers.GenericWrappers;

	public class TC008_xls extends GenericWrappers {
		
		@Test(dataProvider = "fetchData", dataProviderClass = DP008xls.class)
		public void panIndiaApp(String Title, String FirstName, String MiddleName, String LastName, String FatherFName, String FatherMName, String FatherLName, String MobileNo,
				String Email, String SourceOfIncome, String DOB, String Address1, String Address2, String City, String State, String Pincode, String Country,
				String OfficeName, String OffAddress1, String OffAddress2, String OffCity, String OffState, String OffPincode, String OffCountry,
				String IDProof, String AddressProof, String DOBProof, String AdharProof, String OffAddressProof) {
			
			invokeApp("chrome", "https://panind.com/india/new_pan/");
			waitProperty(3000);
			
			selectValueById("pan_title", Title);
			waitProperty(2000);
			
			enterById("pan_firstname", FirstName);
			enterById("pan_middlename", MiddleName);
			enterById("pan_lastname", LastName);
			enterById("pan_fatherfirstname", FatherFName);
			enterById("pan_fathermiddlename", FatherMName);
			enterById("pan_fatherlastname", FatherLName);
			enterById("pan_mobilenumber", MobileNo);
			enterById("pan_email", Email);
			
			selectValueById("pan_sourceofincome", SourceOfIncome);
			waitProperty(2000);
			
			clickById("office");
			enterById("pan_dob", DOB);
			waitProperty(3000);
			
			enterById("pan_addressline1", Address1);
			enterById("pan_addressline2", Address2);
			enterById("pan_cityname", City);
			
			selectValueById("pan_state", State);
			waitProperty(2000);
			
			scrollPageDown("//html/body");
			waitProperty(3000);
			
			enterById("pan_pincode", Pincode);
			selectValueById("pan_country", Country);
			waitProperty(2000);
			
			enterById("pan_officename", OfficeName);
			enterById("pan_officeaddressline1", OffAddress1);
			enterById("pan_officeaddressline2", OffAddress2);
			enterById("pan_officecityname", OffCity);
			
			selectValueById("pan_officestate", OffState);
			waitProperty(2000);
			
			enterById("pan_officepincode", OffPincode);
			selectValueById("pan_officecountry", OffCountry);
			waitProperty(2000);
			
			scrollPageDown("//html/body");
			waitProperty(3000);
			
			selectValueById("pan_identityproof", IDProof);
			waitProperty(2000);
			selectValueById("pan_addressproof", AddressProof);
			waitProperty(2000);
			selectValueById("pan_DOBproof", DOBProof);
			waitProperty(2000);
			selectValueById("pan_aadhaarproof", AdharProof);
			waitProperty(2000);
			selectValueById("pan_officeaddressproof", OffAddressProof);
			waitProperty(2000);
			
			clickById("pan_source");
			
			//clickByXpath("//*[@id=\"msform\"]/div[16]/div[2]/input[2]");
			
			closeAllBrowsers();
			
			}

	}


