package seleniumInterviewProgram;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part08_03_MaximizeWindow_setSize_Dimention_width_height {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/button");
		Dimension dimension=new Dimension(1920,1200);
		driver.manage().window().setSize(dimension);
	}
}
