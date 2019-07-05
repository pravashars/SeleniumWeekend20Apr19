import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.google.common.io.Files;

public class Testing {

	public static void main(String[] args) throws Exception	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
		//WebDriver driver0 = new FirefoxDriver();
		//WebDriver driver1 = new InternetExplorerDriver();
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.amazon.in");
		TakesScreenshot ts = (TakesScreenshot) driver2;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("F:\\Screenshot\\hakunamatata.png");
		Files.copy(srcFile, destFile);
		Thread.sleep(10000);
		driver2.close();
		
		/*driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		System.out.println("The title of the current page is : " + title);
		String url = driver.getCurrentUrl();
		System.out.println("The url of the current page is : " + url);
		String pageSource = driver.getPageSource();
		System.out.println("The pagesource of the current page is : " + pageSource);
		WebElement unTB = driver.findElement(By.id("username"));
		unTB.sendKeys("admin");
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		pwdTB.sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);*/
		}

}
