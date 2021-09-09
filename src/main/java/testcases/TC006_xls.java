	package testcases;

	import org.testng.annotations.Test;
	import utils.DP006;
	import wrappers.GenericWrappers;

	public class TC006_xls extends GenericWrappers {
		
		@Test(dataProvider = "fetchData", dataProviderClass = DP006.class)
		public void formC(String UserId, String Password, String ConfirmPwd, String SecurityQ, String SecurityAns, String Username, String Gender,
				String DOB, String Designation, String Email, String MobilePh, String Phone, String Nationality, String HotelName, String Capacity,
				String Address, String State, String City, String AccomType, String Rating, String ManagerEmail, String ManagerContact, 
				String ContactPh, String Passenger1Name, String Passenger1Address, String Passenger1State, String Passenger1City, String Passenger1Email,
				String Passenger1Ph, String Passenger1Mobile, String Passenger2Name, String Passenger2Address, String Passenger2State, String Passenger2City, 
				String Passenger2Email, String Passenger2Ph, String Passenger2Mobile, String Passenger3Name, String Passenger3Address, String Passenger3State, 
				String Passenger3City, String Passenger3Email, String Passenger3Ph, String Passenger3Mobile) {
			
			invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			waitProperty(3000);
			
			clickByLink("Sign Up (Registration)");
			waitProperty(2000);
			
			enterById("u_id", UserId);
			enterById("u_pwd", Password);
			enterById("u_repwd", ConfirmPwd);
			
			selectValueById("u_secques", SecurityQ); // Select the security question from the drop down
			waitProperty(1000);
			enterById("u_secans", SecurityAns);
			
			enterById("u_name", Username);
			selectValueById("u_gender", Gender);
			enterById("u_dob", DOB);
			enterById("u_designation", Designation);
			enterById("u_emailid", Email);
			enterById("u_mobile", MobilePh);
			enterById("u_phone", Phone);
			
			selectValueById("u_nationality", Nationality);
			waitProperty(1000);
			
			enterById("name", HotelName);
			enterById("capacity", Capacity);
			enterById("address", Address);
			waitProperty(1000);
			
			selectValueById("state", State); //select state from the drop down
			waitProperty(1000);
			selectValueById("city_distr", City); //select city from the drop down
			waitProperty(1000);
			selectValueById("acco_type", AccomType); //Select Accomodation type
			waitProperty(1000);
			selectValueById("star_rat", Rating); //Select Accommodation Grade
			waitProperty(1000);
			
			enterById("email", ManagerEmail);
			enterById("mcontact", ManagerContact);
			enterById("contact", ContactPh);
			
			// Add 3 Passenger Details
			enterByName("name_o", Passenger1Name);
			enterByName("address_o", Passenger1Address);
			selectValueById("state_o", Passenger1State);
			waitProperty(2000);
			selectValueById("citydistr_o", Passenger1City);
			waitProperty(2000);
			
			enterByName("emailid_o", Passenger1Email);
			enterByName("phoneno_o", Passenger1Ph);
			enterByName("mobile_o", Passenger1Mobile);
			
			waitProperty(2000);
			clickByName("add");
			waitProperty(2000);
			
			//Add 2nd Passenger Details
			
			enterByName("name_o", Passenger2Name);
			enterByName("address_o", Passenger2Address);
			selectValueById("state_o", Passenger2State);
			waitProperty(2000);
			selectValueById("citydistr_o", Passenger2City);
			waitProperty(2000);
			
			enterByName("emailid_o", Passenger2Email);
			enterByName("phoneno_o", Passenger2Ph);
			enterByName("mobile_o", Passenger2Mobile);
			
			waitProperty(2000);
			clickByName("add");
			waitProperty(2000);
			
			//Add 3rd Passenger Details
			
			enterByName("name_o", Passenger3Name);
			enterByName("address_o", Passenger3Address);
			selectValueById("state_o", Passenger3State);
			waitProperty(2000);
			selectValueById("citydistr_o", Passenger3City);
			waitProperty(2000);
			
			enterByName("emailid_o", Passenger3Email);
			enterByName("phoneno_o", Passenger3Ph);
			enterByName("mobile_o", Passenger3Mobile);
			
			waitProperty(2000);
			clickByName("add");
			waitProperty(2000);
			
			closeAllBrowsers();
			
	}


}
