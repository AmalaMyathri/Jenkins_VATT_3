package com.vuram.automation.BusinessReusableComponents;

import com.vuram.automation.utility.VATT;

public class User_Login extends VATT{
	public void Userlogin() throws Exception
	{
		flow.OpenURL("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		flow.LoginwithUserNameandPassword("sureshc@vuram.com", "test1234");
	}

}


