package stepDefinitions_Product1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage_Product1;
import pageObject.Product1;
import util.TestBase;

public class Pro1 extends TestBase{
	LoginPage_Product1 LP;
	Product1 P1;
	
	

	@Given("^User open browser$")
	public void User_open_browser() {	
	TestBase.initialization();
	}
	
	@When("User enter user name and password$")
	public void User_enter_user_name_and_password() {
		 LoginPage_Product1 LP = new LoginPage_Product1();
		P1 = LP.login(prop.getProperty("Username"), prop.getProperty("Password"));
	
	}
	

@Then("^User search Semiconductor$")
public void User_search_Semiconductor() throws InterruptedException   {

	P1.Brand();
	P1.battery1();
	P1.msofet();
		}

@Then("^User put the filter$")
public void User_put_the_filter() throws InterruptedException  {
	//Thread.sleep(8000);
	P1.applyingFilter();
}

@Then("^User checkout$")
public void User_checkout() throws InterruptedException  {
	//Thread.sleep(8000);
	P1.checkout();
}

@Then("^User Logout$")
public void User_Logout() throws InterruptedException  {
	//Thread.sleep(8000);
	P1.LogOut();
}

}