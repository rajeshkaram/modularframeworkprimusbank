package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import test.resources.generic.WebLibrary;

/* ######################################################################################################
 * Class Name: UserLib
 * Description: Contains the methods which are used for the common functionalities of the application
 * Author: Testing Masters
 * Date Created: 14-Feb-2016
 * ######################################################################################################
 */
public class UserLibrary extends WebLibrary 
{
	public static boolean Login(String URL, String UID, String Password) 
	{
		boolean loginstatus = true;
		boolean status;

		status = OpenUrl(URL);
		if (status)
			LogEventWithScreeshot("info", "Application is Up and Running");
		else
			LogEventWithScreeshot("fail", "Unable to Launch primusbank Application");

		status = SetText(test.testcases.ElementProp.Login.UserName, UID);
		if (status)
			LogEventWithScreeshot("info", "Entered UserName");
		else
			LogEventWithScreeshot("fail", "Unable to Enter UserName");

		status = SetText(test.testcases.ElementProp.Login.Password, Password);
		if (status)
			LogEventWithScreeshot("info", "Entered Password");
		else
			LogEventWithScreeshot("fail", "Unable to Enter Password");

		status = ClickElement(test.testcases.ElementProp.Login.btnLogin);
		if (status)
			LogEventWithScreeshot("info", "Clicked on Login");
		else
			LogEvent("fail", "Unable to Click on login");

		wait(2);
		status = Exist("//font[contains(text(),'Welcome')]");
		if(status==false)
		{
			loginstatus =  false;
		}

		return loginstatus;
	}
//=======================================================
	
	public static boolean rolesdetails(String rolename, String roledesc, String roletype) 
	{
		boolean rolesdetailsstatus = true;
		boolean status;

		 status = SetText(test.testcases.ElementProp.roledetails.RoleName,rolename);
		if (status)
			LogEventWithScreeshot("info", "entered  rolename");
		else
			LogEventWithScreeshot("fail", "Unable to entered the rolename");

		status = SetText(test.testcases.ElementProp.roledetails.RoleDesc,roledesc);
		if (status)
			LogEventWithScreeshot("info", "Entered roledesc");
		else
			LogEventWithScreeshot("fail", "Unable to Enter roledesc");
		
		if (status)
			LogEventWithScreeshot("info", "Entered roletype");
		else
			LogEventWithScreeshot("fail", "Unable to Enter roletype");
		if(status==false)
		{
			rolesdetailsstatus =  false;
		}
		return rolesdetailsstatus;

		
		
	}
	
	
	//=======================================================
	
	
	
	
	public static boolean Logout()
	{
		Boolean status;
	
		status = ClickElement("//*[@id='Table_01']/tbody/tr/td[3]/a/img");
		if (status)
			LogEventWithScreeshot("info", "Clicked on Logout");
		else
			LogEventWithScreeshot("fail", "Unable to clickon Clicked on Logout");

		
		return status;
	}
	
	
	//=======================================================
		

public static boolean alerthandle()
{
	Boolean stepStatus = true;
	try
    {
		driver.switchTo().alert().accept();
    }
    catch (Exception e)
    {
        stepStatus = false;
    }
	return stepStatus;
}
}