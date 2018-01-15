import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com");
		/*
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("hello");
		
		emailField.clear();
		int x = emailField.getLocation().x;
		int y= emailField.getLocation().y;
		System.out.println(x+" --- "+ y);
		
		WebElement button = driver.findElement(By.name("signIn"));
		button.click();
		*/
		String text = driver.findElement(By.xpath("//div[@class='banner']/h1")).getText();
		System.out.println(text);
		
		//driver.findElement(By.id("Email")).sendKeys("xxx");
		driver.findElement(By.xpath("//*[@placeholder='Enter your email']")).sendKeys("hello");
		//driver.findElement(By.id("Email")).clear();
		//driver.findElement(By.name("signIn")).click();
	}

}
