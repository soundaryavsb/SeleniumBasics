package pomInterviewPractice_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Part_01_01_UpdateObject {

	public static WebElement MyProfile(WebDriver driver)
	{
		return driver.findElement(By.linkText("My Profile"));
	}
	public static WebElement Phone(WebDriver driver)
	{
		return driver.findElement(By.id("Phone"));
	}
	public static WebElement State(WebDriver driver)
	{
		return driver.findElement(By.id("State"));
	}
	public static WebElement Password2(WebDriver driver)
	{
		return driver.findElement(By.id("Password"));
	}
	public static WebElement UpdateProfileButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@type='submit']"));
	}
}
