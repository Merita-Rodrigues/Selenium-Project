package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintLinks {
	@Test()
	public void printinglinks() throws InterruptedException
	{ 

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\WebAutomation\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int alllinks =	driver.findElements(By.tagName("a")).size();
		System.out.println(alllinks);

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
	}

}
