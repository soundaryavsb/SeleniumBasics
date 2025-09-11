package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part20Links_navigate_getTitlecontains_getTextget_DomAttribute_href_tagName_a {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();

		//1. Click the Link
		WebElement Link1GotoDashboard=driver.findElement(By.linkText("Go to Dashboard"));
		Link1GotoDashboard.click();

		//Check the title and check the image is not broken
		String Link1Title=driver.getTitle();
		if(Link1Title.contains("404"))
		{
			System.out.println("Link 1 is broken");
		}
		else
		{
			System.out.println("Link 1 is not broken");
		}
		//navigate back to the default web page
		driver.navigate().back();

		//2. Get the Link URL without clicking the link
		WebElement Link2FindTheURLWithoutClickingMe=driver.findElement(By.partialLinkText("Find the URL"));
		String Link2URL=Link2FindTheURLWithoutClickingMe.getDomAttribute("href");
		System.out.println("Link 2 URL: "+Link2URL);

		//3. Broken link check
		WebElement Link3Broken=driver.findElement(By.partialLinkText("Broke"));
		Link3Broken.click();

		//Check the title and check the image is broken
		String BrokenLinkTitle=driver.getTitle(); // Get the web page title
		if(BrokenLinkTitle.contains("404"))
		{
			System.out.println("Link 3 is broken");
		}
		else
		{
			System.out.println("Link 3 is not broken");
		}

		driver.navigate().back();

		//4. Click the Link
		WebElement Link4GotoDashboard=driver.findElement(By.linkText("Go to Dashboard"));
		Link4GotoDashboard.click();

		driver.navigate().back();

		//5. Count Links
		List<WebElement> LinkCount=driver.findElements(By.tagName("a"));
		int TotalLinkCount=LinkCount.size();
		System.out.println("Link count in this page: "+TotalLinkCount);

		//6.
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Print the count of links
		System.out.println("Total number of links on the page: " + links.size());

		// Print each link's text and href (optional)
		for (WebElement link : links) {
			System.out.println("Link Text: " + link.getText());
			System.out.println("Link URL: " + link.getDomAttribute("href"));
		}

		// Close the driver
		driver.quit();



	}

}
