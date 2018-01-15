import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LaunchDynamically {

	@Test(dataProvider="getData")
	public void testApp(String browserName, String username, String password){
		
		WebDriver driver = null;
		
			if(browserName.equals("Mozilla")){
				driver = new FirefoxDriver();
				
			}
			else if(browserName.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
				driver= new ChromeDriver();
				
			}else if(browserName.equals("IE")){
				System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			
			}
			// code
			driver.get("http://gmail.com");
			System.out.println(driver.getTitle());
			// write username
	
	
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][3];
		
		data[0][0]="Mozilla";
		data[0][1]="U1";
		data[0][2]="P1";
		
		data[1][0]="Chrome";
		data[1][1]="U2";
		data[1][2]="P2";
		
		data[2][0]="IE";
		data[2][1]="U1";
		data[2][2]="P1";
		
		return data;
	}

}
