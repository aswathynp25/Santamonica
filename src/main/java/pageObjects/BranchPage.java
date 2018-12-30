package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BranchPage {
	public WebDriver driver;
//Creating the branch
	By BranchLink=By.linkText("Branch");
	By BranchNew=By.id("branch_new");
	By Branchphotoupload=By.xpath("//div[@id='branch_photo_upload']/div/input");
	By BranchName=By.id("branch_name");
	By Branchtypedropdown=By.xpath("//span[contains(text(),'Select a type')]");
	By Branchtypeselect=By.xpath("//li[contains(text(),'Associated branch')]");
	By BranchCode=By.id("branch_code" );
	By BranchActive=By.xpath("//form [@id='new_branch']/div[1]/div[3]/div/div/label/span");
	By Branchdescription=By.id("branch_description");
	By Branchcurrencydropdown=By.xpath("//span[contains(text(),'Select a currency')]");
	By BranchCurrencyselect=By.xpath("//li[contains(text(),'Indian Rupee')]");
	By Branchstartdate=By.id("branch_start_date");
	By Branchdateok=By.xpath("//div/div[2]/button[@class='dtp-btn-ok btn btn-success']");
	By BranchAddress=By.id("branch_address_attributes_address");
	By BranchAddressdropdown=By.xpath("//span[contains(text(),'Select an address type')]");
	By BranchAddressSelect=By.xpath("//li[contains(text(),'Permanent')]");
	By BranchCountrydropdown=By.xpath("//span[contains(text(),'Select a country')]");
	By BranchCountrySelect=By.xpath("//li[contains(text(),'India')]");
	By BranchStatedropdown=By.xpath("//span[contains(text(),'Select a state')]");
	By BranchStateSelect=By.xpath("//li[contains(text(),'Kerala')]");
	By BranchDistrictdropdown=By.xpath("//span[contains(text(),'Select a district')]");
	By BranchDistrictSelect=By.xpath("//li[contains(text(),'Kannur')]");
	By Branchcitydropdown=By.xpath("//span[contains(text(),'Select a city')]");
	By Branchcityselect=By.xpath("//li[contains(text(),'Kannur')]");
	By BranchLandmark=By.id("branch_address_attributes_landmark");
	By Branchpostoffice=By.id("branch_address_attributes_post_office");
	By BranchPincode=By.id("branch_address_attributes_pincode");
	By BranchLatitude=By.id("branch_address_attributes_latitude");
	By BranchLogitutude=By.id("branch_address_attributes_longitude");
	By BranchTimezoneDropdown=By.xpath("//span[contains(text(),'Select a timezone')]");
	By BranchTimezoneselect=By.xpath("//li[contains(text(),'(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi')]");
	By Branchcreate=By.id("branch_create");
	
	//Editing the branch
	By EditBranch=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Kannur')]/td[6]/a[2]");
	By EditActiveBranch=By.xpath("//form[@class='edit_branch']/div[1]/div[3]/div/div/label/span");
	By EditBranchEndDate=By.xpath("//input[@id='branch_end_date']");
	By UpdateBranch=By.xpath("//button[@id='branch_update']");
	
	//Viewing the branch
	By Branchview=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Kannur')]/td[6]/a[1]");
	By Branchbreadcrumb=By.xpath("//ol[@class='breadcrumb']/li[2]/a");
   
	//creating branchphoneno
	By Branchphoneno=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Kannur')]/td[6]/a[4]");
	By Branchphonenotype=By.xpath("//span[@id='select2-branch_contact_details_attributes_0_contact_type_option-container']");
	By Branchselectphonenotype=By.xpath("//ul/li[contains(.,'Mobile')]");
    By BranchEnteringphoneno=By.xpath("//input[@id='branch_contact_details_attributes_0_contact_value']");
    By BranchCreatephoneno=By.xpath("//form/div[2]/button[@id='branch_save_phone_number']");
    By Branchclosephoneno=By.xpath("//div/button[@id='branch_cancel_phone_number']");
    
   //Editing branchphoneno
    By Brancheditphoneno=By.xpath("//td/a[@id='edit_branch_phone_number']");
    By Brancheditphonenotype=By.xpath("//span[@id='select2-branch_contact_details_attributes_0_contact_type_option-container']");
    By Brancheditselectphonenotype=By.xpath("//ul/li[contains(.,'General')]");
    By Brancheditenteredphoneno=By.xpath("//input[@id='branch_contact_details_attributes_0_contact_value']");
    By Branchupdatephoneno=By.xpath("//button[@id='branch_save_phone_number']");
    By Brancheditclosephoneno=By.xpath("//div/button[@id='branch_cancel_phone_number']");
    
   //Deleting branchphoneno
    By Branchdeletephoneno=By.xpath("//a[@id='delete_branch_phone_number']");
   
    
	//Creating BranchmailId
	By BranchEmailId=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Kannur')]/td[6]/a[5]");
	By Branchemailtype=By.xpath("//span[@id='select2-branch_contact_details_attributes_0_contact_type_option-container']");
    By Branchemailselecttype=By.xpath("//ul/li[contains(.,'Official')]");
    By Branchenteremailid=By.xpath("//div/input[@id='branch_contact_details_attributes_0_contact_value']");
    By BranchCreateemail=By.xpath("//form/div[2]/button[@id='branch_save']");
    By Branchcloseemail=By.xpath("//div/button[@id='branch_cancel']");
    
    
   //Editing BranchmailId
    By BrancheditEmailId=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Kannur')]/td[6]/a[5]");
    By BranchclickemailId=By.xpath("//td/a[@id='edit_branch_email']");
    By Brancheditemailtype=By.xpath("//span[@id='select2-branch_contact_details_attributes_0_contact_type_option-container']");
    By Brancheditemailselecttype=By.xpath("//ul/li[contains(.,'Private')]");
    By Branchupdateemailid=By.xpath("//div/input[@id='branch_contact_details_attributes_0_contact_value']");
    By Branchclickupdateemail=By.xpath("//div/button[@id='branch_save']");
    By Brancheditcloseemail=By.xpath("//button[@id='branch_cancel']");
    
  //Deleting BranchmailId
	By BranchDeleteemailId=By.xpath("//a[@id='delete_branch_email']");
	
  // Deleting Branch 
     By BranchDelete=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Kannur')]/td[6]/a[6]");
     
   //creating branchincharge
     By BranchIncharge=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Kochi')]/td[6]/a[3]");
     By Branchinchargedropdown=By.xpath("//span[@id='select2-branch_branch_incharge_id-container']");
     By Branchselectincharge=By.xpath("//li[contains(text(),'Ashley Joseph S-SM001')]");
     By BranchAssignincharge=By.xpath("//form/div[2]/button[@id='assign_branch_incharge']");
     
   //Deleting BranchIncharge  
     By DeleteBranchIncharge=By.xpath("//div[@class='card-body reload_index']//tr[contains(., 'Ashley Joseph S-SM001')]/td[4]/a[1]");
			
	public BranchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//Creating the Branch
	
	public WebElement getBranchLink()
	{
		return driver.findElement(BranchLink);
	}
	
	public WebElement getBranchNew()
	{
		return driver.findElement(BranchNew);
	}
	
	public WebElement getBranchphotoupload()
	{
		return driver.findElement(Branchphotoupload);
	}
	
	public WebElement getBranchName()
	{
		return driver.findElement(BranchName);
	}
	
	public WebElement getBranchtypedropdown()
	{
		return driver.findElement(Branchtypedropdown);
	}
	
	public WebElement getBranchtypeselect()
	{
		return driver.findElement(Branchtypeselect);
	}
	

	public WebElement getBranchCode()
	{
		return driver.findElement(BranchCode);
	}
	
	public WebElement getBranchActive()
	{
		return driver.findElement(BranchActive);
	}
	
	public WebElement getBranchdescription()
	{
		return driver.findElement(Branchdescription);
	}
	
	public WebElement getBranchcurrencydropdown()
	{
		return driver.findElement(Branchcurrencydropdown);
	}
	
	public WebElement getBranchCurrencyselect()
	{
		return driver.findElement(BranchCurrencyselect);
	}
	
	public WebElement getBranchstartdate()
	{
		return driver.findElement(Branchstartdate);
	}
	
	public WebElement getBranchdateok()
	{
		return driver.findElement(Branchdateok);
	}
	
	public WebElement getBranchAddress()
	{
		return driver.findElement(BranchAddress);
	}
	
	public WebElement getBranchAddressdropdown()
	{
		return driver.findElement(BranchAddressdropdown);
	}
	
	public WebElement getBranchAddressSelect()
	{
		return driver.findElement(BranchAddressSelect);
	}
	
	public WebElement getBranchCountrydropdown()
	{
		return driver.findElement(BranchCountrydropdown);
	}
	public WebElement getBranchCountrySelect()
	{
		return driver.findElement(BranchCountrySelect);
	}
	
	public WebElement getBranchStatedropdown()
	{
		return driver.findElement(BranchStatedropdown);
	}
	
	public WebElement getBranchStateSelect()
	{
		return driver.findElement(BranchStateSelect);
	}
	
	public WebElement getBranchDistrictdropdown()
	{
		return driver.findElement(BranchDistrictdropdown);
	}
	
	public WebElement getBranchDistrictSelect()
	{
		return driver.findElement(BranchDistrictSelect);
	}
	
	public WebElement getBranchcitydropdown()
	{
		return driver.findElement(Branchcitydropdown);
	}
	
	public WebElement getBranchcityselect()
	{
		return driver.findElement(Branchcityselect);
	}
	
	public WebElement getBranchLandmark()
	{
		return driver.findElement(BranchLandmark);
	}
	public WebElement getBranchpostoffice()
	{
		return driver.findElement(Branchpostoffice);
	}
	
	public WebElement getBranchPincode()
	{
		return driver.findElement(BranchPincode);
	}
	public WebElement getBranchLatitude()
	{
		return driver.findElement(BranchLatitude);
	}
	public WebElement getBranchLogitutude()
	{
		return driver.findElement(BranchLogitutude);
	}
	public WebElement getBranchTimezoneDropdown()
	{
		return driver.findElement(BranchTimezoneDropdown);
	}
	
	public WebElement getBranchTimezoneselect()
	{
		return driver.findElement(BranchTimezoneselect);
	}
	public WebElement getBranchcreate()
	{
		return driver.findElement(Branchcreate);
	}
	
	
	//Edit the Branch
	public WebElement getEditBranch()
	{
		return driver.findElement(EditBranch);
	}
	
	public WebElement getEditActiveBranch()
	{
		return driver.findElement(EditActiveBranch);
	}
	
	public WebElement getEditBranchEndDate()
	{
		return driver.findElement(EditBranchEndDate);
	}
	
	public WebElement getUpdateBranch()
	{
		return driver.findElement(UpdateBranch);
	}
	
	
	//Viewing the Branch
	
	public WebElement getBranchview()
	{
		return driver.findElement(Branchview);
	}
	
	public WebElement getBranchbreadcrumb()
	{
		return driver.findElement(Branchbreadcrumb);
	}
	
	
	//Creating BranchPhone Number
	
	public WebElement getBranchphoneno()
	{
		return driver.findElement(Branchphoneno);
	}
	
	public WebElement getBranchphonenotype()
	{
		return driver.findElement(Branchphonenotype);
	}
	public WebElement getBranchselectphonenotype()
	{
		return driver.findElement(Branchselectphonenotype);
	}
	public WebElement getBranchEnteringphoneno()
	{
		return driver.findElement(BranchEnteringphoneno);
	}
	public WebElement getBranchCreatephoneno()
	{
		return driver.findElement(BranchCreatephoneno);
	}
	
	//Editing the BranchPhone Number
	
	public WebElement getBranchclosephoneno()
	{
		return driver.findElement(Branchclosephoneno);
	}
	
	public WebElement getBrancheditphoneno()
	{
		return driver.findElement(Brancheditphoneno);
	}
	public WebElement getBrancheditphonenotype()
	{
		return driver.findElement(Brancheditphonenotype);
	}
	public WebElement getBrancheditselectphonenotype()
	{
		return driver.findElement(Brancheditselectphonenotype);
	}
	
	public WebElement getBrancheditenteredphoneno()
	{
		return driver.findElement(Brancheditenteredphoneno);
	}
	
	public WebElement getBranchupdatephoneno()
	{
		return driver.findElement(Branchupdatephoneno);
	}
	 
  //Delete Branch Phone number
	public WebElement getBranchdeletephoneno()
	{
		return driver.findElement(Branchdeletephoneno);
	} 
	
	//Create BranchEmail ID
	
	public WebElement getBranchEmailId()
	{
		return driver.findElement(BranchEmailId);
	}
	
	public WebElement getBranchemailtype()
	{
		return driver.findElement(Branchemailtype);
	}
	
	public WebElement getBranchemailselecttype()
	{
		return driver.findElement(Branchemailselecttype);
	}
	
	public WebElement getBranchenteremailid()
	{
		return driver.findElement( Branchenteremailid);
	}
	
	public WebElement getBranchCreateemail()
	{
		return driver.findElement(BranchCreateemail);
	}
	
	
	public WebElement getBranchcloseemail()
	{
		return driver.findElement(Branchcloseemail);
	}
	
	//Editing BranchEmailId
	
	public WebElement getBrancheditEmailId()
	{
		return driver.findElement(BrancheditEmailId);
	}
	public WebElement getBranchclickemailId()
	{
		return driver.findElement(BranchclickemailId);
	}
	
	public WebElement getBrancheditemailtype()
	{
		return driver.findElement(Brancheditemailtype);
	}
	
	public WebElement getBrancheditemailselecttype()
	{
		return driver.findElement(Brancheditemailselecttype);
	}
	
	public WebElement getBranchupdateemailid()
	{
		return driver.findElement(Branchupdateemailid);
	}
	
	public WebElement getBranchclickupdateemail()
	{
		return driver.findElement(Branchclickupdateemail);
	}
	
	public WebElement getBrancheditcloseemail()
	{
		return driver.findElement(Brancheditcloseemail);
	}
	
// Deleting the branchemail
	public WebElement getBranchDeleteemailId()
	{
		return driver.findElement(BranchDeleteemailId);
	}
	
	//Deleting the Branch
	public WebElement getBranchDelete()
	{
		return driver.findElement(BranchDelete);
	}
	
	//Creating Branch Incharge
	
		public WebElement getBranchIncharge()
		{
			return driver.findElement(BranchIncharge);
		}
		
		public WebElement getBranchinchargedropdown()
		{
			return driver.findElement(Branchinchargedropdown);
		}
		public WebElement getBranchselectincharge()
		{
			return driver.findElement(Branchselectincharge);
		}
		public WebElement getBranchAssignincharge()
		{
			return driver.findElement(BranchAssignincharge);
		}
		
		
		// Deleting BranchIncharge
		public WebElement getDeleteBranchIncharge()
		{
			return driver.findElement(DeleteBranchIncharge);
		}
	
}
