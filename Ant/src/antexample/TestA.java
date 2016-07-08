package antexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestA {
  @Test
  public void f() 
  
  {
	System.out.println("Welcome");  
	System.out.println("Welcome");    
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
