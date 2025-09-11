package seleniumInterviewProgram;

import org.testng.annotations.Test;

public class Part24_01_RunTestMultileTimesWithoutLoop_InvocationCount {

	@Test(invocationCount=3)
	public void Multipletime()
	{
		System.out.println("Keep Moving Forward :)");
	}
}
