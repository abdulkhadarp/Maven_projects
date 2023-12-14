package webLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
			System.setProperty("Webdriver.driver.chrome", "D:\\Automation Testing\\web drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			
			driver.manage().window().maximize();
			
			Actions mouseact= new Actions(driver);
			
			WebElement about= driver.findElement(By.linkText("Interest-Based Ads"));
			mouseact.scrollToElement(about).build().perform();
			Thread.sleep(3000);
			
			driver.findElement(By.partialLinkText("-Based Ads")).click();
			Thread.sleep(3000);

			WebElement security = driver.findElement(By.linkText("Your Security"));
			mouseact.moveToElement(security).build().perform();
	}

}
