package testcases;

import org.testng.annotations.Test;

import utils.DP010_xls;
import wrappers.GenericWrappers;

public class TC010_xls extends GenericWrappers {
	
	@Test(dataProvider = "getData", dataProviderClass = DP010_xls.class)
	public void phpTravelRegistration(String firstName, String lastName, String email, String PhoneNumber, String CompanyName, String Address1,
			String Address2, String City, String State, String PostalCode, String Country, String Field1, String Field2, String Password, String ConfirmPassword) {
	
		invokeApp("chrome", "https://www.phptravels.org/register.php");
		waitProperty(3000);
		
		enterById("inputFirstName", firstName);
		enterById("inputLastName", lastName);
		enterById("inputEmail", email);
		
		clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]"); // click on phone code flag
		
		waitProperty(2000);
		
		clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]/span[1]");//select india from the drop down
		waitProperty(2000);
		
		enterById("inputPhone", PhoneNumber);
		enterById("inputCompanyName", CompanyName);
		enterById("inputAddress1", Address1);
		enterById("inputAddress2", Address2);
		enterById("inputCity", City);
		enterById("stateinput", State);
		enterById("inputPostcode", PostalCode);
		
		selectValueById("inputCountry", Country);
		waitProperty(2000);
		selectValueById("customfield1", Field1);
		waitProperty(2000);
		
		enterById("customfield2", Field2);
		enterById("inputNewPassword1", Password);
		enterById("inputNewPassword2", ConfirmPassword);
		
		clickByXpath("//*[@id=\"frmCheckout\"]/div[3]/div/div/span[2]");
		waitProperty(2000);
		
		//clickByXpath("//*[@id=\"frmCheckout\"]/p/input");
		
		//closeAllBrowsers();
			
	}
	
}	





