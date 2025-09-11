package pomInterviewPractice_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Part_02_01_UpdateObject {

	@FindBy(how = How.LINK_TEXT,using = "My Profile")
	public static WebElement MyProfile;
	
	@FindBy(id ="Phone")
	public static WebElement Phone;
	
	@FindBy(id = "State")
	public static WebElement State;
	
	@FindBy(id = "Password")
	public static WebElement Password2;
	
	@FindBy(xpath = "//*[@type='submit']")
	public static WebElement UpdateProfileButton;
}
