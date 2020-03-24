package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.commonFunctionsss;
import pageObjects.adminPage_Objects;

public class user_Role extends commonFunctionsss{

	// Move to Option of user
	public void MoveToUserPage() {	
		Actions actions = new Actions(driver);
		actions.moveToElement(adminPage_Objects.adminLink);
		actions.moveToElement(adminPage_Objects.UserManagementLink);
		actions.moveToElement(adminPage_Objects.UsersLink);
		actions.click().build().perform();
	}
	
	// To Select User Role
	public void selectUserRole() {
		Select selectuser = new Select(adminPage_Objects.userRole);
		selectuser.selectByIndex(1);
	}
	
	//To select Status
	public void selectStatus() {
		Select selectStatus = new Select(adminPage_Objects.status);
		selectStatus.selectByIndex(1);
	}
	
	@Test
	public void checkUserRole() {
		PageFactory.initElements(driver,adminPage_Objects.class);
		MoveToUserPage();
		selectUserRole();
		selectStatus();
		// To Click Search Button
		adminPage_Objects.searchButton.click();
		
		// To get text of userrole and status
		String roleValue = adminPage_Objects.userRoleValue1.getText();
		String Status = adminPage_Objects.userStatusValue1.getText();
		
		// to verify
		Assert.assertEquals(roleValue, "Admin");
		Assert.assertEquals(Status, "Enabled");
		
	}
}

