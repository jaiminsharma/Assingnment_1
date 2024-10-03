package Basic.Assignment01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P012_CountHyperlinks {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/web-table-element.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of hyperlinks: " + links.size());


	}

}
