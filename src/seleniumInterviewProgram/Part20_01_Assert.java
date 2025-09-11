package seleniumInterviewProgram;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Part20_01_Assert {

	@Test
	public void HardAssert_Assert()
	{
		System.out.println("Before Hard Assert");
		Assert.fail();
		System.out.println("After Hard Assert");
	}
	
	@Test
	public void SoftAsster_Verify()
	{
		System.out.println("Before Soft Assert");
		SoftAssert assert1=new SoftAssert();
		assert1.fail();
		System.out.println("After Soft Assert");
	}

}


