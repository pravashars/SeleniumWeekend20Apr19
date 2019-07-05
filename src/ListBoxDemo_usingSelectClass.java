

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo_usingSelectClass extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///F:/menu.html");
		WebElement listBoxObj = driver.findElement(By.id("mtr"));
		Select s = new Select(listBoxObj);
		System.out.println(s.isMultiple() + " list is multi select...");

		System.out.println("*****Total Options in the list box.*****");
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		System.out.println("*****Below are the options available...*****");

		//select IDLI by using selectByIndex();
		s.selectByIndex(0);//Idli
		Thread.sleep(2000);
		//select IDLI by using selectByValue();
		s.selectByValue("d");//Dosa
		Thread.sleep(2000);
		//select IDLI by using selectByVisibleText();
		s.selectByVisibleText("Poori");
		Thread.sleep(2000);
		System.out.println("*****Total Options in the list box.*****");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());//4
		System.out.println("***** Below are the selcted Options.*****");

		for(WebElement selectedOption : allSelectedOptions)
		{
			System.out.println(selectedOption.getText());
		}
		System.out.println("*****First Selected Options in the list box is *****");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("Initial ---> " + firstSelectedOption.getText());//Idli
		//deselect idly
		s.deselectByIndex(0);
		System.out.println("final - > " + firstSelectedOption.getText());//Dosa

		s.deselectAll();
		//driver.close();
	}

}
