package week3.day4homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launching the browser
		ChromeDriver aa = new ChromeDriver();
		aa.get("https://www.amazon.in/");
		aa.manage().window().maximize();
		aa.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//searching for "oneplus 9 pro" and press ENTER
		aa.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro"+Keys.ENTER);
		//getting the price of the first product
		String price = aa.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
		System.out.println("Price of the first product : "+price);
//		Thread.sleep(2000);
		Actions actions = new Actions(aa);
		WebElement rating = aa.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']"));	
		actions.moveToElement(rating).perform();
//		Thread.sleep(90000);
//    	String ratingPoints = aa.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
//    	System.out.println(ratingPoints);
		//clicking the first text link of the first image
		aa.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandles = aa.getWindowHandles();
		List<String> window1 = new ArrayList<String>(windowHandles);
		int windowHandlesSize = window1.size();
		System.out.println("No of windows : "+windowHandlesSize);
		//handling the window
		aa.switchTo().window(window1.get(1));
		//clicking on "Add to Cart" button
		aa.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		//getting the cart SubTotal
		String subTotal = aa.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Cart subtotal is : "+subTotal);
		//verifying the cart subtaotal and price
		if (subTotal.contains(price)) {
			System.out.println("Price is correct");
			} else {
				System.out.println("Prices not matching");
			}
		//closing the windows
		aa.close();
		aa.switchTo().window(window1.get(0));
		aa.close();
		//closing the browser and all its windows
//		aa.quit();
	}

}
