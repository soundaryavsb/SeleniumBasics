package seleniumInterviewProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Part02_01_ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement search=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
		WebElement search2=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("q"))));
		
		search.sendKeys("Karur \n");

	}

}
