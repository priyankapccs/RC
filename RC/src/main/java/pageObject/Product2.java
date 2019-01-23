package pageObject;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class Product2 extends TestBase{
	
	@FindBy(css = "a[title = 'No, thanks']")
 	public WebElement poup;
	 
	@FindBy(css = "a[title = 'New Products']")
 	public WebElement NewProduct;
 
	@FindBy(xpath = "//div[@class = 'list-group']/child::a[@title = 'Displays & Optoelectronics']")
 	public WebElement Display;
    
	@FindBy(xpath = "//section[@id='search-results']/child::div[3]/child::div/child::div[2]/child::div[3]/child::div[2]/child::a")
 	public WebElement led;
	
		
	@FindBy(xpath = "//div[@class='filter-container']/child::div/child::rs-facets/child::a[5]")
 	public WebElement filterBrand;
    
	@FindBy(css = "label[id = '4291879430']")
 	public WebElement filterOption;
	
	@FindBy(xpath = "//div[@class = 'popover-content']/child::div[7]/child::rs-apply-button/child::button")
 	public WebElement applyFilter1;
	
	@FindBy(xpath = "//rs-filter-results[@class = 'row']/child::ng-include/child::div/child::div[@class = 'resultsTable results-table-container']/child::table/child::tbody/child::tr[1]/child::td[3]/child::div[4]/child::div/child::div/child::button")
 	public WebElement Add;
	
	@FindBy(css = "i[class='icon-cart']")
 	public WebElement cart;
	
	@FindBy(xpath = "//form[@id ='shoppingBasketForm']/child::div/child::div[@class = 'cartNavigationDiv']/child::div[2]/child::div/child::div/child::div/child::span/child::a[1]/child::span[@id = 'checkoutSecurelyAndPuchBtn']")
 	public WebElement Checkout;
	
	@FindBy(css = "a[title = 'Log Out']")
	public WebElement logout;

public Product2()
{
	PageFactory.initElements(driver, this);
}	



public void NewProduct()  throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) { 
		NewProduct.click();
		 }
	
	  else
			{
		   
			poup.click();	
		
			NewProduct.click();
		
		}
}

public void Display() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Display.click();
		}
   else
		{
	   
		poup.click();	
	
		Display.click();
	
	}
	
}

public void led() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		led.click();
		}
   else
		{
		poup.click();	
		
		led.click();
		}
	
		
}

public void applyingFilter() throws InterruptedException 
{
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
	
		
	filterBrand.click();
	filterOption.click();

	applyFilter1.click();
	
	}
	else
	{
	poup.click();	
	
	Add.click();
	cart.click();
	Checkout.click();
	}

	
}
public void checkout() throws InterruptedException 
{
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
	
	Add.click();
	cart.click();
	Checkout.click();
}
	else
	{
	poup.click();	
	
	Add.click();
	cart.click();
	Checkout.click();
	}

	
}
	
	
public void LogOut()
{
	logout.click();
}

}