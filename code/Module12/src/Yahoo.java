import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		String browser="Chrome";
		WebDriver driver = null;
		if(browser.equals("Mozilla"))
			driver= new FirefoxDriver();
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("http://yahoo.com");
		driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("games");
		Thread.sleep(3000);		
		//contains
		// start-with
		String res = driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0')]/li[1]/a")).getText();
		System.out.println(res);
		//String res = driver.findElement(By.cssSelector("ul[id^='yui_3_12_0_'] li")).getText();
		//System.out.println(res);
		
	}

}
