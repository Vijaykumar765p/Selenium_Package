import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail {

	public static void main(String[] args) {
		// type, clear, read
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		boolean result = getResponseCode("http://gmail.com");
		System.out.println(result);
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("xxxxxxx");
		String text=driver.findElement(By.id("Email")).getText();
		System.out.println("Text-> "+text);
		text=driver.findElement(By.id("Email")).getAttribute("value");
		System.out.println("Text-> "+text);
		
		text=driver.findElement(By.id("Email")).getAttribute("placeholder");
		System.out.println("Placeholder-> "+text);
		 text = driver.findElement(By.name("signIn")).getAttribute("value");
		 System.out.println("Button text-> "+text);
		driver.findElement(By.id("Email")).clear();
		
		 text = driver.findElement(By.xpath("//div[@class='banner']/h1")).getText();
		 System.out.println("Normal text-> "+text);

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
