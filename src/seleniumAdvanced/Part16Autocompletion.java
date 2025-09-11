package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part16Autocompletion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Get all the Automation tools options in the list
		List<WebElement> ListDetails=driver.findElements(By.xpath("//*[@id='j_idt87']/div/div[1]/div[1]/div/div/select/option"));
		System.out.println("List count: "+ListDetails.size());
		
		//check if the ListDetails equal to "Puppeteer" then click the "Puppeteer" and exit the loop
		for (WebElement AutomationTool : ListDetails) {
			
			//Get the ListDetails text
			System.out.println("Automation Tool:"+AutomationTool.getText());
			
			//compare the ListDetails value for click the required value
			if(AutomationTool.getText().equals("Puppeteer"))
			{
				AutomationTool.click();
				
				//check how many times the if condition working
				System.out.println("If condition");
				
				//break the loop if the condition is satisfied
				break;
			}
			else
			{
				//check how many time the else condition is executed
				System.out.println("Else condition:");
			}
		}
	}

}
