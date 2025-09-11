package pomInterviewPractice_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomInterviewPractice_PageObject.Part_01_01_UpdateObject;

public class Part_01_Temp01_LoginAndUpdate {

	@Test
	public void LoginPage()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement UserName=driver.findElement(By.id("email"));
	UserName.sendKeys("user@phptravels.com");
	
	WebElement PassWord=driver.findElement(By.id("password"));
	PassWord.sendKeys("demouser");
	
	WebElement LoginButton=driver.findElement(By.id("submitBTN"));
	LoginButton.click();
	
	WebElement MyProfile=driver.findElement(By.linkText("My Profile"));
	MyProfile.click();
	
	WebElement Phone=driver.findElement(By.id("Phone"));
	Phone.clear();
	Phone.sendKeys("123456789");
	
	WebElement State=driver.findElement(By.id("State"));
	State.clear();
	State.sendKeys("Karur");
	
	WebElement Password2=driver.findElement(By.id("Password"));
	Password2.click();
	Password2.sendKeys("demouser");
	
	WebElement UpdateProfileButton=driver.findElement(By.xpath("//*[@type='submit']"));
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", UpdateProfileButton);
	
	}
}
