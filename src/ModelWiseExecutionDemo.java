import org.testng.annotations.Test;

public class ModelWiseExecutionDemo {
	@Test(groups= {"user", "smoke"})
	public void createUser()
	{
		System.out.println("createUser....");
	}
	@Test(groups= {"user", "smoke"})
	public void editUser()
	{
		System.out.println("editUser....");
	}
	@Test(groups= {"user", "smoke"})
	public void deleteUser()
	{
		System.out.println("deleteUser....");
	}
	@Test(groups= {"user", "smoke"})
	public void createProduct()
	{
		System.out.println("createProduct....");
	}
	public void editProduct()
	{
		System.out.println("createProduct....");
	}
	public void deleteProduct()
	{
		System.out.println("createProduct....");
	}
}
