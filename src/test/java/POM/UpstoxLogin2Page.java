package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2Page {
	//step-1 Declaration
	@FindBy(xpath="//input[@id='yob']") private WebElement PIN;
	
	//step-2 Initialization
	public  UpstoxLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//step-3 Implementation
	public void Enter_PIN() {
		PIN.sendKeys("1995");
	}

}
