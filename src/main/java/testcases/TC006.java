package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC006 extends GenericWrappers {
	
	@Test
	public void formC () {
		
		invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		waitProperty(3000);
		
		clickByLink("Sign Up (Registration)");
		waitProperty(2000);
		
		enterById("u_id", "mreddy22");
		enterById("u_pwd", "Letmein@22");
		enterById("u_repwd", "Letmein@22");
		
		selectValueById("u_secques", "3"); // Select the security question from the drop down
		waitProperty(1000);
		enterById("u_secans", "Pride & Prejudice");
		
		enterById("u_name", "Madhu");
		selectValueById("u_gender", "F");
		enterById("u_dob", "11/11/1980");
		enterById("u_designation", "Software Engineer");
		enterById("u_emailid", "m_madhu22@gmail.com");
		enterById("u_mobile", "9900033661");
		enterById("u_phone", "9900567645");
		
		selectValueById("u_nationality", "IND");
		waitProperty(1000);
		
		enterById("name", "Holiday Inn");
		enterById("capacity", "100");
		enterById("address", "1000, Road No 2, Jublee Hills, Hyderabad");
		waitProperty(1000);
		
		selectValueById("state", "37"); //select state from the drop down
		waitProperty(1000);
		selectValueById("city_distr", "2D"); //select city from the drop down
		waitProperty(1000);
		selectValueById("acco_type", "BB"); //Select Accomodation type
		waitProperty(1000);
		selectValueById("star_rat", "5s"); //Select Accommodation Grade
		waitProperty(1000);
		
		enterById("email", "manager@holidayinn.com");
		enterById("mcontact", "9900077866");
		enterById("contact", "54001234");
		
		// Add 3 Passenger Details
		enterByName("name_o", "Manju");
		enterByName("address_o", "101 Galaxy Enclave, Madhapur, Hyderabad");
		selectValueById("state_o", "37");
		waitProperty(2000);
		selectValueById("citydistr_o","2D");
		waitProperty(2000);
		
		enterByName("emailid_o", "m_manju11@gmail.com");
		enterByName("phoneno_o", "9900223312");
		enterByName("mobile_o", "9118754098");
		
		waitProperty(2000);
		clickByName("add");
		waitProperty(2000);
		
		//Add 2nd Passenger Details
		
		enterByName("name_o", "Chinni");
		enterByName("address_o", "111 Indu Fortune, Madhapur, Hyderabad");
		selectValueById("state_o", "37");
		waitProperty(2000);
		selectValueById("citydistr_o", "2D");
		waitProperty(2000);
		
		enterByName("emailid_o", "Chinni09@gmail.com");
		enterByName("phoneno_o", "9900223321");
		enterByName("mobile_o", "9118754066");
		
		waitProperty(2000);
		clickByName("add");
		waitProperty(2000);
		
		//Add 3rd Passenger Details
		
		enterByName("name_o", "Vijay Reddy");
		enterByName("address_o", "1002 Gardenia fields, Kondapur, Hyderabad");
		selectValueById("state_o", "37");
		waitProperty(2000);
		selectValueById("citydistr_o", "2D");
		waitProperty(2000);
		
		enterByName("emailid_o","Vijay12@gmail.com");
		enterByName("phoneno_o", "9903223321");
		enterByName("mobile_o", "9116554066");
		
		waitProperty(2000);
		clickByName("add");
		waitProperty(2000);
		
		closeAllBrowsers();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
	}

}
