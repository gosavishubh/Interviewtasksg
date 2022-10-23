package Interview_Task2.Interview_Task2;

import org.testng.annotations.Test;

public class Task3_test extends Base_Test
{
	
	
	@Test
	public void checkLogin()
	{
		
		
		ts2.loginToOrangeHRM();
		
	}
	
	@Test
	public void checkupdatedDetails() throws InterruptedException
	{
		
		ts2.updateDetails();
		
	}
	

}
