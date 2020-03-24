package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.commonFunctionsss;
import pageObjects.dashboard_Objects;
import pageObjects.login_Objects;

public class Pending_leave_Request extends commonFunctionsss {
	String msge = null;
	public void login() {
		// To get value of elements we use page factory class
				PageFactory.initElements(driver, login_Objects.class);
				login_Objects.userName.sendKeys(property.getProperty("username"));
				login_Objects.password.sendKeys(property.getProperty("password"));
				login_Objects.loginButton.click();
	}
	
	public void getleaverequest() {
		// To Take Value of pending leave request
		PageFactory.initElements(driver, dashboard_Objects.class);
		/*String*/ msge =  dashboard_Objects.pendingLeaveRequests.getText();
	}
	@Test
	public void pendingleaveRequest() {	
		login(); // calling above method
		getleaverequest();
		
		// To verify the result
		Assert.assertEquals(msge, "No Records are Available");
		
		
	}
	

}

