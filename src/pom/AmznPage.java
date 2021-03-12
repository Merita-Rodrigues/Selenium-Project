package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmznPage {
	@FindBy(id="searchDropdownBox")
	WebElement dropdown;
	
	@FindBy(id="nav-search-submit-button")
	WebElement clickonsearch;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[9]")
	WebElement amznpay;
	
    @FindBy(xpath="//*[@id=\"MobileRecharge\"]/span/a/div[2]/span")
	WebElement mobrech;
    
    
    @FindBy(xpath="//*[@id=\"p_n_feature_three_browse-bin/9141483031\"]/span/a/div/label/i")
    WebElement hin;
   
	public AmznPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickonSearch() throws InterruptedException
	{
		clickonsearch.click();
		Thread.sleep(2000);
//		amznpay.click();
//		Thread.sleep(2000);
//		mobrech.click();
	}
	
	public void AmznPay() throws InterruptedException
	{
		amznpay.click();
		Thread.sleep(2000);
	}
	
	public void MobRecharge() throws InterruptedException
	{
		mobrech.click();
		Thread.sleep(2000);
	}
    
    public void Hindi() throws InterruptedException
    {
        hin.click();
        Thread.sleep(2000);
    }	
	
}
