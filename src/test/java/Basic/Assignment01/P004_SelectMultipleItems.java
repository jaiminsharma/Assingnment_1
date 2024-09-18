package Basic.Assignment01;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import Connection.DriverConnection;

public class P004_SelectMultipleItems {
	
	public static void main(String[] args) throws InterruptedException{
		
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= DriverConnection.getDriver(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		
		WebElement drop= driver.findElement(By.xpath("//div[contains(text(),'Select...')]"));
	

			
	
		Actions action= new Actions(driver);
		action.click(drop)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.pause(Duration.ofSeconds(2))		
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.pause(Duration.ofSeconds(2))
		.pause(Duration.ofSeconds(2))
		.keyUp(Keys.CONTROL)
		.click()
		.build().perform();
	}
		
	

}
