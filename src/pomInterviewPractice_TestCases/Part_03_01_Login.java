package pomInterviewPractice_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Part_03_01_Login {

	
	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;
	
	@Test
	public void LoginPage()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	PageFactory.initElements(driver, Part_03_01_Login.class);
	Part_03_01_Login.email.sendKeys("user@phptravels.com");
	Part_03_01_Login.password.sendKeys("demouser");
	Part_03_01_Login.submitBTN.click();
	
	}
}
