package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part10CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//1. Basic CheckBox
		WebElement BasicCheckBox=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		BasicCheckBox.click();
		
		//2. Notification check box click
		WebElement NotificationCheck=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']/div[2]"));
		NotificationCheck.click();
		
		//uncheck
//		Thread.sleep(2000);
		NotificationCheck.click();
		
		//3. check multiple check box
		WebElement JavaCheck=driver.findElement(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td[1]/div/div[2]"));
		JavaCheck.click();
		
		WebElement JavaScript=driver.findElement(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td[3]/div/div[2]"));
		JavaScript.click();
		
		//4. Tri-state check box
		WebElement Tribox=driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		Tribox.click();
//		Thread.sleep(2000);
		Tribox.click();
//		Thread.sleep(2000);
		Tribox.click();
		
//		Thread.sleep(2000);
		//5. Toggle switch
		WebElement Toggle=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt100']/div[2]"));
		Toggle.click();
//		Thread.sleep(2000);
		Toggle.click();
		
		//6. check the box is disabled
		WebElement DisabledBox=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt102']"));
		boolean DisabledBoxStatus=DisabledBox.isDisplayed();
		System.out.println("The Box is Disabled: "+DisabledBoxStatus);
		
		//7. DropDown - Multiple option check
		WebElement DropDown=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/div[3]"));
		DropDown.click();
		
		WebElement SearchBox=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[2]/input"));
		SearchBox.sendKeys("Miami");
		
		WebElement ClickVisibleOption=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]"));
		ClickVisibleOption.click();

		SearchBox.clear();
		SearchBox.sendKeys("London");
		ClickVisibleOption.click();
		
		SearchBox.clear();
		SearchBox.sendKeys("Rome");
		ClickVisibleOption.click();
		
		WebElement CloseMultipleBox=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/a"));
		CloseMultipleBox.click();
		
//		driver.quit();
	}

}
