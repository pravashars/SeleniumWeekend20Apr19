

public class KhatarnaakProgram extends BaseClass{

	public static void main(String[] args) {
		driver.get("https://www.google.co.in");
		LoginPage login = new LoginPage (driver);
		
		login.SetUsername("admin");
		login.SetPassword("manager123");
		login.clickLogin();
		// page refresh
		//driver.navigate().refresh();
		//page is auto refresh
		
		login.SetUsername("admin");
		login.SetPassword("manager");
		login.clickLogin();
	}

}
