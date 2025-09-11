package dataDrivenInterviewPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderExample_04 {

	String[][] data= null;

	@DataProvider(name="MydataProvider")
	public String[][] dataProviderMethod() throws BiffException, IOException
	{
		data=excelData();
		return data;
	}
	public String[][] excelData() throws BiffException, IOException
	{
		FileInputStream excel=new FileInputStream("C:\\DataDriven\\UserNamePassword.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		
		int RowCount=sheet.getRows();
		int columnCount=sheet.getColumns();
		
		String[][] data=new String[RowCount-1][columnCount];
		
		for(int i=1;i<RowCount;i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				data[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		
		return data;

	}

	@Test(dataProvider = "MydataProvider")
	public void loginWithCorrectUserName(String U_Name, String P_Word) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys(U_Name);

		WebElement Password=driver.findElement(By.xpath("//*[@name='password']"));
		Password.sendKeys(P_Word);

		Thread.sleep(2000);

		WebElement Login=driver.findElement(By.xpath("//*[@type='submit']"));
		Login.click();

		Thread.sleep(2000);
		driver.quit();

	}

}
