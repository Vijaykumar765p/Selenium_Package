import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Radios {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("F:\\xyz.jpg"));

		
		List<WebElement> allRadios = driver.findElements(By.name("group1"));
		System.out.println("Total -" + allRadios.size());
		
		System.out.println(allRadios.get(0).getAttribute("checked"));
		System.out.println(allRadios.get(1).getAttribute("checked"));
		System.out.println(allRadios.get(2).getAttribute("checked"));

		allRadios.get(0).click();
		System.out.println("-------------");
		System.out.println(allRadios.get(0).getAttribute("checked"));
		System.out.println(allRadios.get(1).getAttribute("checked"));
		System.out.println(allRadios.get(2).getAttribute("checked"));
	}

	

}
