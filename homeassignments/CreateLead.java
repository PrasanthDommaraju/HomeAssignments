package week1.day4.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver lp = new ChromeDriver();
		
		lp.get("http://leaftaps.com/opentaps/control/main");
		
		lp.manage().window().maximize();
		
		WebElement userName = lp.findElement(By.id("username"));
		
		userName.sendKeys("demosalesmanager");
		
		lp.findElement(By.id("password")).sendKeys("crmsfa");
		
		WebElement login = lp.findElement(By.className("decorativeSubmit"));
		
		login.click();
		
        WebElement crmfs = lp.findElement(By.partialLinkText("/SFA"));
		
		crmfs.click();
		
		WebElement createLead = lp.findElement(By.linkText("Create Lead"));
		
		createLead.click();
		
		WebElement cName = lp.findElement(By.id("createLeadForm_companyName"));
		
		cName.sendKeys("TestLeaf");
		
		WebElement fName = lp.findElement(By.id("createLeadForm_firstName"));
		
		fName.sendKeys("prasanth");
		
		WebElement lName = lp.findElement(By.id("createLeadForm_lastName"));
		
		lName.sendKeys("kumar");
		
		WebElement profTitle = lp.findElement(By.id("createLeadForm_generalProfTitle"));
		
		profTitle.sendKeys("Mr");
		
		WebElement leadSubmit = lp.findElement(By.className("smallSubmit"));
		
		leadSubmit.click();
		
		Thread.sleep(5000);
		
		String leadPageTitle = lp.getTitle();
		
		String leadPageTitelActual = ("View Lead | opentaps CRM");
		
		  if (leadPageTitle.equalsIgnoreCase(leadPageTitelActual)) {
			
		//if (leadPageTitle.equals(leadPageTitelActual)) {
			
			System.out.println("Title is displayed correctly");
			
		} else { System.out.println("Title is not displayed correctly");

		}
		
		lp.close();
	}

}
