package seleniumInterviewProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Part17_01_HandlingFailedTestCases {

//	Way 1: only Using IRetryAnalyzer interface 
//	@Test(retryAnalyzer = Part17_IRetryAnalyzer_I.class)
	
//	Way 2: using IAnnotationTransformer and IRetryAnalyzer interface
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void testcase2()
	{
		Assert.assertEquals(true, false);
	}
}
