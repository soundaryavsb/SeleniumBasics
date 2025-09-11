package pomInterviewPractice_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Part_01_Temp02_LoginObject {

	public WebElement UserName(WebDriver driver)
	{
		return driver.findElement(By.id("email"));
	}
	public WebElement PassWord(WebDriver driver)
	{
		return driver.findElement(By.id("password"));
	}
	public WebElement LoginButton(WebDriver driver)
	{
		return driver.findElement(By.id("submitBTN"));
	}	
}
