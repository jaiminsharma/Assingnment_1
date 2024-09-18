package Basic.Assignment01;

import java.time.Duration;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Connection.DriverConnection;

public class P006_GmailRegister {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://accounts.google.com/SignUp";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement Fname = driver.findElement(By.name("firstName"));
		WebElement Lname = driver.findElement(By.name("lastName"));

		Fname.sendKeys("Jaimin");
		Thread.sleep(2000);
		Lname.sendKeys("Sharma");

		WebElement next = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next.click();

		Thread.sleep(2000);

		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("August");
		Thread.sleep(2000);

		WebElement dayElement = driver.findElement(By.id("day"));
		dayElement.sendKeys("12");
		Thread.sleep(2000);

		WebElement yearElement = driver.findElement(By.id("year"));
		yearElement.sendKeys("1992");
		Thread.sleep(2000);

		WebElement genderElement = driver.findElement(By.id("gender"));
		Select genSelect = new Select(genderElement);
		genSelect.selectByValue("1");
		Thread.sleep(2000);

		WebElement next2 = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next2.click();

		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Check if suggestions are displayed
		List<WebElement> suggestions = driver
				.findElements(By.xpath("//span[contains(text(),'Create your own Gmail address')]"));
		if (suggestions.size() > 0) {
			// Click on the "Create your own Gmail address" option if it appears
			suggestions.get(0).click();
			Thread.sleep(2000);
		} else {
			// If no suggestions, continue filling out the form
			WebElement userNElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("Username")));
			userNElement.sendKeys("jaiminsharma1122");
		}
		Thread.sleep(2000);

		// Continue with the next steps
		WebElement next3 = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next3.click();

		Thread.sleep(2000);

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		WebElement userNElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("Username")));
//		userNElement.sendKeys("jaiminsharma1122");
//				Thread.sleep(2000);
//				
//				WebElement next3 = driver.findElement(By.className("VfPpkd-vQzf8d"));
//				next3.click();
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				Thread.sleep(2000);

//				WebElement emailidElement=driver.findElement(By.id("selectionc2"));
//				emailidElement.click();
//				Thread.sleep(2000);

		WebElement passElement = driver.findElement(By.name("Passwd"));
		passElement.sendKeys("Tech@123");
		Thread.sleep(2000);

		WebElement conPassElement = driver.findElement(By.name("PasswdAgain"));
		conPassElement.sendKeys("Tech@123");
		Thread.sleep(2000);
		WebElement showpassElement = driver.findElement(By.className("gyrWGe"));
		showpassElement.click();

		WebElement next4 = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next4.click();

		Thread.sleep(2000);

		WebElement phnumber = driver.findElement(By.id("phoneNumberId"));
		phnumber.sendKeys("8849776064");
		Thread.sleep(2000);

		WebElement next5 = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next5.click();

		Thread.sleep(2000);

	}

}
