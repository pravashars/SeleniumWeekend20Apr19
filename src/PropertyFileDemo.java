import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
public class PropertyFileDemo {
	public static void main(String[] args) throws Exception {
		//Read data from config file
		FileInputStream configFileObj = new FileInputStream("./config.properties");
		Properties prop = new Properties();
		prop.load(configFileObj);//to load the property file 
		String url = prop.getProperty("URL");
		String un = prop.getProperty("USERNAME");
		String pwd = prop.getProperty("PASSWORD");
		System.out.println(url + " -- > "+ un + " --> "  + pwd);
	}
}
