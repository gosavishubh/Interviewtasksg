package Interview_Task2.Interview_Task2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Task2
{
     
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()='QA Manual']")
	WebElement  ApplyButton;
	
	@FindBy(xpath=
			"//*[@class='post-text']/child::div//div[@class='job_application application']//input")
	WebElement Applyforjob;
		
	@FindBy(xpath="//*[@class='col-lg-4 col-md-4 loginCareer']//div[@class='alignFields placeholder']//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@class='col-lg-4 col-md-4 loginCareer']//div[@class='alignFields placeholder']//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@class='col-lg-4 col-md-4 loginCareer']//div[@class='signUpDiv1']")
	WebElement login_button;	
	
	@FindBy(xpath = "//*[text()='Apply']")
	WebElement apply;

	@FindBy(xpath = "//*[@id='course']//option[text()=' MCA ']")
	WebElement highest_qualification;
	
	@FindBy(xpath = "(//*[@ng-reflect-form='[object Object]'])[6]")
	WebElement position;
	
	@FindBy(xpath = "(//*[@ng-reflect-form='[object Object]'])[7]")
	WebElement experience;
		
	@FindBy(xpath="//*[@type='file']")
	WebElement resume;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement submit_apply;
	
	
	    public Task2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	    public void clickonapplyoptions()
	    {
	    
	    	driver.get("https://tudip.com/careers/apply-online");
	    	ApplyButton.click();
	    	Applyforjob.click();
		    //apply.click();
			}
	    	
	
	    
	  	    
		public void enterlogincredential()
	   {
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		email.sendKeys("shubhangigosavi52@gmail.com");
		password.sendKeys("Shubh@789");
		login_button.click();
		apply.click();
		}
		
		public void enterApplyDetails()
		{
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
			highest_qualification.click();

			
			Select sel_pos = new Select(position);
			
			sel_pos.selectByVisibleText("QA");
								
			Select sel_exp = new Select(experience);
			sel_exp.selectByVisibleText("2 - 5 years");
			
			String path = System.getProperty("user.dir")+"\\shubhangi Gosavi.docx";
			
			System.out.println(path);
			
			resume.sendKeys(path);
			
			submit_apply.click();
		}
		
	
}
