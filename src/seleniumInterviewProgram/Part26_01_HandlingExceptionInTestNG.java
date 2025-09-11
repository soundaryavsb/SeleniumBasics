package seleniumInterviewProgram;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Part26_01_HandlingExceptionInTestNG {
  @Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
  public void testing() throws InterruptedException {
	  Thread.sleep(3000);
	  System.out.println("Playing with TestNG Testing");
  }
  
}
