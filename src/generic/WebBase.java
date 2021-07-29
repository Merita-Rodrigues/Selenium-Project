package generic;

import java.util.HashMap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebBase implements AutoConst {
	public static HashMap<String, WebDriver> driverObjMap = new HashMap<String, WebDriver>();

	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);

	}
	public static WebDriver driver;

	@BeforeClass
	public void openApplication() throws InterruptedException {
		try {
			// for headless chrome browser make it as true
			runHeadless(false);
			Thread.sleep(2000);
		} catch (Exception e) {
			Reporter.log("Server down", true);
			System.out.println(e);
		}
	}

	private void runHeadless(boolean headless) {
		if (headless) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
		} else {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
	}

}
