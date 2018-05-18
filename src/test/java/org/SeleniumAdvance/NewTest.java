package org.SeleniumAdvance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test Method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Method");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Method");
  }

}
