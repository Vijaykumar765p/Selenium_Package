import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rediff3 {
	
	//*[@id='popular_cat']/h3[1]/a
	//*[@id='popular_cat']/h3[2]/a
	//*[@id='popular_cat']/h3[3]/a
	//*[@id='popular_cat']/h3[14]/a
	

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		
		
		//a
		//span[@class='product_buynow'] - all the buttons
		//span[@class='dealprice'] - all prices
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		System.out.println("Total -> "+ allLinks.size());
		
		for(int i=0;i<allLinks.size();i++){
			System.out.println("------------------------");
			System.out.println(allLinks.get(i).getText());
			allLinks.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
			allLinks = driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		}
	}

	


}
