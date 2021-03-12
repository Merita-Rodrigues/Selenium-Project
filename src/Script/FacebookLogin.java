package Script;

import java.io.IOException;
import org.testng.annotations.Test;

import generic.Lib;
import generic.WebBase;
import pom.FacebookLoginPage;


public class FacebookLogin extends WebBase {
	@Test
	public void flip() throws IOException, InterruptedException {
		String url = Lib.getProperty(CONFIG_PATH,"FacebookUrl");
		driver.get(url);
		Thread.sleep(3000);

		FacebookLoginPage fb = new FacebookLoginPage(driver);
		String un = Lib.getProperty(CONFIG_PATH, "fbusername");
		fb.Email(un);
		String pwd = Lib.getProperty(CONFIG_PATH, "fbpassword");
		fb.Password(pwd);
	}
}