package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExcelPageObject {
	
	
	@FindBy(how=How.NAME, using ="userName")
	public static WebElement uname;
	
	@FindBy(how=How.NAME, using ="password")
	public static WebElement upass;

}
