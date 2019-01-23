package pageObject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class Product1 extends TestBase{
	
	@FindBy(css = "a[title = 'No, thanks']")
 	public WebElement poup;
	 
	@FindBy(css = "a[title = 'Our Brands']")
 	public WebElement Brand;
 
	@FindBy(xpath = "//a[@title = 'ON Semiconductor']")
 	public WebElement Semiconductor;
    
	@FindBy(xpath = "//ul[@class = 'popularCategoryList']/child::li[4]")
 	public WebElement msofet;
	
		
	@FindBy(xpath = "//div[@class='filter-container']/child::div/child::rs-facets/child::a[8]")
 	public WebElement filterBrand;
    
	@FindBy(css = "label[id = '4291849329']")
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

public Product1()
{
	PageFactory.initElements(driver, this);
}	



public void Brand()  throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) { 
		Brand.click();
		 }
	
	  else
			{
		   
			poup.click();	
		
			Brand.click();
		
		}
}

public void battery1() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		Semiconductor.click();
		}
   else
		{
	   
		poup.click();	
	
		Semiconductor.click();
	
	}
	
}

public void msofet() throws InterruptedException 
{
	
	List<WebElement> P1 = driver.findElements(By.cssSelector("a[title='No, thanks']"));
	int a = P1.size();
	if(	a == 0) {
		
		msofet.click();
		}
   else
		{
		poup.click();	
		
		msofet.click();
		}
	
		
}

public void applyingFilter() throws InterruptedException 
{
	
		
	filterBrand.click();
	filterOption.click();

	applyFilter1.click();
	
	
}

public void checkout()
{
	Add.click();
	cart.click();
	Checkout.click();
}
public void LogOut()
{
	logout.click();
}

}