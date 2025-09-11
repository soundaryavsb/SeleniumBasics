package seleniumInterviewProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Part14_01_GoogleSearchResultURLs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("12 angry men"+Keys.ENTER);

		List<WebElement> Mainsite=driver.findElements(By.xpath("//*[@class='react-results--main']/li //div[2]/div/div/a/div/p/span[1]"));
		for (WebElement links : Mainsite) {
			System.out.println(links.getText());
		}	
		driver.quit();
	}
}
//ChromeOptions options=new ChromeOptions();
//options.addArguments("--headless");
//options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/115 Safari/537.36");

//WebDriver driver=new ChromeDriver(options);

//driver.get("https://www.google.com/");
//List<WebElement> Mainsite=driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
//List<WebElement> Mainsite=driver.findElements(By.xpath("//*[@id='search']//cite"));