
	package testcases;

	import org.testng.annotations.Test;
    import utils.DP005;
    import wrappers.GenericWrappers;

	public class TC005_xls extends GenericWrappers {
		
		@Test(dataProvider = "fetchData", dataProviderClass = DP005.class)
		public void bookHotelsGSTValidation(String Username, String PhoneNo, String Destination, String HotelRoom, String HotelAdult, String Title,
				String FirstName, String LastName, String Country, String State, String SelectGST, String GSTNo, String CompanyName, 
				String CompanyAdd, String ErrorMsgText) {
			
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
			
			clickByLink("IRCTC Hotels");
			waitProperty(3000);
			
			switchToLastWindow(); //Switch to next window
			waitProperty(4000);
			
			clickByXpath("//*[@id=\"modaladditionalPayment\"]/div/div/div[2]/button");//Click OK on the Alert
			waitProperty(2000);
			
			clickByLink("Login"); //Click on Login on right top corner
			waitProperty(2000);
			
			clickByLink("Guest User Login"); //Click Guest User Login
			waitProperty(2000);
			
			enterById("modalLRInput12", Username);
			enterById("modalLRInput13", PhoneNo);
			
			clickByXpath("//*[@id=\"panel8\"]/div[1]/form/div[3]/button"); //click on Sign in button
			waitProperty(2000);
			
			enterByXpath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/input", Destination); // enter Jaipur in the destination field
			waitProperty(2000);
			
			//clickByXpath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/div/ul/li[4]/a"); // select Jaipur/Rajasthan from the drop down
			clickByXpath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/div/ul/li[4]/a/div[1]/span");
			waitProperty(3000);
			
			clickByName("dt12"); //click  on Check-In date field
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[1]/div/button/span/span"); // click on Year drop down in the calendar
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[2]/td[3]/span");//Select year 2021 from the drop down
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[2]/td[3]/span"); //Select month as June
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[7]/span"); //Select day as 12th june
			waitProperty(2000);
			
			clickByName("dt13"); //Click on Check-out date field
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[1]/div/button/span/span");//click on Year drop down in the calendar
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[2]/td[3]/span"); // Select year 2021 from the drop down
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[2]/td[3]/span"); //select month June 
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[7]/span"); //select day as 19th June
			waitProperty(2000);
			
			clickByName("guest"); //click on Rooms/Guest field
			
			selectValueByName("hotelRoom", HotelRoom); //Select Room as 1
			waitProperty(1000);
			
			selectValueByName("hotelAdult", HotelAdult); //Select Adults as 3
			waitProperty(1000);
			
			clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button"); //Click on Done button
			waitProperty(2000);
			
			clickByXpath("//*[@id=\"TravellerEconomydropdown\"]/div[5]/button"); //Click Find Hotel button
			waitProperty(5000);
			
			clickByXpath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button");//Click on Book (On first displayed Hotel)
			waitProperty(5000);
			
			getTextByLink("Oga Turban stay"); //Get the Hotel Name and Print in Console
			waitProperty(3000);
			
			getTextByXpath("//*[@id=\"hotel-dtl-sticky-photo\"]/div[1]/div[1]/div[2]/div/div/p");//Get the Price and Print in Console
			waitProperty(3000);
			
			clickByXpath("//*[@id=\"hotel-dtl-sticky-photo\"]/div[1]/div[1]/div[2]/div/div/div[4]/button");//Click on Continue to Book
			waitProperty(5000);
			
			selectValueByName("title", Title);
			waitProperty(3000);
			
			enterByName("firstName", FirstName);
			waitProperty(2000);
			enterByName("lastName", LastName);
			waitProperty(2000);
			
			selectValueByName("country", Country); //Select Country from the drop down
			waitProperty(3000);
			
			selectValueByName("state", State); //Select State from the drop down
			waitProperty(3000);
			
			selectValueByName("gst", SelectGST);//Select GST as Yes from the drop down
			waitProperty(3000);
			
			enterByName("gstNumber", GSTNo);
			waitProperty(2000);
			enterByName("companyName", CompanyName);
			waitProperty(2000);
			enterByName("companyAddress", CompanyAdd);
			waitProperty(2000);
			
			clickByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[12]/button[2]"); // Click on Go
			waitProperty(3000);
			
			// Verify the error Message displayed under GST Number "Please Enter Valid GST Number"
			verifyTextByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[9]/div/span", ErrorMsgText);
			waitProperty(3000);
			
			//Close All Browsers...
			closeAllBrowsers();
				
		}

	}
	

