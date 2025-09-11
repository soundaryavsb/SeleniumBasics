package testNGInterviewPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	@Parameters({"Company"})
	public void Details(String CompanyName)
	{
		System.out.println("Welcome to "+CompanyName);
	}
	@Test
	@Parameters({"MyName", "MyAge"})
	public void Details(String Name,int Age)
	{
		System.out.println("Hi, my name is "+Name+" and my age is "+Age);
	}
	
}
