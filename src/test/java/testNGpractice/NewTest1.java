package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
	
  @Test
  public void tc1() throws InterruptedException {
	  System.setProperty("Webdriver.driver.edge", "D:\\Automation Testing\\web drivers\\chromedriver.exe");
	  driver= new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
  } 
  
  @Test
  public void tc2() throws InterruptedException {
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
  }
  
  @Test
  public void tc3() throws InterruptedException {
	  driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
	  Thread.sleep(2000);
  }
  
  @Test
  public void tc4() throws InterruptedException {
	  driver.findElement(By.id("createAccountSubmit")).click();
	  Thread.sleep(2000);
  }
  
  @Test
  public void tc5() {
	  driver.close();
    
  }
}