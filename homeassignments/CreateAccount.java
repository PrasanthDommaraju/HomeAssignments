package week1.day4.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver ltps = new ChromeDriver();
		
		ltps.get("http://leaftaps.com/opentaps/control/main");
		
		ltps.manage().window().maximize();
		
		ltps.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		ltps.findElement(By.id("password")).sendKeys("crmsfa");
		
		ltps.findElement(By.className("decorativeSubmit")).click();
		
		ltps.findElement(By.linkText("CRM/SFA")).click();
		
		ltps.findElement(By.linkText("Create Account")).click();
		
		ltps.findElement(By.id("accountName")).sendKeys("Se_Jun");
		
		ltps.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		
		ltps.findElement(By.id("numberEmployees")).sendKeys("25");
		
		ltps.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		ltps.findElement(By.className("smallSubmit")).click();
		
		//String pageTitle = ltps.getTitle();
		
		String actualTitle = "Account Details | opentaps CRM";
						
		if (ltps.getTitle().equals(actualTitle)) {
		            System.out.println("Title matches");			
			} else {
					System.out.println("Title not matched");

			}
		
		Thread.sleep(5000);
		
		ltps.close();
		
			}

}
