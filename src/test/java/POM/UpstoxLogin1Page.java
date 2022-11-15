package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page {
	//step-1 Declaration
	@FindBy(xpath="//input[@id='userCode']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement LOGIN_BTN;
	
	//Step-2 Initialization
	
	public UpstoxLogin1Page(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
	}
	
	//Step-3 Implimentation
	
	public void Enter_UN() {
		UN.sendKeys("2QALQX");
	}
	public void Enter_PWD() {
		PWD.sendKeys("Pnishi@321");
	}
	public void Click_LOGIN_BTN() {
		LOGIN_BTN.click();
	}

}
