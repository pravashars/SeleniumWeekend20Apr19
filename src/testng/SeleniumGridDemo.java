package testng;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo {
	
	public void runInMultipleOS{
		
	}
		URL whichSystem = new URL("http://192.168.247.1:4444/wd/hub");
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		
		WebDriver driver = new RemoteWebDriver (whichSystem, whichBrowser);
		driver.get("http")
	
}
}