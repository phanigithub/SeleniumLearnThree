package flipkart;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchFlip {
	
	
	
	@FindBy(how=How.NAME,using="q")
	private WebElement search;
	@FindBy(how=How.CLASS_NAME,using="_2cLu-lWh5jJLF4ZsRSyFg0")
	private List<WebElement> searchForEle;
	@FindBy(how=How.LINK_TEXT,using="NEXT")
	private WebElement nxtPage;
	
	
	protected void enterSearch(String searchtxt){
		search.sendKeys(searchtxt);
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
					Thread.sleep(5000);
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
	
	

}
