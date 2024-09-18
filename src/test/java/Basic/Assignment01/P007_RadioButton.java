package Basic.Assignment01;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Connection.DriverConnection;

public class P007_RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/radio.html";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		driver.findElement(By.id("vfb-7-1")).click();
		
	Thread.sleep(2000);
	
	driver.findElement(By.id("vfb-7-2")).click();
	
	
	
	
	
	
	
	
	
	}
	
}
