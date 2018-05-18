package org.SeleniumAdvance;

import org.testng.annotations.Test;

import Utility.ExcelPageObject;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ActionsTest {
	private WebDriver driver;
  @Test(priority=0)
  public void f() {
	  LoginPageObject.uname.clear();
		LoginPageObject.uname.sendKeys("Lalitha");
		LoginPageObject.upass.clear();
		LoginPageObject.upass.sendKeys("password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	  
  }
  
  @Test(priority=1)
  public void Categories() throws Exception {
	  
	  Thread.sleep(2000);
	  WebElement category =driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
	  Thread.sleep(2000);
	  Actions act =new Actions(driver);
	  act.moveToElement(category).click().build().perform();
	  
	  WebElement electronics =driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"));
	  act.moveToElement(electronics).click().build().perform();
	  
	  WebElement Headphones =driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"));
	  act.moveToElement(Headphones).click().build().perform();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getTitle(),"Search");
	  
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("123456");
	  driver.findElement(By.name("password")).sendKeys("Pass@456");
	  driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[1]/div[3]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\A06438_P5.Training\\Desktop\\Drivers\\geckodriver-v0.19.1-win64(1)\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp/login.htm");
		PageFactory.initElements(driver, LoginPageObject.class);
  }

  @AfterTest
  public void afterTest() {
  }

}
