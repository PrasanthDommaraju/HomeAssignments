package week3.day3homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {
	
	public static void main(String[] args) throws InterruptedException {
		
		//initializing the chrome driver
		ChromeDriver wt = new ChromeDriver();
		wt.get("https://finance.yahoo.com/");
		wt.manage().window().maximize();
		wt.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//mouse hover on Markets menu
		Actions action = new Actions(wt);
		WebElement market = wt.findElement(By.xpath("//span[text()='Markets']"));
		action.moveToElement(market).perform();
		Thread.sleep(2000);
		//clicking on the Crypto tab
		wt.findElement(By.xpath("(//div[text()='Crypto'])[2]")).click();
		//getting the CryptoCurrency names in the web table
		List<WebElement> currencyNamesCount = wt.findElements(By.xpath("//table/tbody/tr"));
		List<String> cryptoCurrencyNames = new ArrayList<String>();
		int namesCount = currencyNamesCount.size();
		System.out.println(namesCount);
		for (int i = 1; i <= namesCount; i++) {
			String cryptoName = wt.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			cryptoCurrencyNames.add(cryptoName);
			System.out.println(cryptoName);
		}
		System.out.println(cryptoCurrencyNames.size());
		System.out.println("Crypto Currency Names : "+cryptoCurrencyNames);
	}

}
