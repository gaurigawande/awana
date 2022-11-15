package Upstox_framework;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
	public static void main(String[] args) throws Throwable {
		//navigate to sheet in excel
		FileInputStream fis=new FileInputStream("C:\\Users\\Gauri\\Downloads\\9th_july_data\\Excelsheet\\Upstrax.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		//set the properties
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Gauri\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//open the application
		driver.get("https://login-v2.upstox.com/");
		//enter UN
		String UN = sh.getRow(0).getCell(0).getStringCellValue();//2qalqx
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
		//enter pwd
		String pwd=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		//click on sign up btn
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		
		//Enter DOB
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys(pin);
		//clixk on no I am good
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		//verification
		String expTitle = sh.getRow(0).getCell(3).getStringCellValue();
		String actTitle = driver.getTitle();
		if(actTitle.equals(expTitle)) {
			System.out.println("User navigate to home page TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
