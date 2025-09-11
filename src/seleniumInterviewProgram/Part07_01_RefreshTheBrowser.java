package seleniumInterviewProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part07_01_RefreshTheBrowser {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/button");
		driver.manage().window().maximize();
		
		//1. refresh page by using navigate().refresh()
		driver.navigate().refresh();
		
		driver.findElement(By.id("home")).click();
		Thread.sleep(2000);
		
		//2. Using Robot class and press F5(refresh)
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		driver.findElement(By.linkText("Explore Workspace")).click();
		Thread.sleep(2000);
		
		//3. Using driver.getCurrentUrl()
		driver.get(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[contains(text(),'Click')]")).click();
		Thread.sleep(2000);
		
		
		//4. Using JavaScriptExecutor
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("location.reload();", "");
		
		driver.findElement(By.id("home")).click();
		
		driver.quit();
		
	}

}
