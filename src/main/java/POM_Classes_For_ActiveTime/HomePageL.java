package POM_Classes_For_ActiveTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageL {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	
	public HomePageL(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String verifyText() {
		
		String actText=text.getText();
		System.out.println("Hi");
		return actText;
	}
}
