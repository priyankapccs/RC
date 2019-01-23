package stepDefinitions;

import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.SearchPage1;
import pageObject.SearchPage3;
import util.TestBase;
import pageObject.LoginPage_Search3;


public class Battery extends TestBase{
	LoginPage LP;
	SearchPage1 SP1;
	

	@Given("^User open browser$")
	public void User_open_browser() {	
	TestBase.initialization();
	}
	
	@When("User enter user name and password$")
	public void User_enter_user_name_and_password() {
		 LoginPage LP = new LoginPage();
		SP1 = LP.login(prop.getProperty("Username"), prop.getProperty("Password"));
	
	}
	

@Then("^User search battery$")
public void User_search_battery() throws InterruptedException   {
	
	SP1.Product1();
	SP1.battery1();
	SP1.nc();

}

@Then("^User put the filter$")
public void User_put_the_filter() throws InterruptedException  {
	//Thread.sleep(8000);
	SP1.applyingFilter();
}

@Then("^User Logout$")
public void User_Logout() throws InterruptedException  {
	//Thread.sleep(8000);
	SP1.LogOut();
}

}