package stepDefinition_tapes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage_Search3;
import pageObject.SearchPage3;
import util.TestBase;

public class tapes extends TestBase{
	LoginPage_Search3 LP;
	SearchPage3 TP;
	
	

	@Given("^User open browser$")
	public void User_open_browser() {	
	TestBase.initialization();
	}
	
	@When("User enter user name and password$")
	public void User_enter_user_name_and_password() {
		 LoginPage_Search3 LP = new LoginPage_Search3();
		TP = LP.login(prop.getProperty("Username"), prop.getProperty("Password"));
	
	}
	

@Then("^User search tapes$")
public void User_search_cable() throws InterruptedException   {

	TP.Product1();
	TP.tapes1();
	TP.Sealants();
	}

@Then("^User put the filter$")
public void User_put_the_filter() throws InterruptedException  {
	//Thread.sleep(8000);
	TP.applyingFilter();
}


@Then("^User Logout$")
public void User_Logout() throws InterruptedException  {
	//Thread.sleep(8000);
	TP.LogOut();
}


}