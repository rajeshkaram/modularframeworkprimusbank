package test.testcases;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Module1 extends UserLibrary
{
	

	public static void TC01_primusbanklogin()
	{
		
		Boolean status;
		status = OpenUrl(URL);
		if (status)
			LogEventWithScreeshot("info", "Application is Up and Running");
		else
			LogEventWithScreeshot("fail", "Unable to Launch primusbank Application");
		
		status = SetText("//*[@id='txtuId']", UserName);
		if (status)
			LogEventWithScreeshot("info", "Entered UserName");
		else
			LogEventWithScreeshot("fail", "Unable to Enter UserName");
		
		status = SetText("//*[@id='txtPword']", Password);
		if (status)
			LogEventWithScreeshot("info", "Entered Password");
		else
			LogEventWithScreeshot("fail", "Unable to Enter Password");

		status = ClickElement("//*[@id='login']");
		if (status)
			LogEventWithScreeshot("info", "Clicked on Login");
		else
			LogEvent("fail", "Unable to Click on login");
		
		
		status = Exist("//font[contains(text(),'Welcome')]");
		if (status)
			LogEventWithScreeshot("pass", "Login is sucessful");
		else
			LogEventWithScreeshot("pass", "Login is not sucessful");		
	}
		
		
	public static void  TC02_primusbankverifyrolespage()
			{
				

					Boolean status;
					status = OpenUrl(URL);
					if (status)
						LogEventWithScreeshot("info", "Application is Up and Running");
					else
						LogEventWithScreeshot("fail", "Unable to Launch primusbank Application");
					
					status = SetText("//*[@id='txtuId']", UserName);
					if (status)
						LogEventWithScreeshot("info", "Entered UserName");
					else
						LogEventWithScreeshot("fail", "Unable to Enter UserName");
					
					status = SetText("//*[@id='txtPword']", Password);
					if (status)
						LogEventWithScreeshot("info", "Entered Password");
					else
						LogEventWithScreeshot("fail", "Unable to Enter Password");

					status = ClickElement("//*[@id='login']");
					if (status)
						LogEventWithScreeshot("info", "Clicked on Login");
					else
						LogEvent("fail", "Unable to Click on login");
					
					status = Exist("//font[contains(text(),'Welcome')]");
					if (status)
						LogEventWithScreeshot("pass", "Login is sucessful");
					else
						LogEventWithScreeshot("pass", "Login is not sucessful");
					
					status = ClickElement("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img");
					if (status)
						LogEventWithScreeshot("info", "Clicked on roles page");
					else
						LogEvent("fail", "Unable to Click on roles page");
					status = ClickElement("//*[@id='btnRoles']");
					if (status)
						LogEventWithScreeshot("info", "Clicked on new role button");
					else
						LogEvent("fail", "Unable to Click on new role button");
					
					status = SetText("//*[@id='txtRname']",RoleName);
					if (status)
						LogEventWithScreeshot("info", "Entered rolename");
					else
						LogEventWithScreeshot("fail", "Unable to Enter rolename");
					
					status = SetText("//*[@id='txtRDesc']",RoleDesc);
					if (status)
						LogEventWithScreeshot("info", "Entered roledesc");
					else
						LogEventWithScreeshot("fail", "Unable to Enter roledesc");
					
					status = SelectOPtionByText("//*[@id='lstRtypeN']", RoleType);
					if (status)
						LogEventWithScreeshot("pass", "Able to Select on Role Type");
					else
						LogEventWithScreeshot("fail", "UnAble to Select on RoleType");
					
					status = ClickElement("//*[@id='btninsert']");
					if (status)
						LogEventWithScreeshot("info", "Clicked on submit button");
					else
						LogEvent("fail", "Unable to Click on submit button");
					alerthandle();
					
					
					Logout();
					
			}
}
					
