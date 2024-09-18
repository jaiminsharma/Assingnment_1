package Basic.Assignment01;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P003_Locatelink {
	public static void main (String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver= DriverConnection.getDriver(url);
		
		WebElement link = driver.findElement(By.linkText("Create new account"));
		link.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		WebDriver driver2= DriverConnection.getDriver(url);
		WebElement link2=driver2.findElement(By.partialLinkText("Create"));
		link2.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}
	
}
