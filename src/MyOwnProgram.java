

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MyOwnProgram {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		/*String baseurl = "https://www.seleniumhq.org/download/";		driver.get(baseurl);
		driver.findElement(By.linkText("http://selenium-release.storage.googleapis.com/2.48.0/SafariDriver.safariextz")).click();*/
		driver.get("https://en.wikipedia.org");
		//driver.get("https://google.co.in/");
		Actions actions = new Actions(driver);
		//WebElement main = driver.findElement(By.linkText("Geography"));
		actions.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Geography')]")));
		//driver.findElement(By.name("q")).sendKeys("krishna");
		Thread.sleep(2000);
		actions.click().build().perform();

	}

}
