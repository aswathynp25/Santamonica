package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class SpecializationPage {
public WebDriver driver;

	By SpecializationLink=By.id("link-specialization");
	
	//Paths for Creating Specialization component
	
	By NewSpecialization=By.id("specialization_new");
	
	By Specializationedudropdown=By.xpath("//span[contains(text(),'Select an education')]");
	By Specializationeduselect=By.xpath("//li[contains(text(),'Bachelor')]");
	
	By Specializationcoursedropdown=By.xpath("//span[contains(text(),'Select a course')]");
	By Specializationcourseselect=By.xpath("//li[contains(text(),'BE')]");
			
	By EnteringSpecializationName=By.id("specialization_name");
	
	By SpecValidfrom=By.xpath("//span[contains(text(),'Select a valid from')]");
	By SpecValidfromselect=By.xpath("//li[contains(text(),'Date of exam')]");
			
	By SpeciValidityMonths=By.xpath("//input[@id='specialization_validity']");
	
	By SpeciCalculationtype=By.xpath("//span[contains(text(),'Select calculation type')]");
	By SpeciCalculationtypeselect=By.xpath("//li[contains(text(),'Average')]");
			
	By SpecResulttype=By.xpath("//span[contains(text(),'Select a result type')]");
	By SpecResulttypeSelect=By.xpath("//li[contains(text(),'Percentage')]");
	
	By ClickCreateSpecialization=By.id("specialization_create");
	
	
	//Paths for Editing Specialization component
	By EditSpecialization=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Automobile Engineering')]/td[7]/a[1]");
	By EditSpecializationName=By.xpath("//input[@id='specialization_name']");
	By UpdateSpecialization=By.xpath("//button[@id='specialization_update']");
	
	//Paths for deleting Specialization component
	
	By DeleteSpecialization=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Aeronautical Engineering')]/td[7]/a[2]");
	
	public SpecializationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getSpecializationLink()
	{
		return driver.findElement(SpecializationLink);
	}

	//Creating methods for Specialization component
	
	public WebElement getSpecializationNew() {
		return driver.findElement(NewSpecialization);
	}
	
	public WebElement getSpecializationedudropdown() {
		return driver.findElement(Specializationedudropdown);
	}
	
	public WebElement getSpecializationeduselect() {
		return driver.findElement(Specializationeduselect);
	}
	
	public WebElement getSpecializationcoursedropdown() {
		return driver.findElement(Specializationcoursedropdown);
	}
	
	public WebElement getSpecializationcourseselect() {
		return driver.findElement(Specializationcourseselect);
	}
	
	public WebElement getEnteringSpecializationName() {
		return driver.findElement(EnteringSpecializationName);
	}
	
	public WebElement getSpecValidfrom() {
		return driver.findElement(SpecValidfrom);
	}
	
	public WebElement getSpecValidfromselect() {
		return driver.findElement(SpecValidfromselect);
	}
	
	public WebElement getSpeciValidityMonths() {
		return driver.findElement(SpeciValidityMonths);
	}
	
	public WebElement getSpeciCalculationtype() {
		return driver.findElement(SpeciCalculationtype);
	}
	
	public WebElement getSpeciCalculationtypeselect() {
		return driver.findElement(SpeciCalculationtypeselect);
	}
	
	public WebElement getSpecResulttype() {
		return driver.findElement(SpecResulttype);
	}
	  
	public WebElement getSpecResulttypeSelect() {
		return driver.findElement(SpecResulttypeSelect);
	}
	

	
	public WebElement getClickCreateSpecialization() {
		return driver.findElement(ClickCreateSpecialization);
	}
	
	//Editing methods for Specialization component
	
	public WebElement getEditSpecialization() {
		return driver.findElement(EditSpecialization);
	}
	
	public WebElement getEditSpecializationName() {
		return driver.findElement(EditSpecializationName);
	}
	public WebElement getUpdateSpecialization() {
		return driver.findElement(UpdateSpecialization);
	}
	
	//Deleting methods for Specialization component
	
	public WebElement getDeleteSpecialization() {
		return driver.findElement(DeleteSpecialization);
	}
	
	}
