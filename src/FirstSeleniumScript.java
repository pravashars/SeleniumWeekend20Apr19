

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumScript extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		//set the path of driver executables
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

		//Launch the browser
		WebDriver driver1 = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		WebDriver driver2 = new FirefoxDriver();
		Thread.sleep(10000);
		//https://www.seleniumhq.org/download/

		//enter the url
		driver1.get("https://www.baidu.com");
		driver2.get("https://www.google.in");

		//Print the Title
		String title = driver1.getTitle();
		String title1 = driver2.getTitle();

		//Print the url
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver2.getCurrentUrl());

		//close the browser window
		//driver.close();
	}
}
