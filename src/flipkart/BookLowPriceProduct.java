package flipkart;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class BookLowPriceProduct {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Phani\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
		
		driver.manage().window().maximize();
		
		SearchFlip searchFlip =  PageFactory.initElements(driver, SearchFlip.class);
		searchFlip.enterSearch("Refrigerator");
		System.out.println("Start"+new Date().toString());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("End"+new Date().toString());
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchFlip sf = PageFactory.initElements(driver, SearchFlip.class);
		sf.applyFilter("SIZE", "Single");
		sf.applyFilter("TYPE", "Single Door");
		sf.applyFilter("CAPACITY", "80 - 170 L");
		sf.applyFilter("DISCOUNT", "20% or More");
		sf.sortBy("Popularity");
		
		
		
	}

}
