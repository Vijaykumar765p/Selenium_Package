import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rediff_2 {
	static WebDriver driver =null;
	
	public static void main(String[] args) {
		//*[@id='popular_cat']/h3[1]/a
		//*[@id='popular_cat']/h3[2]/a
		//*[@id='popular_cat']/h3[3]/a
		//*[@id='popular_cat']/h3[14]/a
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		driver.navigate().to("http://shopping.rediff.com/?sc_cid=inhome_icon");
		
		String part1="//*[@id='popular_cat']/h3[";
		String part2="]/a";
		int i=1;
		//for(int i=1;i<=14;i++){
		while(isElementPresent(part1+i+part2)){
			String text=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
			
			
			
			// get the response code
			String url=driver.findElement(By.xpath(part1+i+part2)).getAttribute("href");
			getResponseCode(url);
			driver.findElement(By.xpath(part1+i+part2)).click();
			
			System.out.println(driver.getTitle());
			//driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
			driver.navigate().back();
			i++;
		}
		

	}
	//true- present
	//false - not present
	public static boolean isElementPresent(String xpathExpression){
		
		List<WebElement> allElements = driver.findElements(By.xpath(xpathExpression));
		if(allElements.size()==0)
			return false;
		else
			return true;
		
	}
	
	public static boolean getResponseCode(String url){
		int resp_code=0;
		try {
			resp_code = Request.Get(url).execute().returnResponse().getStatusLine()
			        .getStatusCode();
	        System.out.println("Respose code for URL "+ url +" is -> "+ resp_code);
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if(resp_code==200)
        	return true;
        else 
        	return false;
	}

}
