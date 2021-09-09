package testcases;

import org.testng.annotations.Test;

import utils.DP007;
import wrappers.GenericWrappers;

public class TC007 extends GenericWrappers {
	
	@Test(dataProvider="fetchData",dataProviderClass=DP007.class)
	public void facebookSignUp (String firstName, String lastName, String email, String confirmEmail,
			String password,String month, String day, String year) {
	
		invokeApp("chrome", "http://www.facebook.com");
		waitProperty(2000);
		clickByLink("Create New Account");
		
		waitProperty(3000);
		enterByName("firstname", firstName);
		enterByName("lastname", lastName);
		enterByName("reg_email__", email);
		enterByName("reg_email_confirmation__", confirmEmail);
		enterByName("reg_passwd__", password);
		
		selectValueById("month",month); //select month from the drop down for DOB
		waitProperty(1000);
		selectValueById("day", day); //select day from the drop down
		waitProperty(1000);
		selectValueById("year", year); //select year from the drop down
		waitProperty(1000);
		
		clickByXpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input");
		waitProperty(1000);
		
		//clickByName("websubmit");
		
		
		
		
	}

}
