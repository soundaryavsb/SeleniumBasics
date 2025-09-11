package testNGInterviewPractice;

import org.testng.annotations.Test;

public class Priority {

		@Test(priority = 0)
		public void StartACar()
		{
			System.out.println("Start the car");
		}
		@Test(priority = 5, enabled = false)
		public void playMusic()
		{
			System.out.println("Play the music");
		}
		@Test(priority = 1)
		public void PutFirstGear()
		{
			System.out.println("Put First Gear");
		}
		@Test(priority = 2)
		public void PutSecondGear()
		{
			System.out.println("Put Second Gear");
		}
		@Test(priority = 3)
		public void PutThirdGear()
		{
			System.out.println("Put Third Gear");
		}
		@Test(priority = 4)
		public void PutForthGear()
		{
			System.out.println("Put Forth Gear");
		}
	}

