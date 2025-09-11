package seleniumInterviewProgram;

import org.testng.annotations.Test;

public class Part25_01_timeOut {
@Test(timeOut = 2000)
public void testing() throws InterruptedException
{
	Thread.sleep(3000);
	System.out.println("Playing with code");
}
}
