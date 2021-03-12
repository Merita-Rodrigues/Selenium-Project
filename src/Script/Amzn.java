package Script;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Lib;
import generic.WebBase;
import pom.AmznPage;

public class Amzn extends WebBase
{
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		try { 
		String url = Lib.getProperty(CONFIG_PATH,"AmazonUrl");
		driver.get(url);
		Thread.sleep(2000);

		AmznPage amz = new AmznPage(driver);

		Select drp = new Select(driver.findElement(By.id("searchDropdownBox")));
		Thread.sleep(2000);
		drp.selectByVisibleText("Books");
		Thread.sleep(2000);
		amz.ClickonSearch();
		System.out.println("Verification successful");
	}
		catch(Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Assert.fail();

}
	}
}

