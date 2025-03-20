import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.itextpdf.text.List;

public class TestExamples2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://login.salesforce.com");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hpotter5@test.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing@2025");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.get("https://hogwards-dev-ed.develop.lightning.force.com/lightning/r/Opportunity/006Ig000003ZWrvIAG/view");
		driver.quit();
		
//		String fetchedURL;
//		ChromeOptions options = new ChromeOptions();
//		WebDriver driver = new ChromeDriver(options);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//		driver.get("https://login.salesforce.com/");
//		driver.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
//		fetchedURL = driver.getCurrentUrl();
//		//System.out.println("Fetched URL " + fetchedURL);
//		
//		//explicitWait() tells the WebDriver to wait for certain conditions before maximum time exceeds
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		//multiple conditions
//		
//		//wait.until(ExpectedConditions.visibilityOf(By.xpath("//a[text()='Forgot Your Password?']")));
//		//getText()
//		String fetchedText = driver.findElement(By.xpath("//h1[@id='header']")).getText();
//		System.out.println("Fetched Text using getText() method is => " + fetchedText);
//		
//		//getAttribute()
//		String fetchedAttribute = driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
//		System.out.println("Fetched Attribute using getAttribute() method is => " + fetchedAttribute);
//				
//
//		
//		
//		
//		driver.quit();

	
	
	}
	
	

}
