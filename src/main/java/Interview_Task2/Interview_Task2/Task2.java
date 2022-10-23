package Interview_Task2.Interview_Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2
{
     
	public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"post-2737\"]/div[3]/ul/li[16]/a/div[2]/button")
	WebElement  ApplyButton;
	
	@FindBy(xpath="//*[@value='Apply for job']")
	WebElement Applyforjob;
		
	@FindBy(xpath="//*[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath="//*[@type='password'][1]")
	WebElement password;
	
	
	@FindBy(xpath="//*[@id=\"al-sidebar-list\"]/ba-menu-item[2]/li/a")
	WebElement apply;
	
	@FindBy(xpath="//*[@id=\"course\"]")
	WebElement course;
	
	@FindBy(xpath="//*[@type='file']")
	WebElement resume;
	
	    public Task2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	    public void clickonapplyoptions()
	    {
	    	ApplyButton.click();
	    	Applyforjob.click();
	    	apply.click();
	    } 
	    
	  	    
		public void entercredential()
	   {
		email.sendKeys("shubhangigosavi52@gmail.com");
		password.sendKeys("Shubh@789");
		String path=System.getProperty("user.dir")+"//testng.xml";
		resume.sendKeys(path);
		
		}
		
		public void clickapply()
		{
			apply.click();
		}
	
}
