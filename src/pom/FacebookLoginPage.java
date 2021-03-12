package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

     WebDriver driver;

	public FacebookLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="u_0_b1")
	private WebElement signin;
	
	public void Email(String un)
	{
		email.sendKeys(un);
	}
	public void Password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void Submit()
	{
		signin.click();
	}
}

