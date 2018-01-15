import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UnPred {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("http://qtpselenium.com/test/unpredictable.php");
		
		Set<String> windowIds = driver.getWindowHandles();
		if(windowIds.size()==2){//present
			// iterator and close/work
		}else{
			System.out.println("Not present");
		}
		
		
	}

}
