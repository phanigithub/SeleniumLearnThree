package flipkart;

import java.sql.Driver;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlip {
	
	WebDriver driver;
	 public SearchFlip(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		System.out.println("IT's called");
	}
	
	
	@FindBy(how=How.NAME,using="q")
	private WebElement search;
	@FindBy(how=How.CLASS_NAME,using="_2cLu-lWh5jJLF4ZsRSyFg0")
	private List<WebElement> searchForEle;
	@FindBy(how=How.LINK_TEXT,using="NEXT")
	private WebElement nxtPage;
	@FindBy(how=How.XPATH,using="//section[.//div/text()='Ideal for Family Size']")//"//section[.//div/text()='Brand']")
	private WebElement fltrsection_size;
	@FindBy(how=How.XPATH,using="//section[.//div/text()='Type']")
	private WebElement fltrsection_type;
	@FindBy(how=How.XPATH,using="//section[.//div/text()='Capacity']")
	private WebElement fltrsection_capacity;
	@FindBy(how=How.XPATH,using="//section[.//div/text()='Discount']")
	private WebElement fltrsection_discount;
	@FindBy(how=How.XPATH,using="//section[.//span/text()='Sort By']")
	private WebElement sortBy;
			/*
			//section[.//span/text()='Sort By']//li[text()='Popularity']
			//li[../preceding-sibling::span//text()='Sort By'][text()='Popularity']
*/
	
	protected void enterSearch(String searchtxt){
		search.sendKeys(searchtxt);
		search.sendKeys(Keys.ENTER);
	}
	protected void searchFor(String searchFor){
		System.out.println("IN METHOD SEARCH FOR");
		int xi=0;
		boolean isFound;
		do {
			 isFound=false;
			 System.out.println("Size is , Maximum loop count  "+searchForEle.size());
			 for (WebElement we : searchForEle) {
				 System.out.println("For ::"+(++xi)+"   "+we.getText());
				if(we.getText().equals(searchFor)){
					isFound=true;
					System.out.println("************ Item Found.."+searchFor);
					return ;
				}
			}
			 if(isFound==false){
				 System.out.println("Next Page");
				 nxtPage.click();
					
				 try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			
		} while (!isFound);

	}
	public void searchFor(Keys enter) {
		// TODO Auto-generated method stub
		search.sendKeys(enter);
		
	}
	protected void applyFilter(String Key,String Value){
		System.out.println("Search Flip :::::: Start"+new Date().toString());
		WebDriverWait wdw = new WebDriverWait(driver, 100);
		wdw.until(ExpectedConditions.visibilityOf(fltrsection_size));
		System.out.println("Search Flip :::::: End"+new Date().toString());
		switch(Key){
		case "SIZE":
			System.out.println(fltrsection_size.getAttribute("class"));
			System.out.println("V::"+Value);
			System.out.println(fltrsection_size.findElements(By.xpath("//input[following-sibling::div/text()='Single']")).size());
			List<WebElement> lw = fltrsection_size.findElements(By.xpath("//input[following-sibling::div/text()='Single']"));
			for (int i = 0; i < lw.size(); i++) {
				System.out.println("----------------------------------------------------------");
				System.out.println(lw.get(i).findElement(By.xpath("//following-sibling::div[position()=1]")).getText());
				System.out.println("----------------------------------------------------------");
			}
			
			System.out.println(fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='Single']")).getLocation().x);
			System.out.println(fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='Single']")).getLocation().y);
			System.out.println(fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='Single']")).isDisplayed());
			System.out.println(fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='Single']")).isEnabled());
			System.out.println(fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='Single']")).isSelected());
			highlightElement(fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='Single']")));
			System.out.println("//input[following-sibling::div/text()='"+Value+"']");
			System.out.println("Search Flip > :::::: Start"+new Date().toString());
			wdw.until(ExpectedConditions.visibilityOf( fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='"+Value+"']"))));
			System.out.println("Search Flip >:::::: End"+new Date().toString());
			 fltrsection_size.findElement(By.xpath("//input[following-sibling::div/text()='"+Value+"']")).click();
		case "TYPE":
			fltrsection_type.findElement(By.xpath("//input[following-sibling::div/text()='"+Value+"']")).click();
		case "CAPACITY":
			fltrsection_capacity.findElement(By.xpath("//input[following-sibling::div/text()='"+Value+"']")).click();
		case "DISCOUNT":
			fltrsection_discount.findElement(By.xpath("//input[following-sibling::div/text()='"+Value+"']")).click();
		default:
			System.err.println("Wrong Filter applied Verify Key or Value");
		}
		
	}
	protected void sortBy(String Key){
		sortBy.findElement(By.xpath("//li[text()='"+Key+"']")).click();
	}
	public void highlightElement(WebElement element) {
		
		// Original in Python: https://gist.github.com/3086536
		
		String originalStyle = element.getAttribute("style");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {}
		
		js.executeScript("arguments[0].setAttribute('style', '" + originalStyle + "');", element);
		
	}
	
	

}
