package flipkart;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DriverFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Phani\\Tools\\Drivers\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Signup")));
		
		//driver.findElement(By.linkText("Signup")).click();
		
		SearchFlip searchFlip =  PageFactory.initElements(driver, SearchFlip.class);
		searchFlip.enterSearch("Pendrive");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Start"+new Date().toString());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("End"+new Date().toString());

		searchFlip.searchFor("SandDisk Cruzer Blade 32 GB");
		System.out.println("Done");
		
		
		
	}

}
