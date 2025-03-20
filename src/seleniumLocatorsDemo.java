import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class seleniumLocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/chaitanaya.sethi/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		String wdHandle = driver.getWindowHandle();
		System.out.println("wdHandle " + wdHandle);
		//ID
		//By elementLocator = By.id("username");
		//By elementLocator1 = By.name("username");

		//CSS SELECTOR
		By elementLocator = By.cssSelector("#username");
		//LINK TEXT
		//By elementLocator = By.linkText("Forgot Your Password?");

		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
		driver.findElement(elementLocator).sendKeys("hpotter5@test.com");
		//driver.findElement(elementLocator).click();

		Thread.sleep(10000);

	}
}














//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Jobs@2024");
//		driver.findElement(By.xpath("//*[@id='Login']")).click();
