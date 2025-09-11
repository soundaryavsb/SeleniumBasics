package seleniumInterviewProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part15_01_WaysToPressEnterKeyToPerformGoogleSearch {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search=driver.findElement(By.name("q"));
//		Way 1:
//		search.sendKeys("Trichy"+Keys.ENTER);
		
//		Way 2:
//		search.sendKeys("Trichy");
//		search.submit();

//		Way 3:
//		search.sendKeys("Trichy");
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

//		Way 4:
		search.sendKeys("Trichy \n");

	}

}
