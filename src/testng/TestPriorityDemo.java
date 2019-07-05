package testng;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPriorityDemo {
	@Test
	public void createUser()
	{
		Reporter.log("createUser ....", true);
		Assert.fail("Intentionally I'm failing this create user method....");
	}
	@Test(Priority=3, dependsOnMethods)
}
