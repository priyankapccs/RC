package pageObject;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class SearchPage1 extends TestBase{
	
	@FindBy(css = "a[title = 'No, thanks']")
 	public WebElement poup;
	
	@FindBy(css = "a[title = 'All Products']")
 	public WebElement Product;
 
	@FindBy(xpath = "//a[text() = 'Batteries']")
 	public WebElement battery;
    
	@FindBy(css = "h2[title = 'Non-Rechargeable Batteries']")
 	public WebElement nonrechargeable;
	
	@FindBy(css = "h2[title = 'Coin Button Batteries']")
 	public WebElement CoinButton;
	
	@FindBy(xpath = "//div[@class='filter-container']/child::div/child::rs-facets/child::a[1]")
 	public WebElement filterBrand;
    
	@FindBy(css = "label[id = '4291471876']")
 	public WebElement filterOption;
	
	@FindBy(xpath = "//div[@class = 'popover-content']/child::div[6]/child::rs-apply-button/child::button")
 	public WebElement applyFilter;
	
	@FindBy(xpath = "//div[@class='filter-container']/child::div/child::rs-facets/child::a[5]")
 	public WebElement filterBrand1;
    
	@FindBy(css = "label[id = '4294847193']")
 	public WebElement filterOption1;
	
    
		
	@FindBy(css = "a[title = 'Log Out']")
	public WebElement logout;

public SearchPage1()
{
	PageFactory.initElements(driver, this);
}	



public void Product1()  throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) { 
		 Product.click();
		 }
	
	  else
			{
		   
			poup.click();	
		
			Product.click();
		
		}
}

public void battery1() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
	battery.click();
		}
   else
		{
	   
		poup.click();	
	
		battery.click();
	
	}
	
}

public void nc() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		nonrechargeable.click();
		}
   else
		{
		poup.click();	
		
		nonrechargeable.click();
		}
	
		
}

public void applyingFilter() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		CoinButton.click();
		}
   else
		{
		poup.click();	
		
		CoinButton.click();
		}
	
			
	filterBrand.click();
	filterOption.click();

	
	applyFilter.click();
	filterBrand1.click();
	
	filterOption1.click();
	
	applyFilter.click();
	
}

public void LogOut()
{
	logout.click();
}

}


