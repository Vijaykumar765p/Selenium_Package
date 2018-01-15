package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LaunchPage;
import pages.LoginPage;
import pages.ProfilePage;

public class ProfileTest {
	
	@Test
	public void testProfile(){
		WebDriver driver  =  new FirefoxDriver();
		LaunchPage lp = new LaunchPage();
		LoginPage loginPage=lp.gotoFBLoginPage();
		loginPage.verifyTitle("Facebook Login");
		LandingPage landingPage = loginPage.doLogin("xxxx", "yyyyy");
		landingPage.verifyTitle("Welcome to facebook");
		ProfilePage profPage=landingPage.gotoProfilePage();
		profPage.verifyTitle("Profile");
		profPage.verifyProfile();
	}

}
