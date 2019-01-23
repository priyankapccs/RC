package stepDefinitions_Product2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage_Product1;
import pageObject.LoginPage_Product2;
import pageObject.Product1;
import pageObject.Product2;
import util.TestBase;

public class Pro2 extends TestBase{
	LoginPage_Product2 LP;
	Product2 P2;
	
	

	@Given("^User open browser$")
	public void User_open_browser() {	
	TestBase.initialization();
	}
	
	@When("User enter user name and password$")
	public void User_enter_user_name_and_password() {
		 LoginPage_Product2 LP = new LoginPage_Product2();
		P2 = LP.login(prop.getProperty("Username"), prop.getProperty("Password"));
	
	}
	

@Then("^User search display$")
public void User_search_cable() throws InterruptedException   {

	P2.NewProduct();
	P2.Display();
	P2.led();
		}

@Then("^User put the filter$")
public void User_put_the_filter() throws InterruptedException  {
	//Thread.sleep(8000);
	P2.applyingFilter();
}

@Then("^User checkout$")
public void User_checkout() throws InterruptedException  {
	//Thread.sleep(8000);
	P2.checkout();
}

@Then("^User Logout$")
public void User_Logout() throws InterruptedException  {
	//Thread.sleep(8000);
	P2.LogOut();
}

}