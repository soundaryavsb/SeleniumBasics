package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part22_Calendars_jquery_Contains_text {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
				
		WebElement CalendarTextBox=driver.findElement(By.id("datepicker"));
		CalendarTextBox.click();
		
		//Enter date in the calendar using send keys
//		CalendarTextBox.sendKeys("04/10/2025"+Keys.ENTER);
		
		WebElement NextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		NextButton.click();
		
		WebElement Date10=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		Date10.click();	
	}
}
