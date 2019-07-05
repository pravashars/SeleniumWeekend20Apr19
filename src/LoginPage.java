

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass
{
	// Declare the elements
	@FindBy(id = "username")
	WebElement unTB;

	@FindBy(name = "pwd")
	WebElement pwdTB;

	@FindBy(xpath="//div[divtext()='Login ']")
	WebElement loginBtn;

	//Initialize the elements
	LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilize the elements
	public void SetUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void SetPassword(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
}