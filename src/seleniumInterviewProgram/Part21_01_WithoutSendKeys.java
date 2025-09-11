package seleniumInterviewProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part21_01_WithoutSendKeys {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		Way 1:
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("document.getElementsByName('q')[0].value='Madhurai'", "");
			
			
//		Way 2:
//		WebElement search=driver.findElement(By.name("q"));
//		JavascriptExecutor executor=(JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].value='Trichy'", search);
		
//		Way 3:
//		driver.switchTo()).activeElement(); // Without activeElement method also Robot can send key
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_SHIFT);
//		robot.keyPress(KeyEvent.VK_R);
//		robot.keyRelease(KeyEvent.VK_R);
//		robot.keyRelease(KeyEvent.VK_SHIFT);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_Y);
//		robot.keyRelease(KeyEvent.VK_Y);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//	
	}

}
