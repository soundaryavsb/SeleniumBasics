package seleniumInterviewProgram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Part16_TestNG_PageObjectModel {
	@FindBy(name="q")
	private WebElement search;
	
	public WebElement getSearch()
	{
		return search;
	}
}
