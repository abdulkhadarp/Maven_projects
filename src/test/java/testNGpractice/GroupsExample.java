package testNGpractice;

import org.testng.annotations.Test;

public class GroupsExample {
	
	
  @Test(groups= "Regression")
  public void tc1() {
	  System.out.println("Regression test case");
  }
  
  
  @Test(groups= "Regression")
  public void tc2() {
	  System.out.println("Regression test case");
  }
  
  @Test(groups= "Sanity")
  public void tc3() {
	  System.out.println("Sanity test case");
  }
  
  @Test(groups= "Regression")
  public void tc4() {
	  System.out.println("Regression test case");
  }
  
  @Test(groups= "Regression")
  public void tc5() {
	  System.out.println("Regression test case");
  }
  
  @Test(groups= "Sanity")
  public void tc6() {
	  System.out.println("Sanity test case");
  }
  
  @Test(groups= "Regression")
  public void tc7() {
	  System.out.println("Regression test case");
  }
  
  @Test(groups= "Sanity")
  public void tc8() {
	  System.out.println("Sanity test case");
  }
  
  @Test(groups= "Sanity")
  public void tc9() {
	  System.out.println("Sanity test case");
  }
  
  @Test(groups= "Regression")
  public void tc10() {
	  System.out.println("Regression test case");
  }
}
