package seleniumInterviewProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Part06_01_ScreenShot_TakesScreenshot {

	public void screenshot(WebElement screen,String ImageName) throws IOException
	{
		File Src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/"+ImageName+".png");
		FileHandler.copy(Src, dest);	
	}

	public static void main(String[] args) throws IOException {

		Part06_01_ScreenShot_TakesScreenshot shot=new Part06_01_ScreenShot_TakesScreenshot();

		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/button");
		driver.manage().window().maximize();

		//Take full DOM driver screen shot
		File DriverSrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Driverdest=new File("./snaps/driverScreen.png");
		FileHandler.copy(DriverSrc, Driverdest);

		//Take a single button screen shot - What is my color?
		WebElement colorButton=driver.findElement(By.id("color"));
		shot.screenshot(colorButton, "colorButton");

		//Take content screen shot - concept
		WebElement content=driver.findElement(By.className("content"));
		shot.screenshot(content, "content");

		driver.quit();
	}
}
