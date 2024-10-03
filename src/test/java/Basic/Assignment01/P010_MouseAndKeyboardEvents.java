package Basic.Assignment01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.DriverConnection;

public class P010_MouseAndKeyboardEvents {
	public static void main(String[] args) throws InterruptedException {
        
		String url = "https://www.amazon.in/";
		WebDriver driver= DriverConnection.getDriver(url);
		Thread.sleep(3000);
		
		WebElement Mxplayer = driver.findElement(By.linkText("MX Player"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bs = driver.findElement(By.linkText("Best Sellers"));
		WebElement Deal = driver.findElement(By.linkText("Today's Deals"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Mxplayer).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(sell).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(bs).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(Deal).build().perform();
		sell.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		Thread.sleep(2000);
		
		String url2 = "https://www.google.com/";
		WebDriver driver2=DriverConnection.getDriver(url2);
		
		WebElement search = driver2.findElement(By.name("q"));
		
		Actions action = new Actions(driver2);
		
		action.click(search)
		.keyDown(Keys.SHIFT)
		.sendKeys("Tops maninagar")
		.keyUp(Keys.SHIFT)
		.pause(Duration.ofSeconds(3))
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.build()
		.perform();
		
    }


}
