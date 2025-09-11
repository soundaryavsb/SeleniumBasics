package testNGInterviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TestAnnotation {

	long startTime;
	WebDriver driver;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser()
	{
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		endTime=System.currentTimeMillis();
		long TotalTime=endTime-startTime;
		System.out.println("Total time: "+TotalTime);
	}
	
	@Test
	public void Google()
	{
		driver.get("https://www.google.com/");
	}
	@Test
	public void Yahoo()
	{
		driver.get("https://in.search.yahoo.com/");
	}
	@Test
	public void Bing()
	{
		driver.get("https://www.bing.com/");
	}
}
