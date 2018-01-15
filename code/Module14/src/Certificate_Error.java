import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Certificate_Error {

	public static void main(String[] args) {
		//FirefoxProfile prof = new FirefoxProfile();
		//prof.setAcceptUntrustedCertificates(true);
		//prof.setAssumeUntrustedCertificateIssuer(true);
		//WebDriver driver = new FirefoxDriver(prof);
		
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("https://onlineservices.tin.nsdl.com/etaxnew/tdsnontds.jsp");
		
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		
	
	
	}

}
