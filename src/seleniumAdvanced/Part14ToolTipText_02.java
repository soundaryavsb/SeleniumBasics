package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part14ToolTipText_02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/form-field-tooltip/form-field-tooltip.html");
		driver.manage().window().maximize();
		
		String tooltiptext=driver.findElement(By.id("firstname")).getDomAttribute("tooltiptext");
		System.out.println("Text is:"+tooltiptext);
	}

}
