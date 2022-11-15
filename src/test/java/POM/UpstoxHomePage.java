package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage {
	//step-1 Declaration
	@FindBy(xpath="//input[@id='yob']") private WebElement TITLE;
	
	//step-2 Initialization
	public UpstoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Verify_Page_TITLE(WebDriver driver) {
		String expT="Upstox Pro";
		String actT=driver.getTitle();
		
		if(expT.equals(actT)) {
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is Fail");
		}
		
		
	}

}
