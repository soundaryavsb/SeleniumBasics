package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part14ToolTipText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		
		WebElement NotificationButton=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[2]/a"));
		System.out.println(NotificationButton.getDomAttribute("data-tooltip"));
		System.out.println(NotificationButton.getDomProperty("data-tooltip"));
		System.out.println(NotificationButton.getDomAttribute("aria-label"));
//		driver.quit();
		
	}

}
