package week3.day3homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Initializing ChromeDriver
		ChromeDriver wha = new ChromeDriver();
		wha.get("http://leaftaps.com/opentaps/control/login");
		wha.manage().window().maximize();
		wha.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//logging into leaftaps
		wha.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		wha.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		wha.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//clicking on CRM/SFA link
		wha.findElement(By.linkText("CRM/SFA")).click();
		//clicking on Contacts button
		wha.findElement(By.linkText("Contacts")).click();
		//clicking on Merge Contacts
		wha.findElement(By.linkText("Merge Contacts")).click();
		//Clicking on the widget of the "From Contact"
		wha.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> windowHandles1 = wha.getWindowHandles();
		List<String> window1 = new ArrayList<String>(windowHandles1);
		System.out.println(window1.size());
		wha.switchTo().window(window1.get(1));
		//clicking on the first resulting contact
		wha.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		wha.switchTo().window(window1.get(0));
		//clicking on the widget of the "To Contact"
		wha.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles2 = wha.getWindowHandles();
		List<String> window2 = new ArrayList<String>(windowHandles2);
		System.out.println(window2.size());
		wha.switchTo().window(window2.get(1));
		//clicking on the second resulting contact
		wha.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		wha.switchTo().window(window2.get(0));
		//clicking on the Merge button
		wha.findElement(By.linkText("Merge")).click();
		//accepting the alert
//		Thread.sleep(2000);
		Alert alert = wha.switchTo().alert();
		alert.accept();
		//getting the title of the page
		String title = wha.getTitle();
		System.out.println(title);
		wha.close();
		}
}
