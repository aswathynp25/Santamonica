package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.id("password-field");
	By login=By.xpath(".//*[@id='new_user']/div[4]/div/input");
	
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getusername()
	{
		return driver.findElement(username);
	}

	public WebElement getpassword() {
		return driver.findElement(password);
	}
	
	public WebElement getlogin() {
		return driver.findElement(login);
	}
}
