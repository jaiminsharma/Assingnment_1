package Basic.Assignment01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Connection.DriverConnection;

public class P011_HandleAlert {

	
		public static void main(String[] args) throws InterruptedException{
			String url = "http://demo.guru99.com/test/delete_customer.php";
			WebDriver driver = DriverConnection.getDriver(url);
			driver.findElement(By.name("cusid")).sendKeys("53920");
			Thread.sleep(2000);
	        driver.findElement(By.name("submit")).click();
	        Thread.sleep(2000);

	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	        Thread.sleep(2000);
	        
	        Alert alert2 = driver.switchTo().alert();
	        System.out.println(alert2.getText());
	        alert2.accept();
	        
//	        driver.quit();

	}

}
