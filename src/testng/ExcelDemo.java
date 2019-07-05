package testng;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelDemo {
	public static void main(String[] args) throws Exception {
		FileInputStream excelObj = new FileInputStream("./testdata/Data.xlsx");
		Workbook wb = WorkbookFactory.create(excelObj);
		Sheet sh = wb.getSheet("LoginData");
		/*Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		String username = c.toString();
		System.out.println(username);*/
		for (int i = 1; i <= sh.getLastRowNum() ; i++) {
	String username = wb.getSheet("LoginData").getRow(i).getCell(0).toString();
	String password = wb.getSheet("LoginData").getRow(i).getCell(1).toString();
	System.out.println(username + " : " + password);
		}
	}
}
