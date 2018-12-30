package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class SpecializationComponentPage {
public WebDriver driver;
	//creating
	By SpecializationComponentLink=By.id("link-specialization-component");
	By NewSpecializationComponent=By.id("specialization_component_new");
	By SpecComponentedudropdown=By.xpath("//span[contains(text(),'Select an education')]");
	By SpecComponenteduselect=By.xpath("//li[contains(text(),'Prerequisite')]");
	By SpecComponentcoursedropdown=By.xpath("//span[contains(text(),'Select a course')]");
	By SpecComponentcourseselect=By.xpath("//li[contains(text(),'Eng. Proficiency ')]");
	By SpecComponentSpecidropdown=By.xpath("//span[@id='select2-specialization_component_specialization_id-container']");
	By SpecComponentSpeciselect=By.xpath("//li[contains(text(),'IELTS')]");
	By EnteringSpecializationComponentName=By.id("specialization_component_name");
	By CreateSpecializationcomponent=By.id("specialization_component_create");

	//Editing 
	
	By EditSpecializationComponent=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Reading')]/td[3]/a[1]");
	By EditingSpecializationComponentName=By.xpath("//input[@id='specialization_component_name']");
	By SpecializationcomponentUpdateButton=By.xpath("//button[@id='specialization_component_update']");
	
	
	//Deleting 
	
	By DeleteSpecializationcomponent=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Listening')]/td[3]/a[2]");
	
	
	
//Methods for creating 
	
	public SpecializationComponentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getSpecializationComponentLink()
	{
		return driver.findElement(SpecializationComponentLink);
	}

	public WebElement getNewSpecializationComponent() {
		return driver.findElement(NewSpecializationComponent);
	}
	
	public WebElement getSpecComponentedudropdown() {
		return driver.findElement(SpecComponentedudropdown);
	}
	
	public WebElement getSpecComponenteduselect(){
		return driver.findElement(SpecComponenteduselect);
	}
	
	public WebElement getSpecComponentcoursedropdown() {
		return driver.findElement(SpecComponentcoursedropdown);
	}
	
	public WebElement getSpecComponentcourseselect() {
		return driver.findElement(SpecComponentcourseselect);
	}
	
	public WebElement getSpecComponentSpecidropdown() {
		return driver.findElement(SpecComponentSpecidropdown);
	}
	
	public WebElement getSpecComponentSpeciselect() {
		return driver.findElement(SpecComponentSpeciselect);
	}
	
	public WebElement getEnteringSpecializationComponentName() {
		return driver.findElement(EnteringSpecializationComponentName);
	}
	
	public WebElement getCreateSpecializationcomponent() {
		return driver.findElement(CreateSpecializationcomponent);
	}
	
	//Methods for Editing
	
	public WebElement getEditSpecializationComponent() {
		return driver.findElement(EditSpecializationComponent);
	}
	
	public WebElement getEditingSpecializationComponentName() {
		return driver.findElement(EditingSpecializationComponentName);
	}
	
	public WebElement getSpecializationcomponentUpdateButton() {
		return driver.findElement(SpecializationcomponentUpdateButton);
	}
	
	
	
	//Methods for deleting
	
	public WebElement getDeleteSpecializationcomponent() {
		return driver.findElement(DeleteSpecializationcomponent);
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
