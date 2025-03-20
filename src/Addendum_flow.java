import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Addendum_flow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/chaitanaya.sethi/Downloads/chrome-mac-x64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
		//ChromeOptions co = new ChromeOptions();
		//co.setBinary("/Users/chaitanaya.sethi/Downloads/chrome-mac-x64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://culturalaffairsnyc--qa1.sandbox.my.site.com/grants");
		Thread.sleep(30000);

		driver.findElement(By.name("username")).sendKeys("gnaneshwari.p+dec302@mtxb2b.com");
		driver.findElement(By.name("password")).sendKeys("Asdf@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		Thread.sleep(30000);
		
//		String grant_name = driver.findElement(By.xpath("//span[text()='| Fiscal Year: 2024']/preceding-sibling::h3[text()='FY24 Cultural Development Fund (CDF)']")).getText();
//
//		if(grant_name.equals("FY24 Cultural Development Fund (CDF)"))
//		{
//			driver.findElement(By.xpath("//button[@title='Start Addendum']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//button[@title='Next']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//button[@name='Contact']")).click();
//			driver.findElement(By.xpath("//div[@id='dropdown-element-58']//span[contains(text(), 'Dec302 Dec302 PP')]")).click();
//			//driver.findElement(By.xpath("//button[@id='combobox-button-58']//span[contains(text(), 'Dec302 Dec302 PP')]")).click();
//			driver.findElement(By.xpath("//button[text()='Select']")).click();
//			driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
//			Thread.sleep(30000);
//
//			driver.findElement(By.xpath("//button[@name='edit']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//input[@name='revisedProjectRequest']")).sendKeys("2000");
//			driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//input[@name='projectTitle']")).sendKeys("Addendum Project");
//			driver.findElement(By.xpath("//input[@name='totalProjectExpenses']")).sendKeys("5000");
//			driver.findElement(By.xpath("//input[@name='totalProjectIncome']")).sendKeys("2500");
//			driver.findElement(By.xpath("//input[@name='otherProjectIncomeSrc']")).sendKeys("3000");
//			driver.findElement(By.xpath("//input[@name='activityStartDate']")).sendKeys("12/28/2023");
//			driver.findElement(By.xpath("//input[@name='activityEndDate']")).sendKeys("12/30/2023");
//			driver.findElement(By.xpath("//input[@name='noOfDirectRecipients']")).sendKeys("12");
//			driver.findElement(By.xpath("//input[@name='noOfIndirectRecipients']")).sendKeys("15");
//			WebElement borough = driver.findElement(By.xpath("//button[@name='borough']"));
//			borough.sendKeys("Queens");
//			borough.sendKeys(Keys.ENTER);
//			//driver.findElement(By.xpath("//div[@id='dropdown-element-85']/lightning-base-combobox-item[.//span[text()='Queens']]")).click();
//			WebElement discipline = driver.findElement(By.xpath("//button[@name='discipline']"));
//			discipline.click();
//			Thread.sleep(10000);
//			discipline.sendKeys("Dance");
//			Thread.sleep(10000);
//			discipline.sendKeys(Keys.ENTER);
//			Thread.sleep(10000);
//			System.out.println(discipline.getText());
//			//driver.findElement(By.xpath("//div[@id='dropdown-element-92']//span[contains(text(), 'Botany/Ecology')]")).click();
//			driver.findElement(By.xpath("//textarea[@name='synopsis']")).sendKeys("Synopsis Text");
//			driver.findElement(By.xpath("//textarea[@name='projectDescription']")).sendKeys("Project Description Addendum");
//			driver.findElement(By.xpath("//button[text()='Finish']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
//			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Decuser");
//			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("lastname");
//			driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Title");
//			driver.findElement(By.xpath("//button[text()='Finish']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//button[text()='Yes']")).click();
//			Thread.sleep(30000);
//			driver.findElement(By.xpath("//button[text()='Back to Home']")).click();
//
//		}
//		else
//			System.out.println("No grant with that name is present");
	}

}
