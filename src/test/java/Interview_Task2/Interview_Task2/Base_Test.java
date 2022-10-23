package Interview_Task2.Interview_Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test 

{
	public static WebDriver driver;
	public Task1 ts;
	public Task2 ts1;
	
	@BeforeSuite
	public void initBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.get("https://tudip.com/contact/");

	}
	
	@BeforeClass
	public void objectcreation() 
	{
		ts=new Task1(driver);
		ts1=new Task2(driver);
	}
	
	
}
