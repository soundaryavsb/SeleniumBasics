package seleniumInterviewProgram;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part12_02_PrintTheGoogleSuggestionsForGivenSearchTerm {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		Dimension dimension=new Dimension(1920, 1200);
		driver.manage().window().setSize(dimension);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Search=driver.findElement(By.name("q"));
		Search.sendKeys("java online compiler");
		
		List<WebElement> SearchResults=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(SearchResults.size());
		for (WebElement result : SearchResults) {
			System.out.println(result.getText());
		}
		driver.quit();
	}
}