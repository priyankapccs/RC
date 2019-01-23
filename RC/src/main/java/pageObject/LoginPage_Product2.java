package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class LoginPage_Product2 extends TestBase{
	
	@FindBy(css = "a[id='js-logInOut']")
 	public WebElement Login;
 
	@FindBy(css = "input[name='username']")
 	public WebElement Username;
    
	@FindBy(css = "input[name='j_password']")
 	public WebElement Password;
	
	@FindBy(css = "input[name='loginBtn']")
 	public WebElement button;



public LoginPage_Product2()
{
	PageFactory.initElements(driver, this);
}	

public  Product2 login(String username, String password)
{
	Login.click();
	Username.sendKeys("priyanka.pccs126");
	Password.sendKeys("priyaankit");
	button.click();
	return new Product2();
}


}