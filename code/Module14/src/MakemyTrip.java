import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MakemyTrip {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://www.makemytrip.com/holidays/international/search?dest=Mauritius&channel=ONSITE&intid=HPLP_row1a_OBT_Mauritius_09092015");
		
		driver.findElement(By.xpath("//input[@class='flL dept_city_input fontSize11 RobotoLight ui-autocomplete-input']")).sendKeys("New Delhi");
		driver.findElement(By.id("selectCity_btn")).click();
		
		// WebDriverWait ,  FluentWait
		
		//SEARCH PAGE - 40 seconds
		
	//	WebDriverWait wait = new WebDriverWait(driver, 5);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='xxxxflL city_name']")));
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver);
		fWait.withTimeout(5, TimeUnit.SECONDS);
		fWait.pollingEvery(1, TimeUnit.SECONDS);
		fWait.ignoring(NoSuchElementException.class);
		fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='xxxxflL city_name']")));
	}

}
