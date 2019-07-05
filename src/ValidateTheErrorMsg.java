
import java.sql.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

public class ValidateTheErrorMsg extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver1.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver1.findElement(By.xpath("//input[@value='Confirmation Alert']"));
		Thread.sleep(2000);
		Alert alertobj = driver1.switchTo().alert();
		String actAlrtMsg = alertobj.getText();
		System.out.println("Actual Alert Text is "+ actAlrtMsg);
		if (actAlrtMsg.equals("Are you sure you want to give us the deed to your house?"))
		{
			System.out.println("Alert Message is correct....");
		}
		else
		{
			System.out.println("Alert Message is incorrect....");
		}
		Thread.sleep(2000);
		alertobj.accept();
		driver1.close();
		//enter the username in UNTB w/o using findElement method
		/*TargetLocator tl = driver1.switchTo();
		WebElement unTB = tl.activeElement();
		unTB.sendKeys("9439873877");*/
		//driver1.switchTo().activeElement().sendKeys("9439873877");
	}
}
