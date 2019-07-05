package testng;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderDemo {
	//Create data
	@DataProvider
	public Object[][] loginData() {
		Object[][] data = new Object[3][3];
		data[0][0] = "admin1";
		data[0][1]= "manager1" ;
		data[0][2]= "manager1" ;

		
		data[1][0] = "admin2";
		data[1][1]= "manager2" ;
		data[1][2]= "manager2" ;
		
		data[2][0] = "admin3";
		data[2][1]= "manager3" ;
		data[2][2]= "manager3" ;
		return data;
	}
	//Utilise the data
	@Test(dataProvider="loginData")
	public void testLogin(String un, String pwd, String confPwd) {
		System.out.println(un + " : "+ pwd + " : "+ confPwd);
	}
	
}
