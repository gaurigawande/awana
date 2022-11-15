package Upstox_framework;

import static org.testng.Assert.expectThrows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_upstox {
public static void main(String[] args) {
	
	//set the properties
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Gauri\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     //implicit wait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     //delete all coockies
     driver.manage().deleteAllCookies();
     //maximize the browser
     driver.manage().window().maximize();
     //open the apllication
     driver.get("https://login-v2.upstox.com/");
     //enter UN 
     driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2QALQX");
     //enter PWD
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pnishi@321");
     //click on login btn
     driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
     //enter DOB
     driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1995");
     //click on No I am good
     driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
     //verify user is on home
     String expT="Upstox Pro";
     String actT = driver.getTitle();
     if(actT.equals(expT)) {
    	 System.out.println("User navigate to Home page and TC is pass");
     }
     else {
    	 System.out.println("Tc is fail");
     }
}
	

}