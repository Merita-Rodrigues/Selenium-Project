package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.Lib;
import generic.WebBase;
import pom.AmznPage;

public class Amzn extends WebBase
{
	@Test(priority=1)
	public void verifyTitle() throws InterruptedException
	{
	
		String url = Lib.getProperty(CONFIG_PATH,"AmazonUrl");
		driver.get(url);
		Thread.sleep(2000);

		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle =driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Verification successful");
		}
		else
		{
			System.out.println("Verification failed");

		}  
	
		AmznPage amz = new AmznPage(driver);
		Select drp = new Select(driver.findElement(By.id("searchDropdownBox")));
		Thread.sleep(2000);
		drp.selectByVisibleText("Books");
		Thread.sleep(2000);
		amz.ClickonSearch();
		System.out.println("Test case passed");
	
	}
}

