
	package testcases;

	import org.testng.annotations.Test;
    import utils.DP003;
    import wrappers.GenericWrappers;

	public class TC003_xls extends GenericWrappers {
		
		@Test(dataProvider = "fetchData", dataProviderClass = DP003.class)
		public void saloonMandatoryCheck(String Name, String OrganizationName, String Address, String MobilePh, String Email, String RequestFor,
				String OriginStation, String DestStation, String Duration, String CoachDetails, String PassengerNo, String CharterPurpose,
				String Services, String VerifyText) {
			
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
			
			enterByName("name", Name);
			enterByName("organization", OrganizationName);
			enterByName("address", Address);
			enterByName("mobile", MobilePh);
			enterByName("email", Email);
			
			selectValueByName("requestFor", RequestFor);
			waitProperty(1000);
			
			enterByName("originStation", OriginStation);
			enterByName("destnStation", DestStation);
			
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
			
			enterByName("durationPeriod", Duration);
			enterByName("coachDetails", CoachDetails);
			enterByName("numPassenger", PassengerNo);
			enterByName("charterPurpose", CharterPurpose);
			enterByName("services", Services);
			
			waitProperty(1000);
			
			clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button");//click on Submit button
			
			waitProperty(2000);
			
			verifyTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span", VerifyText);
			waitProperty(3000);
			
			closeAllBrowsers();
				
		}

	}



