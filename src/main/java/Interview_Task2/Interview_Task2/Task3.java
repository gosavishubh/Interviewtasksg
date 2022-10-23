package Interview_Task2.Interview_Task2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Task3
{
	
	@FindBy(xpath ="//*[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement login_button;
	
	@FindBy(xpath = "//*[contains(@href,'viewMyDetails')]")
	WebElement my_info;
	
	@FindBy(xpath = "//*[@name='firstName']")
	WebElement first_name;
	
	@FindBy(xpath = "//*[@name='lastName']")
	WebElement last_name;
	
	@FindBy(xpath = "//*[contains(@href,'contactDetails')]")
	WebElement contact_details;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement street1;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[3]")
	WebElement street2;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[4]")
	WebElement city;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[5]")
	WebElement state;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[6]")
	WebElement zipcode;

	@FindBy(xpath = "//*[@class='oxd-select-text oxd-select-text--active']")
	WebElement country;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement save_button;
	
	@FindBy(xpath = "//div[@class='orangehrm-edit-employee-image']//img[contains(@src,'viewPhoto')]")
	WebElement profile_picture;
	
	@FindBy(xpath = "(//*[@type='file']/parent::div//div)[1]")
	WebElement upload_pp;
	
	
	WebDriver driver;
	
	
	
	public Task3(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void loginToOrangeHRM()
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login_button.click();
		
	}
	
	public void updateDetails() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		my_info.click();
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.click(first_name).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();;
		first_name.sendKeys("Chaman");
		act.click(last_name).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		last_name.sendKeys("Waghmare");
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", first_name);
		act.click(contact_details).perform();
		
		Thread.sleep(2000);
		act.click(street1).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).sendKeys("1600 Pennsylvania").sendKeys(Keys.TAB).build().perform();

		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys("Avenue NW").sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys("Washington").sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys("DC").sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys("20500").sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys("u").sendKeys("u").sendKeys("u").sendKeys("u").sendKeys("u").sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys("7994705050").sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys("paul@yahoo.com").perform();
		
		Thread.sleep(3000);
		
		act.moveToElement(save_button).click().build().perform();
		
		Thread.sleep(3000);
		
		act.click(contact_details).perform();
		profile_picture.click();
		
		
		Thread.sleep(3000);
		
		
		String path = System.getProperty("user.dir")+"\\Dummy Profile Picture.jpg";
		System.out.println(path);
		upload_pp.sendKeys(path);
		
		Thread.sleep(3000);
		WebElement  save = driver.findElement(By.xpath("//*[@type='submit']"));
		act.moveToElement(save).click().build().perform();
		
	}
	
	

}

