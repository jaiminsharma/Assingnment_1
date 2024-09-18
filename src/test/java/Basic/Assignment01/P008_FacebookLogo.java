package Basic.Assignment01;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P008_FacebookLogo {
	
	public static void main(String[] args) {
		
		String url = "http://facebook.com";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		 WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	        
	        System.out.println("Logo found: " + (logo != null));

		
		
	}

}
