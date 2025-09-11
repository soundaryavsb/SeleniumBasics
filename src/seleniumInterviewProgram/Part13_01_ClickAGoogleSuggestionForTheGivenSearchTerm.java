package seleniumInterviewProgram;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part13_01_ClickAGoogleSuggestionForTheGivenSearchTerm {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://duckduckgo.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement Search=driver.findElement(By.name("q"));
		Search.sendKeys("java online compiler");

		List<WebElement> SearchResults=driver.findElements(By.xpath("//ul[@role='list']/li[contains(@class,'searchbox_suggestion')]"));

		for (WebElement result : SearchResults) {
			//				click the search result contains 'ide' and break the loop after click the element
			if(result.getText().contains("ide"))
			{
				result.click();
				break;
			}
		}
		driver.quit();
	}
}