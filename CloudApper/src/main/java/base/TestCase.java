package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase extends DriverSetup {
	
	String baseUrl= " https://web.cloudapper.com";
	@Test
	public void login() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		//(//input[@id='txtEmail'])[1] m2sysqa.05+2@gmail.com,  pass:Qatesting@1
		//driver.findElement(By.xpath("(//input[@id='txtEmail'])[1]']'")).sendKeys("m2sysqa.05+2@gmail.com");
        
		driver.findElement(By.xpath("(//input[@id='txtEmail'])[1]")).sendKeys("m2sysqa.05+2@gmail.com");
		driver.findElement(By.cssSelector("#txtUserPassword")).sendKeys("Qatesting@1");
        driver.findElement(By.cssSelector("#btnLogin")).click();
        Thread.sleep(5000);
        //(//a[@id='createApp'])[1]
//       WebElement elements = driver.findElement(By.xpath("(//a[@id='createApp'])[1]"));
//              Actions act = new Actions(driver);
//              act.moveToElement(elements).perform();
//              Thread.sleep(5000);
        
       //a[id='createApp'] span[class='nav-btn nav-item-transition nav-item-color']
	}
	

	

}
