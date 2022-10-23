package Interview_Task2.Interview_Task2;

import org.testng.annotations.Test;

public class Task1_test extends Base_Test
{
	@Test
	public void demo()
	{
	 ts1.clickonapplyoptions();	
	 ts.enterCredentials();
	 ts.clickoncaptcha();
	 ts.clickonsubmit();
	}
	
	
}
