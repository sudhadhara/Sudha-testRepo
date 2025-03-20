import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/gnaneshwari.p/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://culturalaffairsnyc--qa1.sandbox.my.site.com/grants");
		Thread.sleep(50000);

		driver.findElement(By.name("username")).sendKeys("gnaneshwari.p+jan51@mtxb2b.com");
		driver.findElement(By.name("password")).sendKeys("Asdf@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		Thread.sleep(50000);
		//To find the text inside the pop up
		String content = driver.findElement(By.xpath("//div[@class='slds-modal__content slds-p-around_medium']")).getText();
		String t = "You are not part of any organization. Please wait for an invite or create a new organization by clicking below.";
	

		
		if(t.equalsIgnoreCase(content)) {
			System.out.println("Text: " + t + "is present.");
		} else {
			System.out.println("Text: " + t + "is not present.");
		}
		
		driver.findElement(By.xpath("//button[@title='Create New Organization']")).click();
		
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//input[@placeholder='EIN']")).sendKeys("464765881");
		driver.findElement(By.xpath("//button[text()='Search EIN']")).click();
		
		Thread.sleep(3000);
		
		String tm = driver.findElement(By.xpath("//span[@class='toastMessage forceActionsText']")).getText();
		String orgM = "No organization currently exists with this EIN. Please fill out all the details to create the organization.";
		
		if(tm.equalsIgnoreCase(orgM)) {
			System.out.println("Text: " + orgM + "is present.");
		} else {
			System.out.println("Text: " + orgM + "is not present.");
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Organization Name']")).sendKeys("Auto orgJan51");
		driver.findElement(By.xpath("//input[@placeholder='AKA']")).sendKeys("Auto AKA");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543234");
		driver.findElement(By.xpath("//input[@placeholder='Website Organization Address']")).sendKeys("https://email.com");
		driver.findElement(By.xpath("//input[@placeholder='Organization Street Address']")).sendKeys("Org Street address");
		driver.findElement(By.xpath("//input[@placeholder='Organization City']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@placeholder='Organization Zip Code']")).sendKeys("98765");
		driver.findElement(By.xpath("//button[@title='Create New Organization']")).click();
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		WebElement optionToSelect1 = driver.findElement(By.xpath("//div[@id='dropdown-element-22']//span[contains(text(),'Ms.')]"));
        optionToSelect1.click();
       // driver.findElement(By.xpath("//button[@name='suffix' and @data-value='None']")).click();
       // Thread.sleep(2000);
       // driver.findElement(By.xpath("//button[@name='suffix' and @data-value='None']/following-sibling::div//span[text()='Jr']")).click();
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Job Title");
        driver.findElement(By.xpath("//input[@name='workPhone']")).sendKeys("9876567898");
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        
        Thread.sleep(20000);
        
        driver.findElement(By.xpath("//button[@title='Add New Member']")).click();
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("First");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LDDjan051");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("gnaneshwari.p+jan51@mtxb2b.com");
        driver.findElement(By.xpath("//input[@name='Title']")).sendKeys("DDTTitle");
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//a[@data-index='1'][text()='Edit ']")).click();
        driver.findElement(By.xpath("//span[text()='Executive Director/Co-Director']")).click();
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        Thread.sleep(30000);
        
        driver.findElement(By.xpath("//a[@class='slds-nav-vertical__action' and contains(text(), 'Dashboard')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//lightning-button-menu[@class='user-icon slds-p-right_large slds-dropdown-trigger slds-dropdown-trigger_click']//button")).click();
        driver.findElement(By.xpath("//lightning-menu-item[@title='Log Out']//a[@role='menuitem']//span")).click();
        
       // driver.findElement(By.xpath("//lightning-button-menu[@class='user-icon']//lightning-menu-item[@title='Log Out']//a")).click();
		
		driver.quit();

	}

}
