package week3.day4homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketActions {
	
	public static void main(String[] args) throws InterruptedException {
		String priceR="";
		//opening the browser
		ChromeDriver bb = new ChromeDriver();
		bb.get("https://www.bigbasket.com/");
		bb.manage().window().maximize();
		bb.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//clicking on "Shop By category"
		bb.findElement(By.xpath("(//div[@class='relative h-full'])[4]")).click();
		Actions mh=new Actions(bb);
		Thread.sleep(2000);
		//mousehover on "Foodgrains, Oil & Masala"
		WebElement mFood = bb.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		mh.moveToElement(mFood).perform();
		//mouse hover on "Rice & Rice Products"
		WebElement mRice = bb.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		mh.moveToElement(mRice).perform();
		//clicking on "Boiled & Steam Rice"
		WebElement mBoiled = bb.findElement(By.xpath("(//a[text()='Boiled & Steam Rice'])[1]"));
		mh.moveToElement(mBoiled).click().perform();
//		Thread.sleep(3000);
//		mh.moveToElement(mFood).moveToElement(mRice).moveToElement(mBoiled).click().perform();
		//filtering the results by selecting "bb royal"
		WebElement royal = bb.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		bb.executeScript("arguments[0].click();",royal);
		Thread.sleep(2000);
		//clicking on "Tamil ponni boiled rice"
		bb.findElement(By.xpath("//img[@title='bb Royal Tamil Ponni Boiled - Rice 26 kg Bag']")).click();
		//handling the window
		Set<String> bbWindowHandles = bb.getWindowHandles();
		List<String> bbWindow = new ArrayList<String>(bbWindowHandles);
		bb.switchTo().window(bbWindow.get(1));
		//selecting the 5Kgs bag
		WebElement packSize = bb.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]"));
		bb.executeScript("arguments[0].click();", packSize);
		//getting the price of the rice
		String price = bb.findElement(By.xpath("(//table/tr/td)[3]")).getText();
		System.out.println(price);
		char[] arr=price.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				priceR=priceR+arr[i];
			}
					}
		System.out.println(priceR);
		//clicking on "Add to Cart"
		bb.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		//closing the current window
		bb.close();
		bb.switchTo().window(bbWindow.get(0));
		//closing the main window
		bb.close();
		}
}
