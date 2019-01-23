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

public class SearchPage3 extends TestBase{
	
	@FindBy(css = "a[title = 'No, thanks']")
 	public WebElement poup;
	 
	@FindBy(css = "a[title = 'All Products']")
 	public WebElement Product;
 
	@FindBy(xpath = "//a[text() = 'Adhesives, Sealants & Tapes']")
 	public WebElement Tapes;
    
	@FindBy(css = "h2[title = 'Sealants']")
 	public WebElement Sealants;
	
	@FindBy(css = "h2[title = 'Leak Sealers']")
 	public WebElement Leak;
	
	@FindBy(xpath = "//div[@class='filter-container']/child::div/child::rs-facets/child::a[8]")
 	public WebElement filterBrand;
    
	@FindBy(css = "label[id = '4293221213']")
 	public WebElement filterOption;
	
	@FindBy(xpath = "//div[@class = 'popover-content']/child::div[6]/child::rs-apply-button/child::button")
 	public WebElement applyFilter1;
	
	
	@FindBy(css = "a[title = 'Log Out']")
	public WebElement logout;

public SearchPage3()
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

public void tapes1() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Tapes.click();
		}
   else
		{
	   
		poup.click();	
	
		Tapes.click();
	
	}
	
}

public void Sealants() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Sealants.click();
		}
   else
		{
		poup.click();	
		
		Sealants.click();
		}
	
		
}

public void applyingFilter() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Leak.click();
		}
   else
		{
		poup.click();	
		
		Leak.click();
		}
	
	
	
		
		
	filterBrand.click();
	filterOption.click();

	applyFilter1.click();
	
	
}

public void LogOut()
{
	logout.click();
}

}