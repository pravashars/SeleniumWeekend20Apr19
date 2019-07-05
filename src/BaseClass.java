

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	//set the path of driver executable
	//static block
	static {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
	}
	//launch the browser // static variable
	public static WebDriver driver = new FirefoxDriver();
	public static WebDriver driver1 = new ChromeDriver();
	public static WebDriver driver2 = new InternetExplorerDriver();

}
