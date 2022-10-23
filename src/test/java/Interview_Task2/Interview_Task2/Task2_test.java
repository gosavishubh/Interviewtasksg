package Interview_Task2.Interview_Task2;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Task2_test extends Base_Test
{
	public WebDriver driver;
	
	@Test
	public void demo1() 
	{
		ts1.clickonapplyoptions();
		ts1.enterlogincredential();
		ts1.enterApplyDetails();
	}
	
}
