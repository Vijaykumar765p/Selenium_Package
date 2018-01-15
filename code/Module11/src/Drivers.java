import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.BrowserVersion;




public class Drivers {

	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		// FirefoxDriver, ChromeDriver, InternetExplorerDriver
		
	//	FirefoxDriver fd = new FirefoxDriver();
	//	fd.get("http://bbc.com");
		
		
		// cntrl+shift+o
	//	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	//	ChromeDriver cd = new ChromeDriver();
	//	cd.get("http://bbc.com");
	//	System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
	//	InternetExplorerDriver ie = new InternetExplorerDriver();
	//	ie.get("http://gmail.com");
		
		// no browsers installed
		// fast
		
		//https://code.google.com/p/selenium/wiki/HtmlUnitDriver
		
		//HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		HtmlUnitDriver driver = new HtmlUnitDriver(cap);
		driver.get("http://bbc.com");
		System.out.println(driver.getTitle());
		
		
	}

}
