import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Jars.BaseClass;

public class LaunchDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.google.in");
		driver.switchTo().activeElement().sendKeys("Krishna");
		Thread.sleep(10000);
		String xp = "//*[contains(text(),'Krishna')]";		
		List<WebElement> allsugg = driver.findElements(By.xpath(xp));
		for (WebElement suggestion : allsugg)
		{
			String text = suggestion.getText();
			System.out.println(text);
			if(text.equals("Krishna Photos"))
				suggestion.click();
			break;
			}
		//driver.close();
	}
	
}
