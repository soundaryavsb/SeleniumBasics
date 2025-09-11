package seleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part17Download_FileCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		driver.manage().window().maximize();

		WebElement DownloadButton=driver.findElement(By.xpath("//*[@id='j_idt93:j_idt95']/span[2]"));
		DownloadButton.click();
		
		File fileLocation=new File("C:\\Users\\D.Soundarya\\Downloads");
		
		File[] TotalFiles=fileLocation.listFiles();
		
		for (File fileName : TotalFiles) {
			if(fileName.getName().equals("TestLeaf Logo.png"))
			{
			System.out.println("Files: "+fileName.getName());
			System.out.println("File is downloaded");
			break;
			}
			else
			{
				System.out.println("else loop");
			}
		}
	}

}
