package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC002 extends GenericWrappers {
		
	@Test
	public void bookYourCoach() {
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button"); // Click OK on the Alert
		waitProperty(3000);
		
		clickByLink("HOLIDAYS"); // Click on Holidays link on top menu bar
		waitProperty(3000);
		
		clickByLink("Stays"); //Select Stays from the menu
		waitProperty(3000);
		
		clickByLink("Lounge"); //Select Lounge from the menu
		waitProperty(3000);
		
		switchToLastWindow(); //Switch to next window
		waitProperty(3000);
		
		clickByXpath("//*[@id=\"sidebarCollapse\"]"); // Click on the Menu Icon at the top right 
		waitProperty(2000);
		
		clickByLink("Book Your Coach/Train"); //Select Book your coach/train option
		waitProperty(3000);
		
		switchToLastWindow(); //Switch to next window
		waitProperty(3000);
		
		clickByLink("New User? Signup"); //Click on New User Sign up link
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

