package com.ZWAS1;

import org.apache.commons.lang3.StringEscapeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Phani\\Tools\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://zero.webappsecurity.com/index.html");
		
		driver.findElement(By.id("signin_button")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		
		driver.findElement(By.id("user_remember_me")).click();
		
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("icon-question-sign"))).build().perform();;
		String helpText = driver.findElement(By.className("tooltip")).getText();
		
		

		//tooltip
		System.out.println("Help Text is : "+helpText);
		
		driver.findElement(By.className("btn-primary")).click();
		
		

		

	}

}
