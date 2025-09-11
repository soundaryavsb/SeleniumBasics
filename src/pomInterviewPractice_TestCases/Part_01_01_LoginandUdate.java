package pomInterviewPractice_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomInterviewPractice_PageObject.Part_01_01_LoginObject;
import pomInterviewPractice_PageObject.Part_01_01_UpdateObject;

public class Part_01_01_LoginandUdate {

	@Test
	public void LoginPage()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	Part_01_01_LoginObject.UserName(driver).sendKeys("user@phptravels.com");
	Part_01_01_LoginObject.PassWord(driver).sendKeys("demouser");
	Part_01_01_LoginObject.LoginButton(driver).click();
	
	Part_01_01_UpdateObject.MyProfile(driver).click();
	Part_01_01_UpdateObject.Phone(driver).clear();
	Part_01_01_UpdateObject.Phone(driver).sendKeys("123456789");
	Part_01_01_UpdateObject.State(driver).clear();
	Part_01_01_UpdateObject.State(driver).sendKeys("Karur");
	Part_01_01_UpdateObject.Password2(driver).click();
	Part_01_01_UpdateObject.Password2(driver).sendKeys("demouser");
	
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", Part_01_01_UpdateObject.UpdateProfileButton(driver));
	
	
	}
}
