package seleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part11WIndowsHandling_SwitchToWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();

		//Take the old window URL
		String ParentWindow=driver.getWindowHandle();

		// 1. Click and Confirm new Window Opens
		WebElement newWindow=driver.findElement(By.id("j_idt88:new"));
		newWindow.click();


		//Take all the opened window URL in a List
		Set<String> NewOpenedWindows=driver.getWindowHandles();

		//switch to new opened window and perform any operation
		for (String WindowHandle : NewOpenedWindows) {
			driver.switchTo().window(WindowHandle);
		}

		//click Daily Quiz check box in the new opened window
		WebElement CheckBoxDailyQuiz=driver.findElement(By.xpath("//*[@id='j_idt107']/div[2]"));
		CheckBoxDailyQuiz.click();
		//close the opened new window
		driver.close();

		//Switch the driver to the parent window
		driver.switchTo().window(ParentWindow);

		//2. Find the number of opened tabs
		WebElement OpenMultipleButton=driver.findElement(By.id("j_idt88:j_idt91"));
		OpenMultipleButton.click();
		Set<String> MultiWindow=driver.getWindowHandles();
		int NumberOfMultiWindow=MultiWindow.size();
		System.out.println("Number of opened windows include parent window: "+NumberOfMultiWindow);


		//Switch the driver to the parent window
		driver.switchTo().window(ParentWindow);
		
		//3. Close all windows except Primary
		WebElement CloseWindowButton=driver.findElement(By.id("j_idt88:j_idt93"));
		CloseWindowButton.click();

		//Get all the opened windows details
		Set<String> CloseWindowHandle=driver.getWindowHandles();

		int closeWindowSize=CloseWindowHandle.size();
		System.out.println("Close Window Button OPened Windows Size: "+closeWindowSize);
	
		//close the window if the window is not a parent window
		for (String CloseWindow : CloseWindowHandle) {
			if(!CloseWindow.equals(ParentWindow))
			{
				//switch the window to the child window and close it
				driver.switchTo().window(CloseWindow).close();
			}
		}
		
		//Switch the driver to the parent window
		driver.switchTo().window(ParentWindow);
//		driver.quit();
	}

}
