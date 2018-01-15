import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Profiling {

	public static void main(String[] args) {
		// firefox.exe -p profilemanager
		
		//ProfilesIni prof = new ProfilesIni();
		//FirefoxProfile seleniumProfile =  prof.getProfile("Selenium");
		//WebDriver driver = new FirefoxDriver(seleniumProfile);
		
		//driver.close(); // close the current window
		//driver.quit(); // close all windows and end the selenium session
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.quit();
	}

}
