package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part12HandlingIFrames_SwitchTo_Frame_DefaultContent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();


		//1. Click Me (Inside frame)
		//Switch to iframe 
		driver.switchTo().frame(0);
		WebElement ClickMeButton=driver.findElement(By.id("Click"));
		ClickMeButton.click();

		//Get the content inside the button
		String ClickMeButtonText=ClickMeButton.getText();
		System.out.println("Click Me Button Text: "+ClickMeButtonText);

		//switch the default content
		driver.switchTo().defaultContent();

		//2. Click Me (Inside Nested frame)
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement ClickMeNestedButton=driver.findElement(By.id("Click"));
		ClickMeNestedButton.click();

		//switch the default content
		driver.switchTo().defaultContent();

		//3. How many frames in this page?
		List<WebElement> NoOfIFrame=driver.findElements(By.tagName("iframe"));
		int IframeCount=NoOfIFrame.size();
		System.out.println("Number of Iframe count: "+IframeCount);
		
	}

}
