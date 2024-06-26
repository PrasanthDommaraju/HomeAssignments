package week2.day1.homeassignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver fb = new ChromeDriver();
		
		fb.get("https://en-gb.facebook.com/");
		
		fb.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//clicking on Create new account
		fb.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		
		//implicit wait
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//entering firstname,surname,mobile number/email,password
		fb.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prasanth");
		fb.findElement(By.xpath("//input[@name='lastname']")).sendKeys("D");
		fb.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8937895812");
		fb.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Login2fb$");
		
		//selecting the day from dropdown
		WebElement dayWE = fb.findElement(By.xpath("//select[@title='Day']"));
		Select dayDD = new Select(dayWE);
		dayDD.selectByIndex(21);
		
		//selecting month from dropdown
		WebElement monthWE = fb.findElement(By.xpath("//select[@id='month']"));
		Select monthDD = new Select(monthWE);
		monthDD.selectByVisibleText("Aug");
		
		//selecting year from dropdown
		WebElement yearWE = fb.findElement(By.xpath("//select[contains(@name,'year')]"));
		Select yearDD = new Select(yearWE);
		yearDD.selectByValue("1980");
		
		//selecting the radio button for Gender
		fb.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		}

}
