package seleniumInterviewProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Part16_01_switchTo_activeElement {
	@FindBy(name="q")
	static WebElement q;
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//		driver.switchTo().activeElement().sendKeys("Madurai \n");
		PageFactory.initElements(driver, Part16_01_switchTo_activeElement.class);
		
		q.sendKeys("Trichy \n");

	}

}
