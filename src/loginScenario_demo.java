import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class loginScenario_demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//implicitWait() sets default wait time before every element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//<=5seconds
		//1 - navigate to URL
		
		//<=5seconds
		//2 - enter credentials
		
		//<=5seconds
		//3 - click on login button
		
		//<=5seconds
		//4 - verify the user is navigated to home page




		//navigate to URL
		driver.get("https://login.salesforce.com/");
						
				
				WebElement usernameElement = driver.findElement(By.xpath("//input[@id='username']"));
				WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));

				
				//explicitWait() tells the WebDriver to wait for certain conditions before maximum time exceeds
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				//multiple conditions
				wait.until(ExpectedConditions.visibilityOf(usernameElement));

				System.out.println(passwordElement.getAttribute("name"));

				//Thread.sleep pauses the execution for mentioned duration even if the element is found on the web page
				Thread.sleep(10000);
				driver.quit();

	}
}
