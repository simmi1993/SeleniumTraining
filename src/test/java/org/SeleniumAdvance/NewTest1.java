package org.SeleniumAdvance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void NewTest(String uname , String pass) {
	  System.out.println(uname+""+pass);
  }
  
  @DataProvider(name="NewTest")
  public String[][] dp(){
	  return new String[][] {
	  new String[] { "simmi" ,"arora" },
	  new String[] { "arora","simmi" },
  };
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After");
  }

}
