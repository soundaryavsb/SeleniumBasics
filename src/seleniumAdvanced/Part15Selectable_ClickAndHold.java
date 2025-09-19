package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part15Selectable_ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
				
		driver.switchTo().frame(0);
		//<ol><li> ordered list
		List<WebElement> OrderList=driver.findElements(By.xpath("//*[@id='selectable']/li"));
		System.out.println(OrderList.size());
		
		//1. Method 1
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(OrderList.get(0)).click(OrderList.get(1)).click(OrderList.get(2)).release().perform();
		
		//2. Method 2
		action.clickAndHold(OrderList.get(4)).clickAndHold(OrderList.get(5)).clickAndHold(OrderList.get(6)).release().perform();
		
		
		}
}

