
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;

//import Jars.BaseClass;

public class ScreenshotDemo{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.get("https://fb.com");
		Thread.sleep(2000);
		//take the screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);//ctrl+1+enter
		//File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile);
		File destFile = new File ("./Screenshot/wikipedia.png");
		Files.copy(srcFile, destFile);
		//driver.close();
	}
}
