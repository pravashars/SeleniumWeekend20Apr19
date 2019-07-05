

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestionsDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver1.get("https://www.google.com");
		
		driver1.switchTo().activeElement().sendKeys("goa");
		Thread.sleep(2000);
		String xp = "//*[contains(text(),'goa')]";
		List<WebElement> allSugg = driver1.findElements(By.xpath(xp));
		for(WebElement suggestion : allSugg)
		{
			String text = suggestion.getText();
			System.out.println(text);
			if(text.equals("goa beach"))
			{
				suggestion.click();
				break;
				}
		}
		/*driver1.close();*/
	}

}
