package pomInterviewPractice_TestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pomInterviewPractice_PageObject.Part_02_01_LoginObject;
import pomInterviewPractice_PageObject.Part_02_01_UpdateObject;

public class Part_02_01_LoginandUdate {

	@Test
	public void LoginPage()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	PageFactory.initElements(driver, Part_02_01_LoginObject.class);
	Part_02_01_LoginObject.UserName.sendKeys("user@phptravels.com");
	Part_02_01_LoginObject.PassWord.sendKeys("demouser");
	Part_02_01_LoginObject.LoginButton.click();
	
	PageFactory.initElements(driver, Part_02_01_UpdateObject.class);
	Part_02_01_UpdateObject.MyProfile.click();
	Part_02_01_UpdateObject.Phone.clear();
	Part_02_01_UpdateObject.Phone.sendKeys("123456789");
	Part_02_01_UpdateObject.State.clear();
	Part_02_01_UpdateObject.State.sendKeys("Karur");
	Part_02_01_UpdateObject.Password2.click();
	Part_02_01_UpdateObject.Password2.sendKeys("demouser");
	
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", Part_02_01_UpdateObject.UpdateProfileButton);
	
	
	}
}
