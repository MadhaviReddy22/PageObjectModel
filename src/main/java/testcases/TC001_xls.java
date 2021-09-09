
	package testcases;


import org.testng.annotations.Test;
import utils.DP001;
import wrappers.GenericWrappers;

	public class TC001_xls extends GenericWrappers{
		
		@Test(dataProvider = "fetchData", dataProviderClass = DP001.class)
		public void irctcRegistration(String Username, String Password, String ConfirmPwd, String SecurityAns, String FirstName, String MiddleName,
				String LastName, String DOBYear, String DOBMonth, String Email, String MobilePh, String Nationality, String Address1, String Address2,
				String Address3, String Pincode, String State, String City, String PO, String ResPhone, String OffAddress1, String OffAddress2,
				String OffAddress3, String OffPincode, String OffState, String OffCity, String OffPO, String OffPhone, String securityQuestion) {
			invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
			
			waitProperty(3000);
			
			clickByLink("REGISTER");
			
			waitProperty(4000);
			
			enterById("userName", Username);
			enterById("usrPwd", Password);
			enterById("cnfUsrPwd", ConfirmPwd);
			clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div"); // click on language drop down
			clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li"); // select value from language drop down
			clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div"); // click on security question drop down
			clickByXpath("//span[text()='"+securityQuestion+"']"); //select security question from the drop down
			enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", SecurityAns); // enter answer to security question
			
			clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button"); //Click Continue button...
			waitProperty(3000);
			
			enterById("firstName", FirstName);
			enterById("middleName", MiddleName);
			enterById("lastname", LastName);
			clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div"); //click on Profession drop down
			clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span"); //select value from Profession drop down.
			
			clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input"); //click on the DOB field.
			
			selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]", DOBYear); // select year from DOB drop down
			selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]", DOBMonth); //select month from the DOB drop down
			clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[3]/td[2]/a"); // select day from the DOB drop down
			
			clickByXpath("//*[@id=\"married\"]/div/div[2]/span"); // select married radio button
					
			clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span"); //select gender
			enterById("email", Email);
			enterById("mobile", MobilePh);
			selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select", Nationality ); // select Nationality from the drop down
			waitProperty(3000);
			
			clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button"); //Click Continue button
			waitProperty(3000);
			
			enterById("resAddress1", Address1);
			enterById("resAddress2", Address2);
			enterById("resAddress3", Address3);
			enterByName("resPinCode", Pincode);
			enterByName("resState", State);
			
			selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select", City); //Select city from the drop down
			waitProperty(3000);
			
			selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select", PO); // Select PO from the drop down
			waitProperty(3000);
			
			enterById("resPhone", ResPhone);
			clickByXpath("//*[@id=\"no\"]/div/div[2]/span"); // Select 'No' for Copy Residence to Office Address
			
			enterById("offAddress1", OffAddress1);
			enterById("offAddress2", OffAddress2);
			enterById("offAddress3", OffAddress3);
			clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[2]/span"); //Click on Select a country drop down
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li/span"); // Select India from the country drop down
			waitProperty(2000);
			
			enterById("offPinCode", OffPincode);
			enterById("offState", OffState);
			enterById("offCity", OffCity);
			enterById("offPostOff", OffPO);
			enterById("offPhone", OffPhone);
			
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]"); // click Terms & Conditions check box
			
			//clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button"); // Click on Register button
			
			waitProperty(3000);
			
			closeAllBrowsers(); //Closing the browser
			
			}

	}



