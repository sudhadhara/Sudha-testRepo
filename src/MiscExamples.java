import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator; 
import java.util.List;
public class MiscExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		driver.manage().window().maximize();
//
//		//BROKEN LINKS PROGRAM
//		 driver.get("https://demoqa.com/links");
//	      Thread.sleep(3000);
//	      String url="";
//	      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
//	      System.out.println("Total links on the Wb Page: " + allURLs.size());
//
//	      //We will iterate through the list and will check the elements in the list.
//	      Iterator<WebElement> iterator = allURLs.iterator();
//	      while (iterator.hasNext()) {
//	    	  url = iterator.next().getText();
//	    	  System.out.println(url);
//	      }
//	      
//	     //Close the browser session
//	      driver.quit();
	      
	      //ScrollDown example
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        driver.get("https://www.guru99.com/");
	        driver.manage().window().maximize();
	        js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
	        


	}
	
	
	
	
	

}
