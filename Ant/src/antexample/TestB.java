package antexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestB {
	public WebDriver driver;
	
  @Test
  public void f() {
	  //driver.get("http://www.google.com/");
	System.out.println("Welcome");  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
