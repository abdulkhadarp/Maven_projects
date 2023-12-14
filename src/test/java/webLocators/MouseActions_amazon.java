package webLocators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;


public class MouseActions_amazon {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.driver.chrome", "D:\\Automation Testing\\web drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		
		Actions mouseact= new Actions(driver);
		
		
	    )

	}

}
