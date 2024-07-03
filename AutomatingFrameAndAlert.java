package week3.day2homeassignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlert {
	
public static void main(String[] args) {
		
		ChromeDriver fa = new ChromeDriver();
		fa.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		fa.manage().window().maximize();
		fa.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//switching to the frame
		fa.switchTo().frame(1);
		//clicking on "Try it" button inside the frame
		fa.findElement(By.xpath("//button[text()='Try it']")).click();
		//switching to the alert
		Alert alert = fa.switchTo().alert();
		System.out.println(alert.getText());
		//accepting the alert
		alert.accept();
		//getting the text displayed after accepting the alert
		String text = fa.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
			
	}

}
