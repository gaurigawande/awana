package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin3Page {
	@FindBy(xpath="//div[text()='No, I’m good']") private WebElement TEXTCLK;
	
	public UpstoxLogin3Page(WebDriver driver) {
		PageFactory.initElements (driver,this);
	}
	
	public void Click_TEXTCLK() {
		TEXTCLK.click();
	}

}
