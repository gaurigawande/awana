package Test_Class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class.Base_For_AvtiveTime;
import POM_Classes_For_ActiveTime.HomePageL;
import POM_Classes_For_ActiveTime.LoginPageL;
import Util_Class.Utility;


public class Test_ActiveTime extends Base_For_AvtiveTime {
	LoginPageL l;
	HomePageL h;
	
	@BeforeClass
	public void openBrowser() {
		initialBrowser();//non static method for non static context directly call
		
	 l=new LoginPageL(driver);
	 h=new HomePageL(driver);
		
	}
	@BeforeMethod
	public void openApp() throws Throwable {
		l.enterUN(Utility.getTD(0,0));
		
		l.enterpwd(Utility.getTD(0,1));
		l.clickLoginBTN();
	}
	@Test
	public void verifytest() throws Throwable {
		Reporter.log("running verify test",true);
		String actText=h.verifyText();
		String expText=Utility.getTD(0,2);
		Assert.assertEquals(expText,actText,"both are different TC is fail");
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from applicatoin",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the browser");
	}
	

}