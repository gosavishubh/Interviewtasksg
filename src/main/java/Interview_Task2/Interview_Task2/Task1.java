package Interview_Task2.Interview_Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1 
{
public WebDriver driver;

	@FindBy(xpath="//*[@id=\"catapultCookie\"]")
	WebElement cookies_button;
	
	@FindBy(xpath="//*[@name='first-name']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@name='last-name']")
	WebElement lastname;
	 
	@FindBy(xpath="//*[@name='your-email']")
	WebElement youremail;
	
	@FindBy(xpath="//*[@name='phone']")
	WebElement phoneno;
	
	@FindBy(xpath="//*[@name='your-subject']")
	WebElement yoursubject;
	
	@FindBy(xpath="//*[@name='your-message']")
	WebElement message;
	
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[2]")
	WebElement captcha;
	
	@FindBy(xpath="//*[@id=\"form-submit\"]")
	WebElement submit_button;
	
	public Task1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterCredentials()
	{
		cookies_button.click();
		firstname.sendKeys("shubhangi");
		lastname.sendKeys("gosavi");
		youremail.sendKeys("gosavishubh7093@gmail.com");
		phoneno.sendKeys("9156795001");
		yoursubject.sendKeys("do the task");
		message.sendKeys("completed");
		
	}
	
	public void clickoncaptcha()
	{
		captcha.click();
	}
	public void clickonsubmit()
	{
		submit_button.click();
	}
	
}
