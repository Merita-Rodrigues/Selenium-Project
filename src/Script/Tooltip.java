package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.WebBase;

public class Tooltip extends WebBase {
	@Test
	public void verifytoast() throws InterruptedException {

		driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html#");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Hover over me']"))).perform();
		Thread.sleep(1000);
		String toastMessage = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println(toastMessage);

		Assert.assertEquals(toastMessage, "Hooray!");
		Thread.sleep(2000);

	}

}
