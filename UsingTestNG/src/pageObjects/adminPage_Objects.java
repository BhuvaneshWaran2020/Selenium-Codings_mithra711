package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminPage_Objects {

	// To Hover Admin
	@FindBy(linkText ="Admin")
	public static WebElement adminLink;
	
	// To Hover Usermanage
	@FindBy(linkText = "User Management")
	public static WebElement  UserManagementLink;
	
	//To hover users
	@FindBy(linkText = "Users")
	public static WebElement UsersLink;
	
	// To Click username
	@FindBy(id="searchSystemUser_userName")
	public static WebElement userName;
	
	// To Click Roletype
	@FindBy(id= "searchSystemUser_userType")
	public static WebElement userRole;
	
	// To click Status
	@FindBy(id="searchSystemUser_status")
	public static WebElement status;
	
	@FindBy(id="searchBtn")
	public static WebElement searchButton;
	
	// X path of user role after search
	@FindBy(xpath="//tr/td[3]")
	public static WebElement userRoleValue1;
	
	// X path of status after Search
	@FindBy(xpath="//tr/td[5]")
	public static WebElement userStatusValue1;
	

}
