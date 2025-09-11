package seleniumInterviewProgram;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part22_01_CheckAllCheckBox {

	public static void main(String args[]) throws AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Check Basic and JavaScript Check box
		WebElement BasicCheckBox=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		BasicCheckBox.click();
		WebElement JavaScript=driver.findElement(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td[3]/div/div[2]"));
		JavaScript.click();

		List<WebElement> AllCheckBoxes=driver.findElements(By.xpath("//div[@class='col-12']//div[contains(@class,'chkbox-box')]"));
		System.out.println(AllCheckBoxes.size());
		//Check all the check box except all ready checked check box and disabled check box
		for (int i=0;i<AllCheckBoxes.size();i++) 
		{
			String LocationClass=AllCheckBoxes.get(i).getDomAttribute("class");

			if(!LocationClass.contains("disabled"))
			{
				if(!LocationClass.contains("active"))
				{
					AllCheckBoxes.get(i).click();
				}
			}
		}
	}
}
