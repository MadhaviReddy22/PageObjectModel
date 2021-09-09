
	package testcases;

	import org.testng.annotations.Test;
    import utils.DP002;
    import wrappers.GenericWrappers;

	public class TC002_xls extends GenericWrappers {
			
		@Test(dataProvider = "fetchData", dataProviderClass = DP002.class)
		public void bookYourCoach(String UserId, String Password, String ConfirmPwd, String SecurityQues, String SecurityAns, String DOBYear, String DOBMonth, 
				String Email, String Occupation, String FirstName, String MiddleInitial, String LastName, String Nationality, String FlatNo, String Street, 
				String Area, String Country, String MobilePh, String Pincode, String City, String State, String PO, String OfficeNo, String OfficeStreet, 
				String OfficeArea, String OfficeCountry, String OfficeMobile, String OfficePincode, String OfficeCity, String OfficeState, String OfficePO) {
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
			
			enterById("userId", UserId);
			enterById("password", Password);
			enterById("cnfPassword", ConfirmPwd);
			
			selectValueById("secQstn", SecurityQues);//select security question from the drop down
			waitProperty(2000);
			enterById("secAnswer", SecurityAns);
			
			clickById("dateOfBirth"); //click on DOB field
			
			selectVisibleTextByXpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]", DOBYear); //select year from Year drop down
			selectVisibleTextByXpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]", DOBMonth); //select month from Month drop down
			clickByXpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a"); //select date from the calendar
			
			waitProperty(2000);
			
			clickById("gender1");
			clickById("maritalStatus0");
			enterById("email", Email);
			
			//clickById("occupation");
			selectValueById("occupation", Occupation); //select occupation from the drop down
			waitProperty(2000);
			
			enterByName("fname", FirstName);
			enterByName("mname", MiddleInitial);
			enterByName("lname", LastName);
			
			//clickById("natinality");
			selectValueById("natinality", Nationality); // select nationality from the drop down
			waitProperty(2000);
			
			enterById("flatNo", FlatNo);
			enterById("street", Street);
			enterById("area", Area);
			
			//clickById("country");
			selectValueById("country", Country); // select country from the drop down
			waitProperty(2000);
			
			enterById("mobile", MobilePh);
			enterById("pincode", Pincode);
			
			//waitProperty(2000);
			scrollPageDown("//html/body"); //Scroll the page down
			
			waitProperty(2000);
					
			selectValueById("city", City);
			waitProperty(2000);
			selectValueById("state", State);
			waitProperty(2000);
			selectValueById("postOffice", PO);
			//waitProperty(2000);
			
			scrollPageDown("//html/body"); //Scroll the page down
			waitProperty(3000);
			
			clickById("sameAddresses1"); //select No for communication address same as residential address question
			
			waitProperty(1000);
			
			enterById("flatNoOffice", OfficeNo);
			enterById("streetOffice", OfficeStreet);
			enterById("areaOffice", OfficeArea);
			
			selectValueById("countryOffice", OfficeCountry);
			waitProperty(2000);
			enterById("mobileOffice", OfficeMobile);
			enterById("pincodeOffice", OfficePincode);
			
			scrollPageDown("//html/body"); //Scroll the page down
			waitProperty(2000);
			
			selectValueById("cityOffice", OfficeCity);
			waitProperty(2000);
			selectValueById("stateOffice", OfficeState);
			waitProperty(2000);
			selectValueById("postOfficeOffice", OfficePO);
			
			waitProperty(2000);
			
			closeAllBrowsers();
		}
		
	}

	

