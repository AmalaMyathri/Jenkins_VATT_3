package com.vuram.automation.Businessflows;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vuram.automation.BusinessReusableComponents.User_Login;
import com.vuram.automation.BusinessReusableComponents.Waitforprobar;
import com.vuram.automation.utility.VATT;
@Test
public class Organisation extends VATT{
	Waitforprobar pro=new Waitforprobar();
	public void AddOrg() throws Exception
	{
		User_Login login=new User_Login();
		login.Userlogin();
		flow.ClickLinkBasedonIndex(16);
		pro.WaitforProgressBar();
		flow.ClickWebElement("Add Organization");
		pro.WaitforProgressBar();
		flow.ExplicitWait(By.xpath("//span//strong[text()='Add Organization']"));
	}

}
