package POM_Classes_For_ActiveTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageL {
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginBTN;
  
	//initialization
	public LoginPageL(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterpwd(String password) {
		PWD.sendKeys(password);
	}
	public void clickLoginBTN() {
		loginBTN.click();

}
}