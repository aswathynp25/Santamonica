package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
public WebDriver driver;

By Setup=By.xpath("//a[@id='link-setup']/span");
By Academic=By.xpath("//a[@id='dropdown-link-academics']");
	
By Office=By.linkText("Office");

By Business=By.linkText("Business");


By IR=By.linkText("IR");

By HR=By.linkText("HR");

By TandA=By.linkText("T & A");

By Candidates=By.linkText(" Candidates");

	public Menu(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getOffice()
	{
		return driver.findElement(Office);
	}
	
	public WebElement getBusiness() {
		return driver.findElement(Business);
	}
	
	//All the modules of Setup

	public WebElement getSetup() {
		return driver.findElement(Setup);
	}
	
	public WebElement getAcademic() {
		return driver.findElement(Academic);
	}

	public WebElement getIR() {
		return driver.findElement(IR);
	}
	
	public WebElement getHR() {
		return driver.findElement(HR);
	}
	
	public WebElement getTandA() {
		return driver.findElement(TandA);
	}
	
	public WebElement getCandidates() {
		return driver.findElement(Candidates);
	}
	}
	

