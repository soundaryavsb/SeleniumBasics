package seleniumInterviewProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Part22_02_CheckAllCheckBox {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//1. Basic CheckBox
		WebElement BasicCheckBox=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		BasicCheckBox.click();

		WebElement JavaScript=driver.findElement(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td[3]/div/div[2]"));
		JavaScript.click();

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		List<WebElement> Checkboxes=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@type='checkbox']//following::div[1]")));
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		for (WebElement checkbox : Checkboxes) {
			try {
			executor.executeScript("arguments[0].scrollIntoView(true);", checkbox);
			wait.until(ExpectedConditions.elementToBeClickable(checkbox));
			
			boolean check=checkbox.isSelected();	
			if(!check)
			{
			checkbox.click();
			}
	
			}catch(ElementClickInterceptedException e)
			{
				System.out.println("Click intercepted, trying JS click");
				executor.executeScript("arguments[0].click();", checkbox);
			}
			
		}
	}
}
