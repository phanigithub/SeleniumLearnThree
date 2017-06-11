package flipkart;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//_2vKQKr _2ZIdQX
		System.setProperty("webdriver.chrome.driver", "E:\\Phani\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=Refrigerator&otracker=start&as-show=on&as=off");
		
//		WebElement sec = driver.findElement(By.xpath("//section[.//div/text()='Ideal for Family Size']"));
//		Thread.sleep(10000);
//		WebElement input=sec.findElement(By.xpath("./input[following-sibling::div/text()='Single']"));
//		Thread.sleep(10000);
//		input.sendKeys(Keys.ENTER);
//		System.out.println(input.findElement(By.xpath("./following-sibling::div[position()=2]")).getText());
		
//		String y = driver.findElement(By.xpath("//input[following-sibling::div/text()='Single']/../following-sibling::svg")).getAttribute("class");
//		System.out.println(y);
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Type']")).getText());
//		int x=driver.findElement(By.xpath("//span[text()='Price']")).getRect().getX();
//		int y=driver.findElement(By.xpath("//span[text()='Price']")).getRect().getY();
//		System.out.println(x);
//		System.out.println(y);
		
//********************************************* View Port **************************************	
		// Option 1
		
//		WebElement element = driver.findElement(By.cssSelector("#container > div > div > div > div > div > div > div > div:nth-child(7) > section > div > div"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//		element.click();
		// Option 2
//		WebElement element = driver.findElement(By.cssSelector("#container > div > div > div > div > div > div > div > div:nth-child(7) > section > div > div"));		
//  	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		element.click();
		//Option 3
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,arguments[0])", 800);
		
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//div[text()='Type']"))).click().build().perform();
		
//********************************************* View Port **************************************	

		
//		WebElement element = driver.findElement(By.cssSelector("#container > div > div > div > div > div > div > div > div:nth-child(7) > section > div > div"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//element.click();
		 //Java script executor
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,arguments[0])", 800);
		
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//div[text()='Type']"))).click().build().perform();
//		WebDriverWait ww = new WebDriverWait(driver, 60);
//		System.out.println(ww.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//section[.//div/text()='Type']//div[@class='_1cEG7-']"))));

	//	System.out.println(ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[.//div/text()='Type']//div[@class='_1cEG7-']"))));
//		if(ww.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//section[.//div/text()='Type']//div[@class='_1cEG7-']")))){
//			System.out.println(""+new Date().toString());
//			System.out.println(ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Type']/.."))));
//			System.out.println(""+new Date().toString());
//			driver.findElement(By.xpath("//div[text()='Type']/..")).click();
//			System.out.println("--------------------End------------------------");
		}

		
		
	}
	
	


