package testNGInterviewPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {

	String name="Soundarya";
	boolean value=true;
	boolean value2=false;
	@Test
	public void assertEqualCheck_True()
	{
		Assert.assertEquals("Soundarya", name); //Assert true
	}
	@Test(expectedExceptions = AssertionError.class )
	public void assertEqualCheck_False()
	{
		Assert.assertEquals("soundarya", name); //Assert false
	}
	@Test
	public void assertNotEqualCheck_True()
	{
		Assert.assertNotEquals("soundarya", name); //Assert true
	}
	@Test(expectedExceptions = AssertionError.class )
	public void assertNotEqualCheck_False()
	{
		Assert.assertNotEquals("Soundarya", name); //Assert false
	}
	@Test
	public void assertTrueCheck_True()
	{
		Assert.assertTrue(value); //Assert true
	}
	@Test(expectedExceptions = AssertionError.class )
	public void assertTrueCheck_False()
	{
		Assert.assertTrue(value2); //Assert false
	}
	@Test
	public void assertFalseCheck_True()
	{
		Assert.assertFalse(value2); //Assert true
	}
	@Test(expectedExceptions = AssertionError.class )
	public void assertFalseCheck_False()
	{
		Assert.assertFalse(value); //Assert false
	}
		
}
