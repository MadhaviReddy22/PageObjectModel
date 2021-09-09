package testcases;

import org.testng.annotations.Test;

import utils.DP010;
import wrappers.GenericWrappers;

public class TC010 extends GenericWrappers {
	
	@Test(dataProvider = "bringData", dataProviderClass = DP010.class)
	public void phpTravelRegistration(String firstName, String lastName, String email) {
	
		invokeApp("chrome", "https://www.phptravels.org/register.php");
		waitProperty(3000);
		
		enterById("inputFirstName", firstName);
		enterById("inputLastName", lastName);
		enterById("inputEmail", email);
		
		clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]"); // click on phone code flag
		
		waitProperty(2000);
		
		clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]/span[1]");//select india from the drop down
		waitProperty(2000);
		
		enterById("inputPhone", "7042138790");
		enterById("inputCompanyName", "MMR Travels");
		enterById("inputAddress1", "15340");
		enterById("inputAddress2", "Main Street");
		enterById("inputCity", "Hyderabad");
		enterById("stateinput", "Telangana");
		enterById("inputPostcode", "500085");
		
		selectValueById("inputCountry", "IN");
		waitProperty(2000);
		selectValueById("customfield1", "Friend");
		waitProperty(2000);
		
		enterById("customfield2", "9841144356");
		enterById("inputNewPassword1", "OpenSesame22");
		enterById("inputNewPassword2", "OpenSesame22");
		
		clickByXpath("//*[@id=\"frmCheckout\"]/div[3]/div/div/span[2]");
		waitProperty(2000);
		
		//clickByXpath("//*[@id=\"frmCheckout\"]/p/input");
		
		//closeAllBrowsers();
			
	}

}
