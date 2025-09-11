package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part13DragAndDrop_ClickAndHold_MoveToElement_release_build_perform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		//1. Drag and drop the element anywhere inside the box
		WebElement Draggable=driver.findElement(By.xpath("//*[@id='form:conpnl_header']"));
		
		//Action Class for move the element
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(Draggable).moveByOffset(100, 0).release().perform();
		
		//2. 
		WebElement From=driver.findElement(By.xpath("//*[@id='form:drag_content']"));
		WebElement To=driver.findElement(By.xpath("//*[@id='form:drop_content']"));
		
//		actions.clickAndHold(From).moveToElement(To).release(To).release().build().perform();
		actions.clickAndHold(From).moveToElement(To).release(To).release().perform();
		
//		driver.quit();

	}

}
