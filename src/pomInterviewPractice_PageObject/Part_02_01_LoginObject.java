package pomInterviewPractice_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Part_02_01_LoginObject {

	@FindBy(how = How.ID, using = "email")
	public static WebElement UserName;
	
	@FindBy(id = "password")
	public static WebElement PassWord;
	
	@FindBy(id = "submitBTN")
	public static WebElement LoginButton;
	
}
