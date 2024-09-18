package Basic.Assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P001_PHPTravels {
	public static void main(String[] args) throws InterruptedException{
		String url = "https://phptravels.com/demo/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("Driya");
		Thread.sleep(2000);

		WebElement lnameElement = driver.findElement(By.name("last_name"));

		lnameElement.sendKeys("Sharma");
		Thread.sleep(2000);

		WebElement wnumElement = driver.findElement(By.name("whatsapp"));
		wnumElement.sendKeys("8849776064");
		Thread.sleep(2000);

		WebElement bunamElement = driver.findElement(By.name("business_name"));
		bunamElement.sendKeys("Mobweb solution");
		Thread.sleep(2000);
		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("jaiminsharma12892@gmail.com");
		Thread.sleep(2000);
		
		  // Find the element that contains the math question
        WebElement questionElement = driver.findElement(By.xpath("//h5[@class='cw w-100 text-center']//small[1]")); // Assuming the question has an id 'math-question'
        String questionText = questionElement.getText();
        System.out.println("Question Text: " + questionText);

        
        String[] parts = questionText.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);

      
        int sumresults = num1 + num2;

        
        WebElement Result = driver.findElement(By.id("number")); // Assuming the input field for the result has the name 'result'
        Result.sendKeys(String.valueOf(sumresults));
        Thread.sleep(2000);

      
        WebElement submit = driver.findElement(By.id("demo"));
        submit.click();
		
		
		

	}

}
