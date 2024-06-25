package week2.day1.homeassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver fb = new ChromeDriver();
		
		fb.get("https://en-gb.facebook.com/");
		
		fb.manage().window().maximize();
		
		Thread.sleep(2000);
		//fb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		fb.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		
		fb.findElement(By.xpath("(//input[@name='firstname']")).sendKeys("Prasanth");
		fb.findElement(By.xpath("//input[@name='lastname']")).sendKeys("D");
		fb.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("457812");
		fb.findElement(By.xpath("//input[@id='password_step_input'])")).sendKeys("Login2fb$");
		

		
		
	}

}
