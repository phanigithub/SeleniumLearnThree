package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Phani\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=Refrigerator&otracker=start&as-show=on&as=off");
		
		WebElement sec = driver.findElement(By.xpath("//section[.//div/text()='Ideal for Family Size']"));
		Thread.sleep(10000);
		WebElement input=sec.findElement(By.xpath("./input[following-sibling::div/text()='Single']"));
		Thread.sleep(10000);
		input.sendKeys(Keys.ENTER);
		System.out.println(input.findElement(By.xpath("./following-sibling::div[position()=2]")).getText());
	}

}
