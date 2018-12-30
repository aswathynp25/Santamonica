package StudyAbroad;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initilizeDriver();
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password,String Text) throws IOException
	{
		
			// driver =initilizeDriver();
//driver.get("http://santa-monica-beta.tmzb2q34ip.ap-south-1.elasticbeanstalk.com/");
		//one is inheritance
		// creating object to that class and invoke methods of it
	    driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
	//	l.getprofilepic().click();
	    l.getSignin().click();
	   	    LoginPage lp=new LoginPage(driver);
	    lp.getusername().sendKeys(Username);
	    lp.getpassword().sendKeys( Password);
	  //  System.out.println(Text);
	    log.info(Text);
	    lp.getlogin().click();
	   
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restrcited User";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		data[1][2]= "Non restricted user";
		return data;
	}
}