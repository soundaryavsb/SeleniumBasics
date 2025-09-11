package dataDrivenInterviewPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XSSFExcelLatestGetData {

	List<String> UserName=new ArrayList<String>();
	List<String> Password=new ArrayList<String>();
	
	String[][] data=new String[UserName.size()][2];
	
	@DataProvider(name="MyDataProvider")
	public String[][] datareturnToLogin() throws IOException
	{
		
//		System.out.println("Data: "+data);
		data=xssfExcelData();
		return data;
	}
	
	@Test(dataProvider = "MyDataProvider")
	public void Login(String U_Name, String P_word) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys(U_Name);

		WebElement Password=driver.findElement(By.xpath("//*[@name='password']"));
		Password.sendKeys(P_word);

		Thread.sleep(2000);

		WebElement Login=driver.findElement(By.xpath("//*[@type='submit']"));
		Login.click();

		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public String[][] xssfExcelData() throws IOException
	{
		FileInputStream excel=new FileInputStream("C:\\DataDriven\\UserNamePasswordApachePOI.xlsx");
		Workbook workbook=new XSSFWorkbook(excel);
		Sheet sheet=workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator=sheet.rowIterator();
		
		//for avoid header row in excel sheet.
		if(rowIterator.hasNext())
		{
			rowIterator.next();
		}
		
		int i=2;
		//Get the data in excel
		while(rowIterator.hasNext())
		{
			Row rowvalues=rowIterator.next();
			Iterator<Cell> columnIterator=rowvalues.cellIterator();
			while (columnIterator.hasNext()) {
				Cell cellValue=columnIterator.next();
				
				if(i%2==0)
				{
					UserName.add(cellValue.getStringCellValue());
				}
				else
				{
					Password.add(cellValue.getStringCellValue());
				}
				i++;	
			}
		}
		
		for(int i1=0;i1<UserName.size();i1++)
		{
			data[i1][0]=UserName.get(i1);
			data[i1][1]=Password.get(i1);
		}
		return data;
//		System.out.println(UserName);
//		System.out.println(Password);
		
	}
}
