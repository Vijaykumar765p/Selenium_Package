import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilities_Example {

	public static void main(String[] args) {
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setBrowserName("Mozilla");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Mozilla");
		cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		
		WebDriver driver = new FirefoxDriver(cap);

	}

}
