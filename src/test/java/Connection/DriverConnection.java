package Connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverConnection {
	
	public static WebDriver getDriver (String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
		
	}

}
