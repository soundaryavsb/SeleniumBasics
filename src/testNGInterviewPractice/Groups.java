package testNGInterviewPractice;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups ={"Moto"})
	public void Moto1()
	{
		System.out.println("Start the Moto1");
	}
	@Test(groups ={"Moto"})
	public void Moto2()
	{
		System.out.println("Start the Moto2");
	}
	@Test(groups ={"Tata"})
	public void Tata1()
	{
		System.out.println("Start the Tata1");
	}
	@Test(groups ={"Tata"})
	public void Tata2()
	{
		System.out.println("Start the Tata2");
	}
	@Test(groups ={"Vivo"})
	public void Vivo1()
	{
		System.out.println("Start the Vivo1");
	}
	@Test(groups ={"Vivo"})
	public void Vivo2()
	{
		System.out.println("Start the Vivo2");
	}
}
