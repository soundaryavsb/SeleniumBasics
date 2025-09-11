package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part21DynamicTables_tagName_th_tr_td_header_row_data {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();

		//headers column count
		List<WebElement> columnHearder=driver.findElements(By.tagName("th"));
		int columnHeardersCount=columnHearder.size();
		System.out.println("Column headers count: "+columnHeardersCount);
		for (WebElement webElement : columnHearder) {
			System.out.println("Headers:"+webElement.getText());
		}


		//row count
		List<WebElement> Rows=driver.findElements(By.tagName("tr"));
		int RowsCount=Rows.size();
		System.out.println("Rows count: "+RowsCount);
		for (WebElement webElement : Rows) {
			System.out.println("Rows:"+webElement.getText());
		}

		//select next column in the row
		WebElement IndiaRepresentative=driver.findElement(By.xpath("//td/span[normalize-space()='India']//following::td[1]"));
		String IndiaRepresentativeName=IndiaRepresentative.getText();
		System.out.println("India Representative Name: "+IndiaRepresentativeName);
		
		//
	//	driver.quit();


	}

}
