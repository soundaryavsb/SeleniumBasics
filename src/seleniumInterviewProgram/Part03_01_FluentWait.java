package seleniumInterviewProgram;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Part03_01_FluentWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://duckduckgo.com/");

		Wait wait=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);

		WebElement search=(WebElement) wait.until
				(new Function<WebDriver, WebElement>() 
				{

					public WebElement apply(WebDriver driver) 
					{

						return driver.findElement(By.name("q"));
					}
				});

		search.sendKeys("Karur \n");
	}

}
