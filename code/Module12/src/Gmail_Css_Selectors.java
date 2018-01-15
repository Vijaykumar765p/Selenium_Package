import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail_Css_Selectors {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com");
		
		//driver.findElement(By.xpath("//*[@placeholder='Enter your email']")).sendKeys("hello");
		String res=driver.findElement(By.cssSelector("div[class='banner'] h1")).getText();
		System.out.println(res);
		//driver.findElement(By.cssSelector("input[name='Email'][id='Email']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("#Email")).sendKeys("hello");
		
		// ^ $ *
		// ^ - starts with
		// $ - ends with
		// * - contains
		//Emai123656157351
		driver.findElement(By.cssSelector("input[id^='Ema']")).sendKeys("hello");
		//76152636Email
		driver.findElement(By.cssSelector("input[id$='ail']")).sendKeys("hello");
		//76152636Email874y7867167
		driver.findElement(By.cssSelector("input[id*='mai']")).sendKeys("hello");

	}

}
