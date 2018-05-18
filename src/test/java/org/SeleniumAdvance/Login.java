package org.SeleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	private WebDriver driver;

  @Test
  public void f() {
	  LoginPageObject.uname.sendKeys("Simmi123");
	  LoginPageObject.upass.sendKeys("password");
	  driver.findElement(By.name("login")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\A06438_P5.Training\\Desktop\\Drivers\\geckodriver-v0.19.1-win64(1)\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com/");
	  // Initialising elements -to tell driver from where to take values
	  PageFactory.initElements(driver, LoginPageObject.class);
  }
   @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
}
