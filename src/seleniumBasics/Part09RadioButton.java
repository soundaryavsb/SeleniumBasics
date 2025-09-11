package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part09RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();

		//1. select the Radio button
		WebElement FireFoxSelect=driver.findElement(By.xpath("//*[@id='j_idt87:console1']/tbody/tr/td[2]/div/div[2]/span"));
		FireFoxSelect.click();
		
		//2. Find default selected radio button
		WebElement chromebutton=driver.findElement(By.id("j_idt87:console2:0"));
		boolean chromeStatus=chromebutton.isSelected();
		
		WebElement FirefoxButton=driver.findElement(By.id("j_idt87:console2:1"));
		boolean fireFoxStatus=FirefoxButton.isSelected();
		
		WebElement SafariButton=driver.findElement(By.id("j_idt87:console2:2"));
		boolean SafariStatus=SafariButton.isSelected();	
															
		WebElement EdgeButton=driver.findElement(By.id("j_idt87:console2:3"));
		boolean EdgeStatus=EdgeButton.isSelected();
		
		System.out.println("Chrome button is selected: "+chromeStatus);
		System.out.println("FireFox button is selected: "+fireFoxStatus);
		System.out.println("Safari button is selected: "+SafariStatus);
		System.out.println("Edge button is selected: "+EdgeStatus);

		//3. select 41-60 Age Radio button
		WebElement Age41to60=driver.findElement(By.xpath("//*[@id='j_idt87:age']/div/div[3]/div/div[2]/span"));
		Age41to60.click();
		
//		driver.quit();
	}

}
