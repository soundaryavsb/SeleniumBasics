package seleniumInterviewProgram;

import org.testng.annotations.Test;

public class SeleniumInterviewPractice {

	@Test(timeOut = 2000)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test1");
	}
	
	@Test(dependsOnMethods="test",alwaysRun = true)
	public void test2()
	{
		System.out.println("Test2");
	}

}
