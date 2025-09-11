package seleniumInterviewProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part19_Underline {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement tamil=driver.findElement(By.linkText("தமிழ்"));
		String beforeHover=tamil.getCssValue("text-decoration");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(tamil);
		actions.perform();
		
		String afterHover=tamil.getCssValue("text-decoration");
		
		System.out.println("Before Hover"+beforeHover);
		System.out.println("After Hover"+afterHover);
	}

}
