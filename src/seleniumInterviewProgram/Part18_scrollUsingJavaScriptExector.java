package seleniumInterviewProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part18_scrollUsingJavaScriptExector {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		WebElement OnlineTool=driver.findElement(By.linkText("online tool"));
		executor.executeScript("arguments[0].scrollIntoView(true);", OnlineTool);
	
		

	}

}
