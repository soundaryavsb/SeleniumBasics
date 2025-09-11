package seleniumInterviewProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Part16_TestNG_activeElementAndFindBy {
	
	@Test
	public void activeElement()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.switchTo().activeElement().sendKeys("karur \n");
	}
	@Test
	public void PageFactoryFindBy()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//		PageFactory.initElements(driver, Part16_activeElementAndFindBy.class);
		Part16_TestNG_PageObjectModel POM=new Part16_TestNG_PageObjectModel();
		PageFactory.initElements(driver, POM);
		POM.getSearch().sendKeys("Trichy \n");
	}
}
