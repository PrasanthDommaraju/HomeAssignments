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
		
		ca.findElement(By.id("username")).sendKeys("demosalesmanager");
		ca.findElement(By.id("password")).sendKeys("crmsfa");
		ca.findElement(By.className("decorativeSubmit")).click();
		
		ca.findElement(By.partialLinkText("CRM")).click();
		
		ca.findElement(By.xpath("//a[text()='Accounts']")).click();
		ca.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//ca.findElement(By.xpath("//input[@id='accountName']"));
		
		WebElement accNameEntered = ca.findElement(By.xpath("//input[@id='accountName']"));
		
		accNameEntered.sendKeys("PrashantK");
		
		String accNameValue = accNameEntered.getAttribute("value");
		
		System.out.println(accNameValue);
				
		WebElement industryWE = ca.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryDD = new Select(industryWE);
		industryDD.selectByIndex(3);
		
		WebElement ownershipWE = ca.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipDD = new Select(ownershipWE);
		ownershipDD.selectByVisibleText("S-Corporation");
		
		WebElement sourceWE = ca.findElement(By.xpath("(//select[@class='inputBox'])[4]"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		
		WebElement mCampaignWE = ca.findElement(By.xpath("(//select[@class='inputBox'])[5]"));
		Select mCampaignDD = new Select(mCampaignWE);
		mCampaignDD.selectByIndex(6);
		
		WebElement stateWE = ca.findElement(By.xpath("(//select[@class='selectBox'])[2]"));
		Select stateDD = new Select(stateWE);
		stateDD.selectByValue("TX");
		
		ca.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Selenium Automation Tester");
		
		Thread.sleep(3000);
		
		ca.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Thread.sleep(3000);
		
		WebElement accName = ca.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String text = accName.getText();
		
		System.out.println(text);
		
		if (text.contains(accNameValue)) {
			
			System.out.println("Account Name displayed correctly");
			
		} else {
			
			System.out.println("Account Name displayed incorrectly");
		}
		
		ca.close();
		
		
	}

}
