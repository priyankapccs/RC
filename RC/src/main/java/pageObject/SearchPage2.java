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

public class SearchPage2 extends TestBase{
	
	@FindBy(css = "a[title = 'No, thanks']")
 	public WebElement poup;
	 
	@FindBy(css = "a[title = 'All Products']")
 	public WebElement Product;
 
	@FindBy(xpath = "//a[text() = 'Cables & Wires']")
 	public WebElement Cables1;
    
	@FindBy(css = "h2[title = 'Coaxial Cable']")
 	public WebElement Coaxial;
	
	@FindBy(css = "h2[title = 'Coaxial Cable Assemblies']")
 	public WebElement Cable;
	
	@FindBy(xpath = "//div[@class='filter-container']/child::div/child::rs-facets/child::a[2]")
 	public WebElement filterBrand;
    
	@FindBy(css = "label[id = '4291486527']")
 	public WebElement filterOption;
	
	@FindBy(xpath = "//div[@class = 'popover-content']/child::div[6]/child::rs-apply-button/child::button")
 	public WebElement applyFilter1;
	
	
	@FindBy(css = "a[title = 'Log Out']")
	public WebElement logout;

public SearchPage2()
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

public void cable() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Cables1.click();
		}
   else
		{
	   
		poup.click();	
	
		Cables1.click();
	
	}
	
}

public void coaxial() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Coaxial.click();
		}
   else
		{
		poup.click();	
		
		Coaxial.click();
		}
	
		
}

public void applyingFilter() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Cable.click();
		}
   else
		{
		poup.click();	
		
		Cable.click();
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