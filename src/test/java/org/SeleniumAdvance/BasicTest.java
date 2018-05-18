package org.SeleniumAdvance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class BasicTest {
	
	private WebDriver driver;
  @Test
  public void Basic() {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("Simmi");
	  driver.findElement(By.name("lastName")).sendKeys("Arora");
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("123456789");;
	  driver.findElement(By.id("userName")).sendKeys("simmi.arora@gmail.com");
	  driver.findElement(By.name("address1")).sendKeys("abc");
	  Select CountryValue =new Select(driver.findElement(By.name("country")));
	  CountryValue.selectByVisibleText("UNITED KINGDOM");
	  driver.findElement(By.id("email")).sendKeys("Simmi123");
	  driver.findElement(By.name("password")).sendKeys("password");
	  driver.findElement(By.name("confirmPassword")).sendKeys("password");
	  driver.findElement(By.name("register")).click();
	  
			 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\A06438_P5.Training\\Desktop\\Drivers\\geckodriver-v0.19.1-win64(1)\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}


   