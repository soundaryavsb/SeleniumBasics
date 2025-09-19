package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part19Image_brokenImage_naturalWidth_0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		
		WebElement brokenImage1=driver.findElement(By.xpath("//*[@id='content']/div/img[1]"));
		
		//Check the naturalWidth output
		String brokenImageNaturalWidth1=brokenImage1.getDomProperty("naturalWidth");
		System.out.println("broken Image1 width:"+brokenImageNaturalWidth1);
		
		//Check the image is broken or not
		if(brokenImage1.getDomProperty("naturalWidth").equals("0"))
		{
			System.out.println("Image1: Yes, Its a broken image");
		}
		else
		{
			System.out.println("Image1: Its not a broken image");
		}
		
		//Unbroken image
		WebElement Image3=driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[3]"));
		
		String brokenImageNaturalWidth3=Image3.getDomProperty("naturalWidth");
		System.out.println("broken Image3 width:"+brokenImageNaturalWidth3);
		
		if(Image3.getDomProperty("naturalWidth").equals("0"))
		{
			System.out.println("Image3: Yes, Its a broken image");
		}
		else
		{
			System.out.println("Image3: Its not a broken image");	
		}
		

		driver.quit();
	}

}
