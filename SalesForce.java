package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.core.plugin.Options;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForce {
	
	ChromeDriver sf;
	String name="Ananth";
		
	@Given ("Launch the browser and open Salesforce url") 
	public void launchSalesforce() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		sf=new ChromeDriver(options);
		sf.get("https://login.salesforce.com/");
		sf.manage().window().maximize();
		sf.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Given ("Enter the username and Password")
	public void enterCredentials() {
		sf.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		sf.findElement(By.id("password")).sendKeys("Leaf$123");
	}
	@When ("Click on Login")
	public void clickLogin() {
		sf.findElement(By.id("Login")).click();
	}
	@Then ("Verify if Login successful")
	public void verifyLogin() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Title : "+sf.getTitle());
			}
	@Given ("Click on toggle button from the left corner")
	public void toggleButton() {
		sf.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@Given ("Click View All and click Sales from App Launcher")
	public void clickSales() {
		sf.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement sales = sf.findElement(By.xpath("//p[text()='Sales']"));
		sf.executeScript("arguments[0].click();", sales);
	}
	@Given ("Click on Accounts tab")
	public void clickAccounts() {
		WebElement accounts = sf.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[5]"));
		sf.executeScript("arguments[0].click();",accounts);
	}
	@When ("Click on New button")
	public void newAccount() throws InterruptedException {
		Thread.sleep(2000);
		WebElement newAccount = sf.findElement(By.xpath("//span[text()='New Account']"));
		sf.executeScript("arguments[0].click();",newAccount);
	}
	@Given ("Enter 'your name' as Account name")
	public void enterName() {
		sf.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	@Given ("Select Ownership as Public")
	public void selectOwnership() {
		WebElement ownership = sf.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"));
		sf.executeScript("arguments[0].click();",ownership);
		sf.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@When ("Click on Save")
	public void saveAccount() {
		sf.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();
	}
	@Then ("Verify Account is created and Account name")
	public void verifyAccountCreation() {
		String accountNameFinal = sf.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		if(name.equals(accountNameFinal)) {
			System.out.println("Account name is verified");
		} else {
			System.out.println("Account name is not correct");
		}
	}
	
	
	
	

	
	
}
