package pomInterviewPractice_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Part_01_01_LoginObject {

	
	public static WebElement UserName(WebDriver driver)
	{
		return driver.findElement(By.id("email"));
	}
	public static WebElement PassWord(WebDriver driver)
	{
		return driver.findElement(By.id("password"));
	}
	public static WebElement LoginButton(WebDriver driver)
	{
		return driver.findElement(By.id("submitBTN"));
	}
	
}
