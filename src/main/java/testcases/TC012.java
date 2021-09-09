package testcases;


import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC012 extends GenericWrappers{
	
	@Test
	public void irctcRegistration() {
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		
		waitProperty(3000);
		
		clickByLink("REGISTER");
		
		waitProperty(4000);
		
		enterById("userName", "madhur0522");
		enterById("usrPwd", "Letmein22");
		enterById("cnfUsrPwd", "Letmein22");
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div"); // click on language drop down
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li"); // select value from language drop down
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div"); // click on security question drop down
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span"); //select security question from the drop down
		enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", "NalaR"); // enter answer to security question
		
		clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button"); //Click Continue button...
		waitProperty(3000);
		
		enterById("firstName", "Madhu");
		enterById("middleName", "M");
		enterById("lastname", "Reddy");
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div"); //click on Profession drop down
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span"); //select value from Profession drop down.
		
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input"); //click on the DOB field.
		
		selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]", "1980"); // select year from DOB drop down
		selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]", "May"); //select month from the DOB drop down
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[3]/td[2]/a"); // select day from the DOB drop down
		
		clickByXpath("//*[@id=\"married\"]/div/div[2]/span"); // select married radio button
				
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span"); //select gender
		enterById("email", "m_madhu@gmail.com");
		enterById("mobile", "9923487691");
		selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select","India" ); // select Nationality from the drop down
		waitProperty(3000);
		
		clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button"); //Click Continue button
		waitProperty(3000);
		
		enterById("resAddress1", "1001");
		enterById("resAddress2", "Gardenia Enclave");
		enterById("resAddress3", "Madhapur");
		enterByName("resPinCode", "500085");
		enterByName("resState", "Telangana");
		
		selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select", "HYDERABAD"); //Select city from the drop down
		waitProperty(3000);
		
		selectVisibleTextByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select", "KPHB Colony S.O"); // Select PO from the drop down
		waitProperty(3000);
		
		enterById("resPhone", "9000331122");
		clickByXpath("//*[@id=\"no\"]/div/div[2]/span"); // Select 'No' for Copy Residence to Office Address
		
		enterById("offAddress1", "1000");
		enterById("offAddress2", "Commercial Street");
		enterById("offAddress3", "Hi-tech City");
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[2]/span"); //Click on Select a country drop down
		waitProperty(2000);
		
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li/span"); // Select India from the country drop down
		waitProperty(2000);
		
		enterById("offPinCode", "500085");
		enterById("offState", "Telangana");
		enterById("offCity", "Hyderabad");
		enterById("offPostOff", "Madhapur PO");
		enterById("offPhone", "9000678231");
		
		waitProperty(2000);
		
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]"); // click Terms & Conditions check box
		
		//clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button"); // Click on Register button
		
		waitProperty(3000);
		
		closeAllBrowsers(); //Closing the browser
		
		
		
		
		
		
		
		
		
	}

}
