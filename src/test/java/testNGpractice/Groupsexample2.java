package testNGpractice;

import org.testng.annotations.Test;

public class Groupsexample2 {
  @Test(groups= "Sanity")
  public void tc1() { 
	System.out.println("Sanity test case");
	}
  
  @Test(groups= "Regression")
  public void tc2() {
	  System.out.println("Regression test case");
  }
  
  @Test(groups= "Sanity")
  public void tc3() {
	  System.out.println("Sanity test case");
  }
  
  @Test(groups= "Smoke")
  public void tc4() {
	  System.out.println("Smoke test case");
  }
  
  @Test(groups= "Smoke")
  public void tc5() {
	  System.out.println("Smoke test case");
  }
}
