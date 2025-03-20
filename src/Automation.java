import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
 

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/gnaneshwari.p/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wadoh--uatphased.sandbox.lightning.force.com/lightning/page/home");
		By elementLocator = By.xpath("//*[@id='username']");
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
		driver.findElement(elementLocator).sendKeys("chaitanaya.sethi@mtxb2b.com.helms.uatphased");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Jobs@2024");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(40000);
		
		WebElement accounts = driver.findElement(By.xpath("//a[contains(@href, 'lightning/o/Account/home')]"));
		accounts.sendKeys(Keys.ENTER);
		Thread.sleep(20000);
		
		List<WebElement> firstelements = driver.findElements(By.xpath("//a[@data-refid='recordId']"));
		 if (!firstelements.isEmpty()) {
	            WebElement firstElement = firstelements.get(0);
	            firstElement.click();
	            Thread.sleep(20000);
	           String originalURL = driver.getCurrentUrl();
	           // New ID to replace
	           String newID = "001BZ00000F30veYAB";
	           
	           // Replace the original ID with the new ID
	           String modifiedURL = originalURL.replaceAll("/Account/\\w+/view", "/Account/" + newID + "/view");
	           
	           // Open the modified URL
	           driver.get(modifiedURL);
	           Thread.sleep(20000);
	            
	        } else {
	            System.out.println("No elements found matching the XPath");
	        }
		
		
		//click on search
		//driver.findElement(By.xpath("//*[@class='slds-button slds-button_neutral search-button slds-truncate']")).click();
		//driver.findElement(By.xpath("//*[@class='slds-button slds-button_neutral search-button slds-truncate']")).sendKeys("Automation Test");
		
		//driver.findElement(By.xpath("//*[@class='instant-results-list']/child::search_dialog-instant-result-item[4]")).click();
		
		//driver.findElement(By.xpath("//*[@class='instant-results-list']/child::search_dialog-instant-result-item/following::span[@title='Automation Test']/following-sibling::div[@class='slds-clearfix slds-text-heading--label-normal slds-show slds-truncate']/descendant::span[text()='Account • 1234567890']")).click();
		//*[@class='instant-results-list']/child::search_dialog-instant-result-item/following::span[@title='Automation Test']/following-sibling::div[@class='slds-clearfix slds-text-heading--label-normal slds-show slds-truncate']/descendant::span[text()='Account • 1234567890'];
		WebElement loginButton = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Log in to Experience as User'] ")));
		driver.findElement(By.xpath("//button[text()='Log in to Experience as User'] ")).click();
		WebElement startApplicationbutton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title='Start a New Application']")));
		driver.findElement(By.xpath("//*[@title='Start a New Application']")).click();
		
		WebElement bbutton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='H']")));
		driver.findElement(By.xpath("//*[text()='H']")).click();
		
		WebElement radioButton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Home Care Aide Certification']/preceding-sibling::span")));
		driver.findElement(By.xpath("//*[text()='Home Care Aide Certification']/preceding-sibling::span")).click();
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
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=' Indicates a required field']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Please review your demographic information below:']"))));
	
		//Personal information section
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Please review your demographic information below:']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Personal Information']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='First Name']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Middle Name']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Last Name']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Date of Birth']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Social Security Number']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Gender']"))));
		
		//Address section
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='Street'][1]"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='City'][1]"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='Country'][1]"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='State or Province'][1]"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='Zip Code'][1]"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Address']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::span[text()='County'][1]"))));
		
		//Contact information
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Phone Number']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Cell Number']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Email Address']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Mailing Address if different than above:']"))));
		elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Have you ever been known under any other names? Will this application contain documents with your different name?']"))));
		//elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Alternate Names:']"))));
	    //driver.findElement(By.xpath("//*[text()='Yes']/preceding-sibling::span")).click();
	   //presence(alternatename.getText(),"Alternate Names:");
		
		//calling a method to compare the text
		compareElements(elements);
		
		//enter save & Next without filling any data
		//WebElement saveandnext = driver.findElement(By.xpath("//span[text()='Exit']/following::span[text()='Save & Next'][1]"));
		WebElement saveandnext = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Exit']/following::button[@aria-label='Save & Next'][1]")));
		//saveandnext.click();
		saveandnext.sendKeys(Keys.RETURN);
		
		//verify that errors occurring on the each required fields
		String alertone = driver.findElement(By.xpath("//*[text()='Have you ever been known under any other names? Will this application contain documents with your different name?']/following::div[@role='alert']")).getText();
		presence(alertone, "Error: Have you ever been known under any other names? Will this application contain documents with your different name? is required.");
		//driver.findElement(By.xpath("//*[text()='Yes']/preceding-sibling::span")).click();
		WebElement one = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Yes']/preceding-sibling::span")));
		one.click();
		WebElement alternate_name = driver.findElement(By.xpath("//*[text()='Alternate Names:']/following::input[1]"));
		alternate_name.sendKeys("Gnana123");
		saveandnext.sendKeys(Keys.RETURN);
		String text = alternate_name.getText();
		//String alerttwo = driver.findElement(By.xpath("//*[text()='Alternate Names:']/following::input[1]/following::div[text()='Invalid Format']")).getText();
		String alerttwo = driver.findElement(By.xpath("//*[text()='Alternate Names:']/following::input[1]/following::div[text()='Only alphabets, comma, apostrophe and hyphen is allowed.']")).getText();
		presence(alerttwo, "Only alphabets, comma, apostrophe and hyphen is allowed.");
		
		//verify that error message comes when wrong pattern is entered
		checkForNumbers(alerttwo);
		
		//alternate_name.clear();
		
		//Actions actions = new Actions(driver);
		//actions.click(alternate_name).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE).build().perform();
		//alternate_name.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		
		alternate_name.sendKeys(Keys.HOME, Keys.SHIFT, Keys.END, Keys.BACK_SPACE);
		alternate_name.sendKeys("Gnana");
		saveandnext.sendKeys(Keys.RETURN);
		
		Thread.sleep(10000);
		
		//Personal Data Questions
		//To check the presence of the questions
		List<WebElement> elementone = new ArrayList<>();
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Personal Data Questions']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath(" Indicates a required field"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("All applicants must answer the personal data questions based on the profession that they are applying for. They are focused on your fitness to practice the essential skills of this profession. If you answer \"Yes\" to any question in this section, you must provide an appropriate explanation. You must also provide the documentation listed in the note after the question. If you do not provide this, your application is incomplete. Another jurisdiction means any other country, state, federal territory, or military authority."))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Washington State law authorizes the Department of Health to obtain fingerprint-based background checks for licensing purposes. This check may be through the Washington State Patrol and the Federal Bureau of Investigation (FBI). This would be at your own expense. We will notify you by email or mail if this is required."))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("1. Do you have a medical condition which in any way impairs or limits your ability to practice your profession with reasonable skill and safety?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("2. Do you currently use chemical substance(s) in any way which impair or limit your ability to practice your profession with reasonable skill and safety?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("3. Have you ever been diagnosed with, or treated for, pedophilia, exhibitionism, voyeurism or frotteurism?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("4. Are you currently engaged in the illegal use of controlled substances?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("5. Have you ever been convicted, entered a plea of guilty, no contest, or a similar plea, or had prosecution or a sentence deferred or suspended as an adult or juvenile in any state or jurisdiction?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("6. Have you ever been found in any civil, administrative or criminal proceedings to have:"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("6b. Diverted controlled substances or legend drugs?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("6c. Violated any drug law?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("6d. Prescribed controlled substances for yourself?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession?"))));
		elementone.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)?"))));
		
		//calling a method to compare the text
		compareElements(elementone);
		
		//enter save & Next without filling any data
		saveandnext.sendKeys(Keys.ENTER);
		
		//presence(driver.findElement(By.xpath("//*[text()='Have you ever been known under any other names? Will this application contain documents with your different name?']/following::div[@role='alert']")).getText(), "a" );
		presence(getElementText(driver,"1. Do you have a medical condition which in any way impairs or limits your ability to practice your profession with reasonable skill and safety?"), "Error: 1. Do you have a medical condition which in any way impairs or limits your ability to practice your profession with reasonable skill and safety? is required." );
		presence(getElementText(driver,"2. Do you currently use chemical substance(s) in any way which impair or limit your ability to practice your profession with reasonable skill and safety?"),"Error: 2. Do you currently use chemical substance(s) in any way which impair or limit your ability to practice your profession with reasonable skill and safety? is required.");
		presence(getElementText(driver,"3. Have you ever been diagnosed with, or treated for, pedophilia, exhibitionism, voyeurism or frotteurism?"),"Error: 3. Have you ever been diagnosed with, or treated for, pedophilia, exhibitionism, voyeurism or frotteurism? is required.");
		presence(getElementText(driver,"4. Are you currently engaged in the illegal use of controlled substances?"),"Error: 4. Are you currently engaged in the illegal use of controlled substances? is required.");
		presence(getElementText(driver,"5. Have you ever been convicted, entered a plea of guilty, no contest, or a similar plea, or had prosecution or a sentence deferred or suspended as an adult or juvenile in any state or jurisdiction?"),"Error: 5. Have you ever been convicted, entered a plea of guilty, no contest, or a similar plea, or had prosecution or a sentence deferred or suspended as an adult or juvenile in any state or jurisdiction? is required.");
		presence(getElementText(driver,"6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes?"),"Error: 6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes? is required.");
		presence(getElementText(driver,"6b. Diverted controlled substances or legend drugs?"),"Error: 6b. Diverted controlled substances or legend drugs? is required.");
		presence(getElementText(driver,"6c. Violated any drug law?"),"Error: 6c. Violated any drug law? is required.");
		presence(getElementText(driver,"6d. Prescribed controlled substances for yourself?"),"Error: 6d. Prescribed controlled substances for yourself? is required.");
		presence(getElementText(driver,"7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession?"),"Error: 7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession? is required.");
		presence(getElementText(driver,"8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority?"),"Error: 8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority? is required.");
		presence(getElementText(driver,"9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority?"),"Error: 9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority? is required.");
		presence(getElementText(driver,"10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession?"),"Error: 10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession? is required.");
		presence(getElementText(driver,"11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)?"),"Error: 11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)? is required.");
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//clicking on each radio button and entering the values
		getElement(driver, "1. Do you have a medical condition which in any way impairs or limits your ability to practice your profession with reasonable skill and safety?","radioButton").click();
		getElement(driver,"1a. Please explain medical condition.","textarea").sendKeys("Medical condition");
		getElement(driver,"1b. Please explain how your treatment has reduced or eliminated the limitations caused by your medical condition.","textarea").sendKeys("Treatment reduced");
		getElement(driver,"1c. Please explain how your field of practice, the setting or manner of practice has reduced or eliminated the limitations caused by your medical condition.","textarea").sendKeys("Elimated the limitations");
		getElement(driver,"2. Do you currently use chemical substance(s) in any way which impair or limit your ability to practice your profession with reasonable skill and safety?","radioButton").click();
		getElement(driver,"2a. Chemical Substance Explanation","textarea").sendKeys("Chemical substance explanation");
		getElement(driver,"3. Have you ever been diagnosed with, or treated for, pedophilia, exhibitionism, voyeurism or frotteurism?","radioButton").click();
		getElement(driver,"3a. Diagnosis Explanation","textarea").sendKeys("Diagnosis Explanation");
		getElement(driver,"4. Are you currently engaged in the illegal use of controlled substances?","radioButton").click();
		getElement(driver,"4a. Controlled Substances Explanation","textarea").sendKeys("Substance explanation");
		getElement(driver,"5. Have you ever been convicted, entered a plea of guilty, no contest, or a similar plea, or had prosecution or a sentence deferred or suspended as an adult or juvenile in any state or jurisdiction?","radioButton").click();
		getElement(driver,"5a. Criminal History Explanation","textarea").sendKeys("Criminal History");
		js.executeScript("arguments[0].click();", getElement(driver,"6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes?","radioButton"));
		//getElement(driver,"6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes?","radioButton").click();
		getElement(driver,"6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes?","textarea").sendKeys("6a text");
		js.executeScript("arguments[0].click();", getElement(driver,"6b. Diverted controlled substances or legend drugs?","radioButton"));
		//getElement(driver,"6b. Diverted controlled substances or legend drugs?","radioButton").click();
		getElement(driver,"6b. Diverted controlled substances or legend drugs?","textarea").sendKeys("criminal proceeding");
		js.executeScript("arguments[0].click();", getElement(driver,"6c. Violated any drug law?","radioButton"));
		//getElement(driver,"6c. Violated any drug law?","radioButton").click();
		getElement(driver,"6c. Violated any drug law?","textarea").sendKeys("drug law violation");
		js.executeScript("arguments[0].click();", getElement(driver,"6d. Prescribed controlled substances for yourself?","radioButton"));
		//getElement(driver,"6d. Prescribed controlled substances for yourself?","radioButton").click();
		getElement(driver,"6d. Prescribed controlled substances for yourself?","textarea").sendKeys("Self prescribed");
		js.executeScript("arguments[0].click();", getElement(driver,"7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession?","radioButton"));
		//getElement(driver,"7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession??","radioButton").click();
		getElement(driver,"7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession?","textarea").sendKeys("violation of state");
		js.executeScript("arguments[0].click();", getElement(driver,"8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority?","radioButton"));
		//getElement(driver,"8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority?","radioButton").click();
		getElement(driver,"8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority?","textarea").sendKeys("License, Certification and registration");
		js.executeScript("arguments[0].click();", getElement(driver,"9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority?","radioButton"));
		//getElement(driver,"9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority?","radioButton").click();
		getElement(driver,"9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority?","textarea").sendKeys("Surrender explanation");
		js.executeScript("arguments[0].click();", getElement(driver,"10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession?","radioButton"));
		//getElement(driver,"10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession?","radioButton").click();
		getElement(driver,"10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession?","textarea").sendKeys("Civil Judgement");
		js.executeScript("arguments[0].click();", getElement(driver,"11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)?","radioButton"));
		//getElement(driver,"11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)?","radioButton").click();
		getElement(driver,"11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)?","textarea").sendKeys("Vulnerable Persons");
		
		//enter save & Next without filling any data
		saveandnext.sendKeys(Keys.RETURN);
		
		
		//National Provider Identifier Number section
		//To check the presence of the questions
		List<WebElement> elementtwo = new ArrayList<>();
		elementtwo.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=' National Provider Identifier Number']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']"))));
		elementtwo.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("A National Provider Identifier or NPI is a unique 10-digit identification number issued to health care providers in the United States by the Centers for Medicare and Medicaid Services (CMS)."))));
		elementtwo.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("1. Enter your National Provider Identifier (NPI) Number if available."))));
		
		//calling a method to compare the text
		compareElements(elementtwo);
		
		getElement(driver,"1. Enter your National Provider Identifier (NPI) Number if available.","input").sendKeys("NPI");
		
		//To check the field validation
		checkForAlphabetsOrSpecialChars(getElement(driver,"1. Enter your National Provider Identifier (NPI) Number if available.","input").getText());
		getElement(driver,"1. Enter your National Provider Identifier (NPI) Number if available.","input").sendKeys(Keys.HOME, Keys.SHIFT, Keys.END, Keys.BACK_SPACE);
		//clear();
		getElement(driver,"1. Enter your National Provider Identifier (NPI) Number if available.","input").sendKeys("9876545678");
		
		//enter save & Next without filling any data
		saveandnext.sendKeys(Keys.RETURN);
		
		//Military Spouse or Registered Domestic Partner of Military Personnel
		//To check the presence of the questions
		List<WebElement> elementthree = new ArrayList<>();
		elementthree.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Military Spouse or Registered Domestic Partner of Military Personnel']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']"))));
		elementthree.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath(" Indicates a required field"))));
		elementthree.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Exit']/preceding::span[text()='Are you the spouse or registered domestic partner of military personnel?'][1]"))));
		
		//calling a method to compare the text
		compareElements(elementthree);
		
		//enter save & Next without filling any data
	    saveandnext.sendKeys(Keys.ENTER);
	    
	    presence(getElementText(driver,"Are you the spouse or registered domestic partner of military personnel?"),"Error: Are you the spouse or registered domestic partner of military personnel? is required.");
	   // driver.findElement(By.xpath("//*[text()='Exit']/preceding::span[@class='slds-radio_faux'][1]")).click();
	    js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("//*[text()='Exit']/preceding::span[@class='slds-radio_faux'][1]")));
	    
	    saveandnext.sendKeys(Keys.ENTER);
	    
	    //Other License, Certification, or Registration section
	   //To check the presence of the questions
	    List<WebElement> elementfour = new ArrayList<>();
	    elementfour.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Other License, Certification, or Registration']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']"))));
	    elementfour.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath(" Indicates a required field"))));
	    elementfour.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Do you have healthcare provider credentials from any other state or jurisdiction?"))));
	  
		//calling a method to compare the text
		compareElements(elementfour);
	  	
	  //enter save & Next without filling any data
	    saveandnext.sendKeys(Keys.ENTER);
	    
	    presence(getElementText(driver,"Do you have healthcare provider credentials from any other state or jurisdiction?"),"Error: Do you have healthcare provider credentials from any other state or jurisdiction? is required.");
	    driver.findElement(By.xpath("//*[text()='Exit']/preceding::span[@class='slds-radio_faux'][1]")).click();
	    saveandnext.sendKeys(Keys.ENTER);
	    
	    //Training & Education section
	  //To check the presence of the questions
	    List<WebElement> elementfive = new ArrayList<>();
	    elementfive.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Training & Education']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")))); 
	    elementfive.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath(" NOTE: List all of your training and education. Required to add at least one."))));
	    elementfive.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Have your official transcripts, which must indicate your degree and date granted, sent directly from your college or university to the Department of Health."))));
	    
		//calling a method to compare the text
		compareElements(elementfive);
	    
	   driver.findElement(By.xpath("//*[text()='Add Training & Education']/..")).click();
	   
	   driver.findElement(By.xpath("//*[text()='Country']/following::input[1]")).click();
	   driver.findElement(By.xpath("//*[text()='United States']")).click();
	   
	   driver.findElement(By.xpath("//*[text()='City']/following::input[1]")).sendKeys("New York");
	   driver.findElement(By.xpath("//*[text()='School or Training Program Name']/following::input[1]")).sendKeys("Program Name");
	   driver.findElement(By.xpath("//*[text()='School Type']/following::input[1]")).click();
	   driver.findElement(By.xpath("//*[text()='Seminary']")).click();
	   driver.findElement(By.xpath("//*[text()='Date From']/following::input[1]")).click();
	   
	   
	   
	    
	    saveandnext.sendKeys(Keys.ENTER);
	    
	    //Experience section
	  //To check the presence of the questions
	    List<WebElement> elementsix = new ArrayList<>();
	    elementsix.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Experience']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")))); 
	    elementsix.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("In date order, most recent to later, list all professional experience."))));
	    
		//calling a method to compare the text
		compareElements(elementsix);
	   
	   driver.findElement(By.xpath("//*[text()='In date order, most recent to later, list all professional experience.']/following::button[1]")).click();
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextbutton);
	   
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Close']/following::span[text()='Submit'][1]"))).click();
	   presence(getElementText(driver,"Business Name"),"Error: Business Name is required.");
	   presence(getElementText(driver,"Type of Experience/Specialty"),"Error: Type of Experience/Specialty is required.");
	   presence(getElementText(driver,"City"),"Error: City is required.");
	   presence(getElementText(driver,"Country"),"Error: Country is required.");
	   presence(driver.findElement(By.xpath("//*[text()='Country']/following::span[text()='State or Province'][2]/following::*[@role='alert'][1]")).getText(),"Error: State or Province is required.");
	   presence(getElementText(driver,"Start Date"),"Error: Start Date is required.");
	   presence(getElementText(driver,"End Date"),"Error: End Date is required.");
	   
		//calling a method to compare the text
		compareElements(elementsix);
	   
	   getElement(driver,"Business Name","inputindex").sendKeys("Business name");
	   getElement(driver,"Type of Experience/Specialty","inputindex").sendKeys("Type of Experience/Specialty");
	   getElement(driver,"City","inputindex").sendKeys("City");
	   getElement(driver,"Country","inputindex").click();
	   driver.findElement(By.xpath("//*[text()='United States']")).click();
	   driver.findElement(By.xpath("//*[text()='State or Province']/following::input[@class='slds-input slds-listbox__option-text_entity']")).click();
	   driver.findElement(By.xpath("//*[text()='Alabama']")).click();
	   getElement(driver,"Start Date","inputindex").sendKeys("01/03/2024");
	   getElement(driver,"End Date","inputindex").sendKeys("01/05/2024");
	   driver.findElement(By.xpath("//*[text()='Close']/following::*[text()='Submit'][1]")).click();
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Close']/following::*[text()='Ok'][1]"))).click();
	   saveandnext.sendKeys(Keys.ENTER);
	   
	   //Place Of Business section
	   List<WebElement> elementseven = new ArrayList<>();
	   elementseven.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Place Of Business']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']"))));
	   elementseven.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Business Name"))));
	   elementseven.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Address Line 1"))));
	   elementseven.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Address Line 2"))));
	   elementseven.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("City"))));
	   elementseven.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("State or Province"))));
	   elementseven.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Zip Code"))));
	  
		//calling a method to compare the text
		compareElements(elementseven);
	  
	  saveandnext.sendKeys(Keys.RETURN);
	  
	  //Method of Licensure
	  List<WebElement> elementeight = new ArrayList<>();
	  elementeight.add(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Method of Licensure']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']"))));
	  elementeight.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath(" Indicates a required field"))));
	  elementeight.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Do you have a doctorate degree or equivalent from a program at a board-approved institution of higher learning, which includes completion of a supervised clinical practicum experience as defined by rules adopted by the Audiology Board?"))));
	    
	  //calling a method to compare the text
	  compareElements(elementeight);
	  
	  presence(getElementText(driver,"Do you have a doctorate degree or equivalent from a program at a board-approved institution of higher learning, which includes completion of a supervised clinical practicum experience as defined by rules adopted by the Audiology Board?"),"Error: Do you have a doctorate degree or equivalent from a program at a board-approved institution of higher learning, which includes completion of a supervised clinical practicum experience as defined by rules adopted by the Audiology Board? is required.");
	  
	  getElement(driver,"Do you have a doctorate degree or equivalent from a program at a board-approved institution of higher learning, which includes completion of a supervised clinical practicum experience as defined by rules adopted by the Audiology Board?","radioButton").click();
	  
	  elementeight.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath("Have you passed the nationally recognized audiology examination?"))));
	  compareElements(elementeight);
	  
	  getElement(driver,"Have you passed the nationally recognized audiology examination?","radioButton").click();
	  presence(driver.findElement(By.xpath("//*[text()='Please provide a copy of your examination scores.']")).getText(),"Please provide a copy of your examination scores.");
	  
	  saveandnext.sendKeys(Keys.RETURN);
	  
	  
	  //Jurisprudence Examination
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Jurisprudence Examination']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")));
	  presence(driver.findElement(By.xpath("//*[text()='Jurisprudence Examination']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")).getText(),"Jurisprudence Examination");
	  presence(driver.findElement(By.xpath("//*[text()='Jurisprudence Examination']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::p[2]")).getText(),"Complete the online Washington State Audiologist Interim Permit Jurisprudence Examination. It is a multiple choice examination, designed to familiarize you with the Washington State audiologist laws. Current laws can be found on the Department of Health website. Once you have successfully completed the examination, your scores will be sent directly to the Department of Health.");
	  
	  driver.findElement(By.xpath("//span[text()='Exit']/following::span[text()='Next'][1]")).sendKeys(Keys.RETURN);
	  
	  //Agent Registration section
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Agent Registration']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")));
	  presence(driver.findElement(By.xpath("//*[text()='Agent Registration']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")).getText(),"Agent Registration");
	  presence(driver.findElement(By.xpath("//*[text()='Agent Registration']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::*[@class='slds-rich-text-editor__output'][2]")).getText(),"Pursuant to RCW 18.35.230, each license holder shall name a registered agent to accept service of process for any violation of this chapter or rule adopted under this chapter. This registered agent can be the owner or manager of the business; your attorney; or someone who will accept the responsibility of receiving legal documents should you not be available to accept them.\n"
	  		+ "\n"
	  		+ "The registered agent may be released at the expiration of one year after the license issued under this chapter has expired or been revoked if no legal action has been instituted against the license holder.");
	  presence(driver.findElement(getDynamicXPath("Name of the Registered Agent")).getText(),"Name of the Registered Agent");
	  presence(driver.findElement(getDynamicXPath("Address Line 1")).getText(),"Address Line 1");
	  presence(driver.findElement(getDynamicXPath("Address Line 2")).getText(),"Address Line 2");
	  presence(driver.findElement(getDynamicXPath("City")).getText(),"City");
	  presence(driver.findElement(getDynamicXPath("State or Province")).getText(),"State or Province");
	  presence(driver.findElement(getDynamicXPath("Zip Code")).getText(),"Zip Code");
	  presence(driver.findElement(By.xpath("//*[@class='slds-form-element__label slds-show--inline slds-p-top_none']")).getText(),"I don't currently have a registered agent.");
	  
	  saveandnext.sendKeys(Keys.RETURN);
	  
	  //to validate the error message when nothing is entered
	  presence(getElementText(driver,"Name of the Registered Agent"),"Error: Name of the Registered Agent is required.");
	  presence(getElementText(driver,"Address Line 1"),"Error: Address Line 1 is required.");
	  presence(getElementText(driver,"City"),"Error: City is required.");
	  presence(getElementText(driver,"State or Province"),"Error: State or Province is required.");
	  presence(getElementText(driver,"Zip Code"),"Error: Zip Code is required.");
	  
	  //to enter the data
	 WebElement name_of_agent = driver.findElement(getDynamicXPath("Name of the Registered Agent"));
	 name_of_agent.sendKeys("sed23");
	 String agent_name = name_of_agent.getText();
	 driver.findElement(getDynamicXPath("Address Line 1")).sendKeys("Address line 1");
	 driver.findElement(getDynamicXPath("City")).sendKeys("City");
	 driver.findElement(getDynamicXPath("State or Province")).click();
	 driver.findElement(getDynamicXPath("Alabama")).click();
	 WebElement zip_code = driver.findElement(getDynamicXPath("Zip Code"));
	 zip_code.sendKeys("adf");
	 String zip_code_text = zip_code.getText();
	 
	 saveandnext.sendKeys(Keys.RETURN);
	 
	 //validating the name of agent and zipcode correct
	 checkForNumbers(agent_name);
	 checkForAlphabetsOrSpecialChars(zip_code_text);
	 name_of_agent.clear();
	 name_of_agent.sendKeys("Ram");
	 
	 zip_code.clear();
	 zip_code.sendKeys("98767");
	 
	 saveandnext.sendKeys(Keys.RETURN);
	 
	 //Bonding Requirement section
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Bonding Requirement']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")));
	  presence(driver.findElement(By.xpath("//*[text()='Bonding Requirement']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']")).getText(),"Bonding Requirement");
	  elements.add(wait.until(ExpectedConditions.presenceOfElementLocated(getDynamicXPath(" Indicates a required field"))));
	  presence(driver.findElement(By.xpath("//*[text()='Bonding Requirement']/ancestor::div[@class='slds-form-element slds-form-container slds-text-block']/following::*[@class='slds-rich-text-editor__output'][2]")).getText(),"Pursuant to RCW 18.35.240, every individual engaged in the fitting and dispensing of hearing instruments shall be covered by a surety bond of ten thousand dollars or more, for the benefit of any person injured or damaged as a result of any violation by the licensee or permit holder, or their employees or agents, of any of the provisions of this chapter or rules adopted by the secretary.\n"
	  		+ "\n"
	  		+ "In lieu of the surety bond required by this section, the licensee or permit holder may deposit cash or other negotiable security in a banking institution as defined in RCW 30.04 or a credit union as defined in RCW 31.12.");
	  
	  presence(driver.findElement(By.xpath("//*[text()='Do you currently have a surety bond?']")).getText(),"Do you currently have a surety bond?");
	  
	  saveandnext.sendKeys(Keys.RETURN);
	  
	  presence(getElementText(driver,"Do you currently have a surety bond?"),"Error: Do you currently have a surety bond? is required.");
	  getElement(driver,"Do you currently have a surety bond?","radioButton").click();
	  
     presence(driver.findElement(By.xpath("//*[text()='Are you uploading a copy of your surety bond?']")).getText(),"Are you uploading a copy of your surety bond?");
	  
	  saveandnext.sendKeys(Keys.RETURN);
	  
	  presence(getElementText(driver,"Are you uploading a copy of your surety bond?"),"Error: Are you uploading a copy of your surety bond? is required.");
	  getElement(driver,"Are you uploading a copy of your surety bond?","radioButton").click();
	  
	  presence(driver.findElement(By.xpath("//*[text()='Are you uploading a copy of your surety bond?']/following::p[1]")).getText(),"You must provide proof of a surety bond prior to issuance of your credential. You may upload a copy of your surety bond with your application.");
	  saveandnext.sendKeys(Keys.RETURN);
	  
	 
	  
	  
	}
	
	public static void presence(String a , String b) {
		if(a.equalsIgnoreCase(b))
			System.out.println("The expected text " + b + "is correct as actual text " + a);
		else
			System.out.println("The expected text " + b + "is not correct as actual text " + a);
	}
	
	public static void compareElements(List<WebElement> elements) {
		for (WebElement elementstart : elements) {
		    String elementText = elementstart.getText();
		    
		    // Compare each element with different expected texts
		    if (elementText.equals("Demographic Information")) {
		        System.out.println("Match found for Demographic Information");
		    } else if (elementText.equals("Indicates a required field")) {
		        System.out.println("Match found for  Indicates a required field");
		    } else if (elementText.equals("Please review your demographic information below:")) {
		        System.out.println("Please review your demographic information below:");
		    } else if (elementText.equals("Personal Information")) {
		        System.out.println("Match found for Personal Information");
		    } else if (elementText.equals("First Name")) {
		        System.out.println("First Name");
		    } else if (elementText.equals("Middle Name")) {
		        System.out.println("Middle Name");
		    } else if (elementText.equals("Last Name")) {
		        System.out.println("Match found for Last Name");
		    } else if (elementText.equals("Date of Birth")) {
		        System.out.println("Match found for Date of Birth");
		    } else if (elementText.equals("Social Security Number")) {
		        System.out.println("Social Security Number");
		    } else if (elementText.equals("Gender")) {
		        System.out.println("Match found for Gender");
		    } else if (elementText.equals("Address")) {
		        System.out.println("Match found for Address");
		    } else if (elementText.equals("Street")) {
		        System.out.println("Match found for Street");
		    } else if (elementText.equals("City")) {
		        System.out.println("Match found for City");
		    } else if (elementText.equals("Country")) {
		        System.out.println("Match found for Country");
		    } else if (elementText.equals("State or Province")) {
		        System.out.println("Match found for State or Province");
		    } else if (elementText.equals("Zip Code")) {
		        System.out.println("Match found for Zip Code");
		    } else if (elementText.equals("County")) {
		        System.out.println("Match found for County");
		    } else if (elementText.equals("Contact Information")) {
		        System.out.println("Contact Information");
		    } else if (elementText.equals("Phone Number")) {
		        System.out.println("Match found for Phone Number");
		    }else if (elementText.equals("Cell Number")) {
		        System.out.println("Match found for Cell Number");
		    } else if (elementText.equals("Email Address")) {
		        System.out.println("Match found for Email Address");
		    } else if (elementText.equals("Mailing Address if different than above:")) {
		        System.out.println("Match found for Mailing Address if different than above:");
		    } else if (elementText.equals("Have you ever been known under any other names? Will this application contain documents with your different name?")) {
		        System.out.println("Have you ever been known under any other names? Will this application contain documents with your different name?");
		    }  else if (elementText.equals("Personal Data Questions")) {
		    	System.out.println("Personal Data Questions");
		    } else if (elementText.equals("All applicants must answer the personal data questions based on the profession that they are applying for. They are focused on your fitness to practice the essential skills of this profession. If you answer \"Yes\" to any question in this section, you must provide an appropriate explanation. You must also provide the documentation listed in the note after the question. If you do not provide this, your application is incomplete. Another jurisdiction means any other country, state, federal territory, or military authority.")) {
		    	System.out.println("All applicants must answer the personal data questions based on the profession that they are applying for. They are focused on your fitness to practice the essential skills of this profession. If you answer \"Yes\" to any question in this section, you must provide an appropriate explanation. You must also provide the documentation listed in the note after the question. If you do not provide this, your application is incomplete. Another jurisdiction means any other country, state, federal territory, or military authority.");
		    } else if (elementText.equals("Washington State law authorizes the Department of Health to obtain fingerprint-based background checks for licensing purposes. This check may be through the Washington State Patrol and the Federal Bureau of Investigation (FBI). This would be at your own expense. We will notify you by email or mail if this is required.")) {
		    	System.out.println("Washington State law authorizes the Department of Health to obtain fingerprint-based background checks for licensing purposes. This check may be through the Washington State Patrol and the Federal Bureau of Investigation (FBI). This would be at your own expense. We will notify you by email or mail if this is required.");
		    } else if (elementText.equals("1. Do you have a medical condition which in any way impairs or limits your ability to practice your profession with reasonable skill and safety?")) {
		        System.out.println("1. Do you have a medical condition which in any way impairs or limits your ability to practice your profession with reasonable skill and safety?");
		    } else if (elementText.equals("2. Do you currently use chemical substance(s) in any way which impair or limit your ability to practice your profession with reasonable skill and safety?")) {
		        System.out.println("2. Do you currently use chemical substance(s) in any way which impair or limit your ability to practice your profession with reasonable skill and safety?");
		    } else if (elementText.equals("3. Have you ever been diagnosed with, or treated for, pedophilia, exhibitionism, voyeurism or frotteurism?")) {
		        System.out.println("3. Have you ever been diagnosed with, or treated for, pedophilia, exhibitionism, voyeurism or frotteurism?");
		    } else if (elementText.equals("4. Are you currently engaged in the illegal use of controlled substances?")) {
		        System.out.println("4. Are you currently engaged in the illegal use of controlled substances?");
		    } else if (elementText.equals("5. Have you ever been convicted, entered a plea of guilty, no contest, or a similar plea, or had prosecution or a sentence deferred or suspended as an adult or juvenile in any state or jurisdiction?")) {
		        System.out.println("5. Have you ever been convicted, entered a plea of guilty, no contest, or a similar plea, or had prosecution or a sentence deferred or suspended as an adult or juvenile in any state or jurisdiction?");
		    } else if (elementText.equals("6. Have you ever been found in any civil, administrative or criminal proceedings to have:")) {
		        System.out.println("6. Have you ever been found in any civil, administrative or criminal proceedings to have:");
		    } else if (elementText.equals("6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes?")) {
		        System.out.println("Match found for 6a. Possessed, used, prescribed for use, or distributed Controlled Substances or Legend drugs in any way other than for legitimate or therapeutic purposes?");
		    } else if (elementText.equals("6b. Diverted controlled substances or legend drugs?")) {
		        System.out.println("Match found for 6b. Diverted controlled substances or legend drugs?");
		    } else if (elementText.equals("6c. Violated any drug law?")) {
		        System.out.println("Match found for 6c. Violated any drug law?");
		    } else if (elementText.equals("6d. Prescribed controlled substances for yourself?")) {
		        System.out.println("Match found for 6d. Prescribed controlled substances for yourself?");
		    } else if (elementText.equals("7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession??")) {
		        System.out.println("Match found for 7. Have you ever been found in any proceeding to have violated any state or federal law or rule regulating the practice of a healthcare profession?");
		    } else if (elementText.equals("8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority?")) {
		        System.out.println("Match found for 8. Have you ever had any license, certificate, registration or other privilege to practice a healthcare profession denied, revoked, suspended, or restricted by a state, federal, or foreign authority?");
		    } else if (elementText.equals("9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority?")) {
		        System.out.println("Match found for 9. Have you ever surrendered a credential like those listed in number 8, in connection with or to avoid action by a state, federal, or foreign authority?");
		    } else if (elementText.equals("10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession?")) {
		        System.out.println("10. Have you ever been named in any civil suit or suffered any civil judgment for incompetence, negligence, or malpractice in connection with the practice of the healthcare profession?");
		    } else if (elementText.equals("11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)?")) {
		        System.out.println("11. Have you ever been disqualified from working with vulnerable persons by the Department of Social and Health Services (DSHS)?");
		    } else if (elementText.equals(" National Provider Identifier Number")) {
		    	System.out.println("National Provider Identifier Number");
		    } else if (elementText.equals("A National Provider Identifier or NPI is a unique 10-digit identification number issued to health care providers in the United States by the Centers for Medicare and Medicaid Services (CMS).")) {
		    	System.out.println("A National Provider Identifier or NPI is a unique 10-digit identification number issued to health care providers in the United States by the Centers for Medicare and Medicaid Services (CMS).");
		    } else if (elementText.equals("1. Enter your National Provider Identifier (NPI) Number if available.")) {
		    	System.out.println("1. Enter your National Provider Identifier (NPI) Number if available.");
		    } else if (elementText.equals("Military Spouse or Registered Domestic Partner of Military Personnel")) {
		    	System.out.println("Military Spouse or Registered Domestic Partner of Military Personnel");
		    } else if (elementText.equals("Are you the spouse or registered domestic partner of military personnel?")) {
		    	System.out.println("Are you the spouse or registered domestic partner of military personnel?");
		    } else if (elementText.equals("Other License, Certification, or Registration")) {
		    	System.out.println("Other License, Certification, or Registration");
		    } else if (elementText.equals("Do you have healthcare provider credentials from any other state or jurisdiction?")) {
		    	System.out.println("Do you have healthcare provider credentials from any other state or jurisdiction?");
		    } else if (elementText.equals("Training & Education")) {
		    	System.out.println("Training & Education");
		    } else if (elementText.equals(" NOTE: List all of your training and education. Required to add at least one.")) {
		    	System.out.println(" NOTE: List all of your training and education. Required to add at least one.");
		    } else if (elementText.equals("Have your official transcripts, which must indicate your degree and date granted, sent directly from your college or university to the Department of Health.")) {
		    	System.out.println("Have your official transcripts, which must indicate your degree and date granted, sent directly from your college or university to the Department of Health.");
		    } else if (elementText.equals("Experience")) {
		    	System.out.println("Experience.");
		    } else if (elementText.equals("In date order, most recent to later, list all professional experience.")) {
		    	System.out.println("In date order, most recent to later, list all professional experience");
		    } else if (elementText.equals("Place Of Business")) {
		    	System.out.println("Place Of Business");
		    } else if (elementText.equals("Business Name")) {
		    	System.out.println("Business Name");
		    } else if (elementText.equals("Address Line 1")) {
		    	System.out.println("Address Line 1");
		    } else if (elementText.equals("Address Line 2")) {
		    	System.out.println("Address Line 2");
		    } else if (elementText.equals("City")) {
		    	System.out.println("City");
		    } else if (elementText.equals("State or Province")) {
		    	System.out.println("State or Province");
		    } else if (elementText.equals("Zip Code")) {
		    	System.out.println("Zip Code");
		    } else if (elementText.equals("Method of Licensure")) {
		    	System.out.println("Method of Licensure");
		    } else if (elementText.equals("Do you have a doctorate degree or equivalent from a program at a board-approved institution of higher learning, which includes completion of a supervised clinical practicum experience as defined by rules adopted by the Audiology Board?")) {
		    	System.out.println("Do you have a doctorate degree or equivalent from a program at a board-approved institution of higher learning, which includes completion of a supervised clinical practicum experience as defined by rules adopted by the Audiology Board?");
		    } else if (elementText.equals("Have you passed the nationally recognized audiology examination?")) {
		    	System.out.println("Have you passed the nationally recognized audiology examination?");
		    }
		    else {
		       System.out.println("No match for the specified text");
		    }
		}
		
	}
	
	 // Method to generate dynamic XPath
    public static By getDynamicXPath(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }

    //method to generate for different xpath
    public static String generateXPathByText(String text) {
        return "//*[text()='" + text + "']/following::*[@role='alert'][1]";
    }
    
    //method to click on the radio button or text area
    public static WebElement getElement(WebDriver driver, String text, String elementType) {
        String dynamicXPath = "";

        switch (elementType) {
            case "radioButton":
                dynamicXPath = "//*[text()='" + text + "']/following::span[@class='slds-radio_faux'][1]";
                break;
            case "textarea":
                dynamicXPath = "//*[text()='" + text + "']/following::textarea[1]";
                break;
            case "input":
                dynamicXPath = "//*[text()='" + text + "']/following::input";
                break;   
            case "inputindex":
                dynamicXPath = "//*[text()='" + text + "']/following::input[1]";
                break; 
            // Add more cases for other element types if needed

            default:
                throw new IllegalArgumentException("Unsupported element type: " + elementType);
        }
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        
     JavascriptExecutor js = (JavascriptExecutor) driver;
       String script = "function scrollIntoView(element, options) { " +
                        "    options = options || { behavior: 'smooth', block: 'center' }; " +
                        "    element.scrollIntoView(options); " +
                        "} " +
                        "scrollIntoView(arguments[0], { behavior: 'smooth', block: 'center' });";
        try {
           WebElement element = driver.findElement(By.xpath(dynamicXPath));
           wait.until(ExpectedConditions.elementToBeClickable(element));
            js.executeScript(script, element);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + dynamicXPath);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error executing JavaScript:");
            e.printStackTrace();
        }
        
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXPath)));
          
    }
    
    // Method to get the text of an element identified by a dynamic XPath
    public static String getElementText(WebDriver driver, String text) {
        String dynamicXPath = generateXPathByText(text);
        WebElement element = driver.findElement(By.xpath(dynamicXPath));
        return element.getText();
    }
    
    
    public static void checkForNumbers(String text) {
        if (containsNumbers(text)) {
            System.out.println("The string contains numbers, please enter the correct text");
        }
    }

    private static boolean containsNumbers(String input) {
        return input.matches(".*\\d.*");
    }
    
    public static void checkForAlphabetsOrSpecialChars(String text) {
        if (containsAlphabetsOrSpecialChars(text)) {
            System.out.println("The field contains alphabets or special characters, please enter only digits");
        }
    }

    private static boolean containsAlphabetsOrSpecialChars(String input) {
        //return input.matches(".*[a-zA-Z!@#$%^&*()-_=+<>?/\\|{}[].,;:'\"].*");
    	//return input.matches(".*[a-zA-Z!@#$%^&*()\\-_=+<>?/\\\\|{}[\\].,;:'\"].*");
    	return input.matches(".*\\D.*");
    	
    }
    
}
