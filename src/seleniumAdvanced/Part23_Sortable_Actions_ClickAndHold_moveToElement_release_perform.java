package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part23_Sortable_Actions_ClickAndHold_moveToElement_release_perform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v134\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		//<ul><li> unordered list
		List<WebElement> sortable=driver.findElements(By.xpath("//*[@id='sortable']/li"));
		System.out.println(sortable.size());

		Actions action=new Actions(driver);

		WebElement From7to1=sortable.get(6);
		WebElement To7to1=sortable.get(0);
		action.clickAndHold(From7to1).moveToElement(To7to1).release(To7to1).release().perform();

		WebElement From6to2=sortable.get(5);
		WebElement To6to2=sortable.get(0);
		action.clickAndHold(From6to2).moveToElement(To6to2).release(To6to2).build().perform();

		WebElement From5to3=sortable.get(4);
		WebElement To5to3=sortable.get(0);
		action.clickAndHold(From5to3).moveToElement(To5to3).release(To5to3).build().perform();

		WebElement From4to4=sortable.get(3);
		WebElement To4to4=sortable.get(0);
		action.clickAndHold(From4to4).moveToElement(To4to4).release(To4to4).build().perform();

		WebElement From3to5=sortable.get(2);
		WebElement To3to5=sortable.get(0);
		action.clickAndHold(From3to5).moveToElement(To3to5).release(To3to5).build().perform();

		WebElement From2to6=sortable.get(1);
		WebElement To2to6=sortable.get(0);
		action.clickAndHold(From2to6).moveToElement(To2to6).release(To2to6).build().perform();


	}

}
