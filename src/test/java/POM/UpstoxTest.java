package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Gauri\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().deleteAllCookies();
		UpstoxLogin1Page login1=new UpstoxLogin1Page(driver);
		login1.Enter_UN();
		login1.Enter_PWD();
		login1.Click_LOGIN_BTN();
		
		UpstoxLogin2Page login2=new UpstoxLogin2Page(driver);
		login2.Enter_PIN();
		
		
		UpstoxLogin3Page login3=new UpstoxLogin3Page(driver);
		login3.Click_TEXTCLK();
		
		
		UpstoxHomePage hp=new UpstoxHomePage(driver);
		hp.Verify_Page_TITLE(driver);
		
		
		
		
		
		
	}

}
