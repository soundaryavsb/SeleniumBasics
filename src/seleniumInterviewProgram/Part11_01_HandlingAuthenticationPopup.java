package seleniumInterviewProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Part11_01_HandlingAuthenticationPopup {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");

		ChromeDriver driver=new ChromeDriver(options);
//		driver.get("https://the-internet.herokuapp.com/basic_auth");

//		Change the URL with userName and Password and @
//		Eg: "https://USERNAME:PASSWORD@the-internet.herokuapp.com/basic_auth"
		
		String UserName="admin";
		String PassWord="admin";
		driver.get("https://"+UserName+":"+PassWord+"@the-internet.herokuapp.com/basic_auth");

	}

}
