package extentReportsInterviewPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {

	WebDriver driver;
	ExtentReports extentReportsObj;
	ExtentSparkReporter extentSparkReporterObj;
	ExtentTest TestCase;

	@Test(priority = 1)
	public void GoogleTitle() throws IOException
	{
	
		
		TestCase=extentReportsObj.createTest("Google title matching");
		driver.get("https://www.google.com/");

		String Title=driver.getTitle();
		if(Title.equals("Googlew"))
		{
			TestCase.log(Status.PASS, "Google Title is matched");
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File Source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("extentScreenShots/GoogleShot Matched.png");
//			FileHandler.copy(Source, destination);
			FileUtils.copyFile(Source, destination);
			TestCase.addScreenCaptureFromPath("extentScreenShots/GoogleShot Matched.png", "Google Title matched");
			System.out.println("Google title is matched");
		}
		else
		{
			TestCase.log(Status.FAIL, "Google Title is not matched");
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File Source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("extentScreenShots/GoogleShot not Matched.png");
			FileUtils.copyFile(Source, destination);
//			FileHandler.copy(Source, destination);
			TestCase.addScreenCaptureFromPath("extentScreenShots/GoogleShot not Matched.png", "Google Title not matched");
			System.out.println("Google title is not matched");
		}

	}

//	@Test(priority = 2)
//	public void YahooTitle() throws IOException, AWTException
//	{
//		
//		driver.get("https://in.search.yahoo.com/");
//		String Title=driver.getTitle();
//		if(Title.equals("Yahoo Search - Web Search"))
//		{
//			Robot robot=new Robot();
//			Dimension dimention=Toolkit.getDefaultToolkit().getScreenSize();
//			Rectangle rectangle=new Rectangle(dimention);
//			BufferedImage source=robot.createScreenCapture(rectangle);
//			File destination=new File("./YahooShot Matched.png");
//
//			ImageIO.write(source, "png", destination);
//			System.out.println("Yahoo title is matched");
//		}
//		else
//		{
//			TakesScreenshot screenshot=(TakesScreenshot) driver;
//			File Source=screenshot.getScreenshotAs(OutputType.FILE);
//			File destination=new File("./YahooShot not Matched.png");
//			FileUtils.copyFile(Source, destination);
////			FileHandler.copy(Source, destination);
//			System.out.println("Yahoo title is not matched");
//		}
//	}

	@BeforeSuite
	public void startbroswer()
	{
		extentReportsObj=new ExtentReports();
		extentSparkReporterObj=new ExtentSparkReporter("Titlecheck.html");
		extentReportsObj.attachReporter(extentSparkReporterObj);
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterSuite
	public void exitbrowser()
	{
		driver.quit();
		extentReportsObj.flush();
	}

}
