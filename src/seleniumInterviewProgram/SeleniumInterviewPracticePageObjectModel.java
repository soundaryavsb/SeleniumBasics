package seleniumInterviewProgram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumInterviewPracticePageObjectModel {

 @FindBy(name="q")
 private WebElement search;
 
 public WebElement getSearch()
 {
	 return search;
 }

}
