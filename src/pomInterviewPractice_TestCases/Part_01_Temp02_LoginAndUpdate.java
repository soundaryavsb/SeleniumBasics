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
import pomInterviewPractice_PageObject.Part_01_Temp02_LoginObject;
import pomInterviewPractice_PageObject.Part_01_Temp02_UpdateObject;

public class Part_01_Temp02_LoginAndUpdate {

	@Test
	public void LoginPage()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Part_01_Temp02_LoginObject loginObject=new Part_01_Temp02_LoginObject();
	loginObject.UserName(driver).sendKeys("user@phptravels.com");
	loginObject.PassWord(driver).sendKeys("demouser");
	loginObject.LoginButton(driver).click();
	
	Part_01_Temp02_UpdateObject updateObject=new Part_01_Temp02_UpdateObject();
	updateObject.MyProfile(driver).click();
	updateObject.Phone(driver).clear();
	updateObject.Phone(driver).sendKeys("123456789");
	updateObject.State(driver).clear();
	updateObject.State(driver).sendKeys("Karur");
	updateObject.Password2(driver).click();
	updateObject.Password2(driver).sendKeys("demouser");
	
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", updateObject.UpdateProfileButton(driver));

	}
}
