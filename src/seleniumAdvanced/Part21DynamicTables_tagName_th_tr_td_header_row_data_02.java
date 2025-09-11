package seleniumAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part21DynamicTables_tagName_th_tr_td_header_row_data_02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		//get all web element details
		List<WebElement> DueAmountDetails=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/td[4]"));
		
		//create a integer list for store the web element details
		List<Integer> DueFloatValue=new ArrayList<Integer>();
		
		// convert web element to string to integer
		for(WebElement DueElements: DueAmountDetails)
		{
		String DueString=DueElements.getText().replace("$", "").replace(".00","");
			DueFloatValue.add(Integer.parseInt(DueString));
		}
		System.out.println(DueFloatValue);

		//Find the min value in the array integer list using COLLECTION
		int MinDue=Collections.min(DueFloatValue);
		System.out.println("Minimum Due Value: "+MinDue);
		
		//create a website web Element location using minimum due value
		String LowDueWebSite="//*[@id='table1']/tbody/tr/td[normalize-space()=\'$"+MinDue+".00\']/following::td[1]";
								//*[@id="table1"]/tbody/tr/td[normalize-space()='$50.00']/following::td[1]
		System.out.println(LowDueWebSite);
		
		//Take the web site details
		
		//get the minimum due website
		WebElement Website=driver.findElement(By.xpath(LowDueWebSite));
		String LowWebsiteName=Website.getText();
		System.out.println(LowWebsiteName);
		driver.quit();

	}

}
