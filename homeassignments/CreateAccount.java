package week2.day1.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver ca = new ChromeDriver();
		
		ca.get("http://leaftaps.com/opentaps");
		
		ca.manage().window().maximize();
		
		//login to leaftaps		
		ca.findElement(By.id("username")).sendKeys("demosalesmanager");
		ca.findElement(By.id("password")).sendKeys("crmsfa");
		ca.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRMSFA
		ca.findElement(By.partialLinkText("CRM")).click();
		
		//click on Accounts tab and select Create Account		
		ca.findElement(By.xpath("//a[text()='Accounts']")).click();
		ca.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//getting page title for Create Account page
		String createAccountTitle = ca.getTitle();
		System.out.println("Create Account Page Title is "+createAccountTitle);
		
		//ca.findElement(By.xpath("//input[@id='accountName']"));
		
		//entering Account name
		WebElement accNameEntered = ca.findElement(By.xpath("//input[@id='accountName']"));
		
		accNameEntered.sendKeys("PrasantK");
		
		String accNameValue = accNameEntered.getAttribute("value");
		
		System.out.println(accNameValue);
		
		//selecting industry from dropdown
		WebElement industryWE = ca.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryDD = new Select(industryWE);
		industryDD.selectByIndex(3);
		
		//selecting ownership from dropdown
		WebElement ownershipWE = ca.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipDD = new Select(ownershipWE);
		ownershipDD.selectByVisibleText("S-Corporation");
		
		//selecting source from dropdown
		WebElement sourceWE = ca.findElement(By.xpath("(//select[@class='inputBox'])[4]"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		
		//selecting campaign from drop down
		WebElement mCampaignWE = ca.findElement(By.xpath("(//select[@class='inputBox'])[5]"));
		Select mCampaignDD = new Select(mCampaignWE);
		mCampaignDD.selectByIndex(6);
		
		//selecting state from dropdown
		WebElement stateWE = ca.findElement(By.xpath("(//select[@class='selectBox'])[2]"));
		Select stateDD = new Select(stateWE);
		stateDD.selectByValue("TX");
		
		//entering description
		ca.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Selenium Automation Tester");
		
		Thread.sleep(3000);
		
		//creating Account by clicking on Create Account
		ca.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//getting title of page after account creation
		String accCreateTitle = ca.getTitle();
		
		System.out.println("View Account Page Title is "+accCreateTitle);
		
		Thread.sleep(3000);
		
		//get text for Account Name
		WebElement accName = ca.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String text = accName.getText();
		
		System.out.println(text);
		
		//verifying if account name is displayed correctly or not
		if (text.contains(accNameValue)) {
			
			System.out.println("Account Name displayed correctly");
			
		} else {
			
			System.out.println("Account Name displayed incorrectly");
		}
		
		ca.close();
		
		
	}

}
