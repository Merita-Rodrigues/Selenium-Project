package Script;


import java.io.IOException;

import org.testng.annotations.Test;

import generic.WebBase;


public class AmazonTitle extends WebBase {
	
	@Test
	public void amazonlogin() throws IOException, InterruptedException {
	
		driver.get(" https://www.amazon.in/");
		Thread.sleep(3000);
	}
	@Test
		public void signup() throws IOException, InterruptedException {
		
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
		
	}
}
