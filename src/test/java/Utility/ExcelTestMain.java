package Utility;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ExcelTestMain {

	private WebDriver driver;
	private static int rownum=0;

	@DataProvider(name="TestLogin")
	public String[][] login_data() throws Exception {
		Excel.setExcelPath("Sheet1", "C:\\Users\\A06438_P5.Training\\Desktop\\testdata.xlsx");
		String[][] tabledata=Excel.getExcelTable();
		return tabledata;

	}



	@Test(dataProvider="TestLogin")

	public void f(String uname, String upass) throws Exception {
		try {


			Excel.setExcelPath("Sheet1", "C:\\Users\\A06438_P5.Training\\Desktop\\testdata.xlsx");
			ExcelPageObject.uname.clear();
			ExcelPageObject.uname.sendKeys(uname);
			ExcelPageObject.upass.clear();
			ExcelPageObject.upass.sendKeys(upass);
			driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

			Assert.assertEquals(driver.getTitle(), "Home");

			Excel.setExcelCell( rownum , 2, "Pass");
			Thread.sleep(2000);
		}
		catch(AssertionError e) {
			Excel.setExcelCell(rownum, 2, "Fail");
		}
		finally {

			rownum++;
			driver.navigate().to("http://localhost:8083/TestMeApp/login.htm");

		}
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\A06438_P5.Training\\Desktop\\Drivers\\geckodriver-v0.19.1-win64(1)\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp/login.htm");
		PageFactory.initElements(driver, ExcelPageObject.class);
	}

	@AfterTest
	public void afterTest()  {

		driver.close();

	}

}
