package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers {
	
	@Test
	public void saloonMandatoryCheck() {
		
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
		
		clickByLink("Charter"); //click on Charter option from the menu
		waitProperty(2000);
		
		clickByXpath("//*[@id=\"dismiss\"]/i");
		waitProperty(2000);
		
		clickByLink("Enquiry Form");
		waitProperty(2000);
		
		enterByName("name", "Madhavi");
		enterByName("organization", "Fleet");
		enterByName("address", "1000 Data Drive, Charlotte, NC");
		enterByName("mobile", "9821347");
		enterByName("email", "m_madhu22@gmail.com");
		
		selectValueByName("requestFor", "Saloon Charter");
		waitProperty(1000);
		
		enterByName("originStation", "Hyderabad");
		enterByName("destnStation", "Bangalore");
		
		clickByName("checkInDate"); //Click on Date of Departure calendar field
		waitProperty(1000);
		
		selectVisibleTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[2]/select", "2021"); // select year from the drop down for Date of Departure 
		waitProperty(2000);
		
		//select month from the calendar - 2 months away from current
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[3]/span[1]"); 
		
		waitProperty(1000);
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[3]/span[1]/i");
		
		waitProperty(1000);
		
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[2]/td[6]/span"); //select the date 11th from calendar
		//clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[2]/td[7]/span"); //select the date 12th from calendar
		//clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[3]/td[6]/span"); //select the date 18th from calendar
		waitProperty(2000);
		
		clickByName("checkOutDate"); //Click on Date of Arrival back at origination station calendar field
		waitProperty(1000);
		
		selectVisibleTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[2]/select","2021");// select year from the drop down for Date of Arrival 
		waitProperty(2000);
		
		//select month from the calendar - 2 months away from current
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[3]/span[1]");
		waitProperty(1000);
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[3]/span[1]");
		
		waitProperty(1000);
		
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[3]/td[7]/span"); //select the date 18th from the calendar
		
		waitProperty(2000);
		
		enterByName("durationPeriod", "7");
		enterByName("coachDetails", "A/C Coach");
		enterByName("numPassenger", "3");
		enterByName("charterPurpose", "Enquiring about the services");
		enterByName("services", "Need more information about Additional available services");
		
		waitProperty(1000);
		
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button");//click on Submit button
		
		waitProperty(2000);
		
		verifyTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span", "Mobile no. not valid");
		waitProperty(3000);
		
		closeAllBrowsers();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
