import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rediff_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		WebElement box=driver.findElement(By.xpath("//*[@id='popular_cat']"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println("Total links-> "+links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println("------------------------");
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
			box=driver.findElement(By.xpath("//*[@id='popular_cat']"));
			links = box.findElements(By.tagName("a"));
		}

	}

}
