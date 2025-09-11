package seleniumInterviewProgram;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part06_02_Screenshot_RobotClass_AlertScreenShot {

	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		// Trigger simple alert
		WebElement SimpleAlert=driver.findElement(By.id("accept"));
		SimpleAlert.click();
		
		//Get alert screenShot by using Robot Class
		// Capture screenshot using Robot class
		Robot robot=new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage AlertSrc=robot.createScreenCapture(rectangle);
		//Destination file location
		File AlertDest=new File("./snaps/AlertScreen.png");
		//Write the source screen in the Destination File
		ImageIO.write(AlertSrc, "png", AlertDest);
		
		driver.quit();
		
		
	}

}
