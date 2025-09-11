package seleniumInterviewProgram;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Part12_01_PrintTheGoogleSuggestionsForGivenSearchTerm {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		
		driver.navigate().to("https://www.google.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement Search=driver.findElement(By.name("q"));
		Search.sendKeys("java online compiler");
		
		List<WebElement> SearchResults=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[2]/div/div[1][@role='presentation']/span")));
		System.out.println(SearchResults.size());
		for (WebElement result : SearchResults) {
			System.out.println(result.getText());
		}
		driver.quit();
	}
}
