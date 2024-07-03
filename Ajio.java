package week2.day4homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver ajio = new ChromeDriver();
		ajio.get("https://www.ajio.com/");
		ajio.manage().window().maximize();
		ajio.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//typing bags and pressing Enter
		ajio.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		ajio.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		
		//clicking on Men under Gender and on Fashion Bags under Category
		ajio.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		WebElement category = ajio.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"));
		ajio.executeScript("arguments[0].click();", category);
		
		//printing the count of items found
		Thread.sleep(4000);
		WebElement itemsWE = ajio.findElement(By.xpath("//div[@class='length']/strong"));
		String noOfItems = itemsWE.getText();
		System.out.println(noOfItems);
		
		//getting list of brands of all items in the page and printing
		List<WebElement> brandsListWE = ajio.findElements(By.xpath("//div[@class='brand']"));
//		System.out.println(brandsListWE.size());
		List<String> listOfBrands = new ArrayList<String>();
		for (WebElement brand : brandsListWE) {
			String text = brand.getText();
//			System.out.println(text);
			listOfBrands.add(text);
			}
		System.out.println("Brands Available : "+listOfBrands);
		
		////getting list of bag names of all items in the page and printing
		List<WebElement> bagsNamesWE = ajio.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> listOfBagNames = new ArrayList<String>();
		for (WebElement bag : bagsNamesWE) {
			String text = bag.getText();
			listOfBagNames.add(text);
      		}
		System.out.println("Bags Available : "+listOfBagNames);
		
		
	}

}
