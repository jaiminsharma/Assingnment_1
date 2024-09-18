package Basic.Assignment01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Connection.DriverConnection;

public class P005_ManageAlert {

	public static void main(String[] args) throws InterruptedException {

		{
			WebDriver driver = DriverConnection.getDriver("https://demoqa.com/alerts");
			{

				// 1.alert
				WebElement btn = driver.findElement(By.id("alertButton"));
				Thread.sleep(2000);
				btn.click();
				Alert alt = driver.switchTo().alert();
				Thread.sleep(2000);
				alt.accept();
				Thread.sleep(2000);

			}

			{
				// 2.after some duration

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

				WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
				Thread.sleep(5000);
				btn2.click();
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alt2 = driver.switchTo().alert();
				alt2.accept();
				Thread.sleep(2000);
			}

			{

				// 3.alert with options ok/cancel

				WebElement btn3 = driver.findElement(By.id("confirmButton"));
				Thread.sleep(4000);
				btn3.click();
				Alert alert3 = driver.switchTo().alert();
				Thread.sleep(2000);
				alert3.accept();
			}
			{

				// 4.alert with data
				Thread.sleep(2000);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,150)", "");
				WebElement btn4 = driver.findElement(By.id("promtButton"));
				Thread.sleep(2000);
				btn4.click();
				Alert alert4 = driver.switchTo().alert();
				Thread.sleep(2000);
				alert4.sendKeys("jaimin sharma");
				Thread.sleep(2000);

				alert4.accept();
			}
		}

	}
}
