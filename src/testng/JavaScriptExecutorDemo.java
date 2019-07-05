package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Jars.BaseClass;

public class JavaScriptExecutorDemo extends BaseClass {

	public static void main (String [] args)
	{
		driver.get("file:///F:/test_html_page.html");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement openQAImgObj = driver.findElement(By.id("footerLogo"));

		int xcor = openQAImgObj.getLocation().getX();
		int ycor = openQAImgObj.getLocation().getY();

		jse.executeScript("window.scrollTo("+xcor+", "+ycor+")");
		jse.executeScript("arguments[0].click()", openQAImgObj);

		/*
			//enter admin the username disabled text box.
			jse.executeScript("document.getElementById('username').value='admin'");
			//driver.findElement(By.id("un123").sendKeys("admin");
			jse.executeScript("document.getElementByName('pwd')[0].value='manager'");
			//use javascript executor to enter admin in disabled text box.
			WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login "));
			jse.executeScript("argument[0].click(), loginBtn);*/

	}

}
