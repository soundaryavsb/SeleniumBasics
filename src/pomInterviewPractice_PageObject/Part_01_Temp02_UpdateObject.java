package pomInterviewPractice_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Part_01_Temp02_UpdateObject {

	public WebElement MyProfile(WebDriver driver)
	{
		return driver.findElement(By.linkText("My Profile"));
	}
	public WebElement Phone(WebDriver driver)
	{
		return driver.findElement(By.id("Phone"));
	}
	public WebElement State(WebDriver driver)
	{
		return driver.findElement(By.id("State"));
	}
	public WebElement Password2(WebDriver driver)
	{
		return driver.findElement(By.id("Password"));
	}
	public WebElement UpdateProfileButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@type='submit']"));
	}
}
