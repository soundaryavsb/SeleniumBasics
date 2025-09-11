package seleniumInterviewProgram;

import org.testng.annotations.Test;

public class Part27_01_AlwaysRun {
  @Test(timeOut = 2000)
  public void parentsPermission() throws InterruptedException{
	  Thread.sleep(3000);
	  System.out.println("Parents Permission Given");
  }
  
  @Test(dependsOnMethods = "parentsPermission",alwaysRun = true)
  public void loveMarriage()
  {
	  System.out.println("Marriage Happened");
  }
}
