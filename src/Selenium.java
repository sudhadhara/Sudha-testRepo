import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kohls.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
     // Get and print the title of the page
    	String title = driver.findElement(By.xpath("//a[@title='Kohls Logo']")).getText();
    	  System.out.println("Page title: " + title);

          // Locate search box and enter text
    	WebElement searchbox=driver.findElement(By.xpath("//input[@type='text' and @name='search']"));
    	searchbox.sendKeys("Kids Dresses");
        searchbox.submit();
     // Wait for search results to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Scroll down to the bottom of the page
       // JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); - how to scroll?
       // driver.findElement(By.xpath("//input[@type='text' and @name='search']")).sendKeys("Kids Dresses");
        
		

	}

}
