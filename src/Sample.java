import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/chaitanaya.sethi/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wadoh--qaphased.sandbox.my.salesforce.com/");
		By elementLocator = By.xpath("//*[@id='username']");
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
		driver.findElement(elementLocator).sendKeys("ankit.thapar@mtxb2b.com.helms.qaphased");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("MTX@2024");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='slds-button slds-button_neutral search-button slds-truncate']")).click();
		driver.findElement(By.xpath("//*[@class='slds-button slds-button_neutral search-button slds-truncate']")).sendKeys("Automation Test");
		//driver.findElement(By.xpath("//*[@class='instant-results-list']/child::search_dialog-instant-result-item[4]")).click();
		driver.findElement(By.xpath("//*[@class='instant-results-list']/child::search_dialog-instant-result-item/following::span[@title='Automation Test']/following-sibling::div[@class='slds-clearfix slds-text-heading--label-normal slds-show slds-truncate']/descendant::span[text()='Account • 1234567890']")).click();
		//*[@class='instant-results-list']/child::search_dialog-instant-result-item/following::span[@title='Automation Test']/following-sibling::div[@class='slds-clearfix slds-text-heading--label-normal slds-show slds-truncate']/descendant::span[text()='Account • 1234567890'];
		WebElement loginButton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Log in to Experience as User'] ")));
		driver.findElement(By.xpath("//button[text()='Log in to Experience as User'] ")).click();
		WebElement startApplicationbutton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title='Start a New Application']")));
		driver.findElement(By.xpath("//*[@title='Start a New Application']")).click();
		WebElement radioButton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Animal Massage Certification for Large Animals']/preceding-sibling::span")));
		driver.findElement(By.xpath("//*[text()='Audiologist Interim Permit']/preceding-sibling::span")).click();
		WebElement nextbutton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextbutton);
		nextbutton.sendKeys(Keys.RETURN);
		//Actions action = new Actions(driver);
		//action.moveToElement(nextbutton).click().perform();
		
		//verifying the presence of prerequiste text
		String prerequiste = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Pre-requisite Information']"))).getText();
	    String pretext = driver.findElement(By.xpath("//*[@class='required_box']")).getText();
	    	
		presence(prerequiste,"Pre-requisite Information");
		presence(pretext,"Thank you for applying for an Audiologist License or Audiologist Interim Permit in Washington State. This online application will guide you through the process to provide the information required.\n"
				+ "\n"
				+ "To review the requirements for the Audiologist License, please visit the Department of Health.");
		driver.findElement(By.xpath("//*[@title='Continue']")).click();
		
		
		//Demographic Information page text
		//Validating the presence of the fields
		List<WebElement> elements = new ArrayList<>();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Demographic Information']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']"))));
		//WebElement Demographic_Information = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Demographic Information']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")));
		WebElement required_field_text = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=' Indicates a required field']")));
		WebElement helptext_one = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Please review your demographic information below:']")));
		//Personal information section
		WebElement personal_information = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Personal Information']")));
		WebElement first_name = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='First Name']")));
		WebElement middle_name = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Middle Name']")));
		WebElement last_name = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Last Name']")));
		WebElement dob = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Date of Birth (mm/dd/yyyy)']")));
		WebElement ssn = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Social Security Number']")));
		WebElement gender = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Gender']")));
		//Address section
		WebElement address = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']")));
		WebElement street = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='Street'][1]")));
		WebElement city = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='City'][1]")));
		WebElement country = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='Country'][1]")));
		WebElement state = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='State or Province'][1]")));
		WebElement zipcode = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='Zip Code'][1]")));
		WebElement county = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='County'][1]")));
		//Contact information
		WebElement phonenumber = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Phone Number']")));
		WebElement cellnumber = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Cell Number']")));
		WebElement emailaddress = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Email Address']")));
		WebElement mailingaddress = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Mailing Address if different than above:']")));
		WebElement question_one = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Have you ever been known under any other names? Will this application contain documents with your different name?']")));
	    driver.findElement(By.xpath("//*[text()='Yes']/preceding-sibling::span")).click();
	    WebElement alternatename = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Alternate Names:']")));
	    presence(alternatename.getText(),"Alternate Names:");
		
	}
	
	public static void presence(String a , String b) {
		if(a.equalsIgnoreCase(b))
			System.out.println("The expected text " + b + "is correct as actual text " + a);
		else
			System.out.println("The expected text " + b + "is not correct as actual text " + a);
	}

}
