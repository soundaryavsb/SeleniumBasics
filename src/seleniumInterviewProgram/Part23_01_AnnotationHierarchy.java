package seleniumInterviewProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Part23_01_AnnotationHierarchy {
  @Test
  public void test1() {
	  System.out.println("Test1");
  }
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

  @BeforeClass
  public void beforeClass1() {
	  System.out.println("BeforeClass1");
  }
  @BeforeClass
  public void beforeClass2() {
	  System.out.println("BeforeClass2");
  }

  @AfterClass
  public void afterClass1() {
	  System.out.println("AfterClass1");
  }
  @AfterClass
  public void afterClass2() {
	  System.out.println("AfterClass2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }

}
