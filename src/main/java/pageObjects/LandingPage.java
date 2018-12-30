package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
	
	//By profilepic=By.xpath("//img[@class='profile-pic']");
	By signin=By.id("sm-signin");
	//By title=By.xpath("html/body/div[4]/div/h2");
	By title=By.cssSelector(".text-center.text-info.m-t-20");


	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

//	public WebElement getprofilepic()
//	{
//		return driver.findElement(profilepic);
//	}

	public WebElement getSignin() {
		return driver.findElement(signin);
	}
	
	public WebElement gettitle() {
		return driver.findElement(title);
	}
	}
	

