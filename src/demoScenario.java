import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class demoScenario {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		//Navigate to URL
		driver.get("https://login.salesforce.com");
		Thread.sleep(3000);

		String parent=driver.getWindowHandle();
		System.out.println("parent " + parent);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hpotter5@test.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jobs@2025");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		
//		driver.get("https://hogwards-dev-ed.develop.lightning.force.com/lightning/r/Lead/00Q2w00000U1CNTEA3/view");
//		
//		String fetchedText = driver.findElement(By.xpath("//html//div//h1//slot//lightning-formatted-name")).getText();
//		System.out.println(fetchedText);
//		
//		String fetchedAttribute = driver.findElement(By.xpath("//html//div//h1//slot//lightning-formatted-name")).getAttribute("slot"); 
//		System.out.println("fetchedAttribute "+ fetchedAttribute);

		//		
//		driver.findElement(By.xpath("(//a[text()='Details'])[last()]")).click();
//		
//		WebElement dropDownButtonJS = driver.findElement(By.xpath("//span[text()='Show more actions']"));
//		
//		//driver.findElement(By.xpath("//span[text()='Show more actions']")).click();
//		js.executeScript("arguments[0].click();", dropDownButtonJS);
//
//		driver.findElement(By.xpath("//a//span[text()='Edit']")).click();
//		driver.findElement(By.xpath("//label[text()='Opportunity Name']//following-sibling::div//input")).clear();
//		driver.findElement(By.xpath("//label[text()='Opportunity Name']//following-sibling::div//input")).sendKeys("edit oppty");
//		driver.findElement(By.xpath("(//lightning-button//button[text()='Save'])[last()]")).click();
//		Thread.sleep(2000);
//		String opptyName = driver.findElement(By.xpath("(//slot//records-entity-label[text()='Opportunity'])[last()]/../..//following-sibling::slot//lightning-formatted-text")).getText();
//		System.out.println(opptyName);
//		Assert.assertEquals(opptyName, "edit oppty");
//			
//		driver.quit();	

		List<WebElement> webElementList = driver.findElements(By.xpath("//a[contains(text(),'View')]"));

		for (int i=0; i<webElementList.size();i++){
			System.out.println("findElements displays text of all matching elements, which is, **** " + webElementList.get(i).getText());
		}

	}
}














