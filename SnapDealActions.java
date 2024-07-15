package week3.day4homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launching the chromedriver
		ChromeDriver sd = new ChromeDriver();
		sd.get("https://www.snapdeal.com/");
		sd.manage().window().maximize();
		sd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//mousehover on Men's Fashion
		WebElement mensFashion = sd.findElement(By.xpath("//span[@class='catText']"));
		Actions action = new Actions(sd);
		action.moveToElement(mensFashion).perform();
		//clicking on Sport Shoes
		sd.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		//getting the count of Sport Shoes
		String sportsShoesCount = sd.findElement(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div")).getText();
		System.out.println("Count of Sports Shoes is : "+sportsShoesCount);
		//clicking on Training Shoes
		sd.findElement(By.xpath("(//a[@class='child-cat-node dp-widget-link hashAdded'])[3]/div[1]")).click();
		//clicking on Sort
		sd.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		//selecting to sort by "Low to High"
		sd.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
//		WebElement fromPriceRange = sd.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
//		action.clickAndHold().dragAndDropBy(fromPriceRange,300,0).perform();
//		Thread.sleep(3000);
		//selecting the price range
		WebElement fromValue = sd.findElement(By.xpath("//input[@name='fromVal']"));
		fromValue.clear();
		fromValue.sendKeys("500");
		WebElement toValue = sd.findElement(By.xpath("//input[@name='toVal']"));
		toValue.clear();
		toValue.sendKeys("900");
		sd.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		//filtering by color
		WebElement colorSelection = sd.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']/span[1]"));
		sd.executeScript("arguments[0].click();",colorSelection);
		//clicking on the first result product
		WebElement firstResult = sd.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		firstResult.click();
		//mousehover on first resulting product and clicking on Quick View
//		action.moveToElement(firstResult).perform();
//		Thread.sleep(2000);
//		sd.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")).click();
		//handling windows
		Set<String> windowHandles = sd.getWindowHandles();
		List<String> productView=new ArrayList<String>(windowHandles);
		//switching to window view of product
		sd.switchTo().window(productView.get(1));
		//getting the price and discount of product from window view
		String price = sd.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("The cost of the shoe is : Rs."+price);
		String discount = sd.findElement(By.xpath("//span[@class='pdpDiscount ']")).getText();
		//getting the price and discount of product from Quick View
//		String price = sd.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[1]")).getText();
//		System.out.println("The cost of the shoe is : Rs."+price);
//		String discount = sd.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		String discountPercent = discount.replaceAll(" OFF","");
		System.out.println("The discount for the price is : "+discountPercent);
//		Thread.sleep(2000);
		//closing the Quick View screen
//		WebElement quickViewClose = sd.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]"));
//		sd.executeScript("arguments[0].click();",quickViewClose);
		//closing the current window and parent window
//		sd.close();
//		sd.switchTo().window(productView.get(0));
//		sd.close();
//		sd.quit();
	}
}
