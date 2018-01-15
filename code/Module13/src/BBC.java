import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BBC {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://bbc.com");
		
		//*[@id='orb-nav-links']/ul/li[3]/a
		//String x=driver.findElement(By.cssSelector("div[id='orb-nav-links'] ul li:nth-child(3) a")).getText();
		//System.out.println(x);
		
		//driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[1]/a")).click();
		//driver.findElement(By.linkText("News")).click();
		//driver.findElement(By.partialLinkText("new Russia")).click();
		String url=driver.findElement(By.xpath("//a[text()='xxxxxxx']")).getAttribute("href");
		System.out.println(url);
		driver.findElement(By.xpath("//a[text()='News']")).click();
		
		
		
		
	}

}
