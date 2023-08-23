package base;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	public WebDriver driver;
	
	@BeforeSuite
	public  void setDriver() {
//	ChromeOptions options = new ChromeOptions();
//	    //options.addArguments("incognito");
//		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//		
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		
	}
	@AfterSuite
	public void closeWindows() 
	{
		driver.close();
		//driver.quit();
	}
	
	
}
