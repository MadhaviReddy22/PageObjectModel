package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC009 extends GenericWrappers {
	
	@Test
	public void irctcSignup () {
		
		invokeApp("chrome", "https://www.ftr.irctc.co.in/ftr/");
		waitProperty(3000);
		
		clickByLink("New User? Signup");
        waitProperty(2000);
		
		enterById("userId", "MReddy_22");
		enterById("password", "LetMeIn22");
		enterById("cnfPassword", "LetMeIn22");
		
		selectValueById("secQstn", "0");//select security question from the drop down
		waitProperty(2000);
		enterById("secAnswer", "NalaR");
		
		clickById("dateOfBirth"); //click on DOB field
		
		selectVisibleTextByXpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]", "1980"); //select year from Year drop down
		selectVisibleTextByXpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]", "Apr"); //select month from Month drop down
		clickByXpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a"); //select date from the calendar
		
		waitProperty(2000);
		
		clickById("gender1");
		clickById("maritalStatus0");
		enterById("email", "m_madhu@gmail.com");
		
		//clickById("occupation");
		selectValueById("occupation", "Professional"); //select occupation from the drop down
		waitProperty(2000);
		
		enterByName("fname", "Madhavi");
		enterByName("mname", "M");
		enterByName("lname", "Reddy");
		
		//clickById("natinality");
		selectValueById("natinality", "94"); // select nationality from the drop down
		waitProperty(2000);
		
		enterById("flatNo", "101");
		enterById("street", "Residential Street");
		enterById("area", "Vidyanagar");
		
		//clickById("country");
		selectValueById("country", "94"); // select country from the drop down
		waitProperty(2000);
		
		enterById("mobile", "9000331122");
		enterById("pincode", "500085");
		
		//waitProperty(2000);
		scrollPageDown("//html/body"); //Scroll the page down
		
		waitProperty(2000);
				
		selectValueById("city", "Hyderabad");
		waitProperty(2000);
		selectValueById("state", "ANDHRA PRADESH");
		waitProperty(2000);
		selectValueById("postOffice", "Jntu Kukat Pally S.O");
		//waitProperty(2000);
		
		scrollPageDown("//html/body"); //Scroll the page down
		waitProperty(3000);
		
		clickById("sameAddresses1"); //select No for communication address same as residential address question
		
		waitProperty(1000);
		
		enterById("flatNoOffice", "1000");
		enterById("streetOffice", "Commercial Street");
		enterById("areaOffice", "Hi-tech City");
		
		selectValueById("countryOffice", "94");
		waitProperty(2000);
		enterById("mobileOffice", "9900113323");
		enterById("pincodeOffice", "500085");
		
		scrollPageDown("//html/body"); //Scroll the page down
		waitProperty(2000);
		
		selectValueById("cityOffice", "Hyderabad");
		waitProperty(2000);
		selectValueById("stateOffice", "ANDHRA PRADESH");
		waitProperty(2000);
		selectValueById("postOfficeOffice", "Jntu Kukat Pally S.O");
		
		waitProperty(2000);
		
		closeAllBrowsers();
	}
	
}

		
		

