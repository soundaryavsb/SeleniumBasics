package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part08Alert_alertInterface {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//1. Alert accept only
		WebElement alertbutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']/span[2]"));
		alertbutton.click();
		
		driver.switchTo().alert().accept();
		
		//2. Confirm alert - ok and cancel buttons - click cancel
		
		WebElement confirmAlert=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']/span[2]"));
		confirmAlert.click();
		
		driver.switchTo().alert().dismiss();
		
		//3. Simple dialog - Okay at center - click okay
		
		WebElement sweetBox=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']/span[2]"));
		sweetBox.click();
		Thread.sleep(3000);
		
		WebElement DismissButton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']/span[2]"));
		DismissButton.click();
		
		//4 Modal Dialog - click x on the top of the dialog box
		
		WebElement ModalBox=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']/span[2]"));
		ModalBox.click();
		Thread.sleep(3000);
		
		WebElement XClick=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101']/div[1]/a/span"));
		XClick.click();
		
		//5. Prompt box:
			// a. enter value and click Okay
		
		WebElement promptBox=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']/span[2]"));
		promptBox.click();
		
		Alert PromptText=driver.switchTo().alert();
		PromptText.sendKeys("sou");
		PromptText.accept();
		
			//b. cancel the prompt box without entering the text
		promptBox.click();
		
		Alert PromptText1=driver.switchTo().alert();
		PromptText1.dismiss();
		
		
		
	}

}
