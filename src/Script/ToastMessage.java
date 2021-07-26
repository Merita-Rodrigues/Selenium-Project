package Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.WebBase;

public class ToastMessage extends WebBase {

	@Test
	public static void verifytoast() throws InterruptedException {

		driver.get("https://codeseven.github.io/toastr/demo.html");
		Thread.sleep(1000);
		driver.findElement(By.id("showtoast")).click();
		String toastMessage = driver.findElement(By.className("toast-message")).getText();
		System.out.println("Title of the toast message is:" + " " + toastMessage);

		Thread.sleep(2000);
	}

}
