package Basic.Assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class P009_DropdownSelection {

	public static void main(String[] args) {

		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement country = driver.findElement(By.name("country"));
		Select contrysSelect = new Select(country);
		contrysSelect.selectByVisibleText("INDIA");
	}
}
