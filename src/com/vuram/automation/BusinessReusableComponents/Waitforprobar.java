package com.vuram.automation.BusinessReusableComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Throwables;
import com.vuram.automation.utility.VATT;

public class Waitforprobar extends VATT{
	public void TurnOffImplicitWaits() {
		owebdriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	public void TurnOnImplicitWaits() {
		owebdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void WaitforProgressBar()
	{
		Waitforprobar probar=new Waitforprobar();
		try {
			  probar.TurnOffImplicitWaits();
			  
		while(owebdriver.findElement(By.xpath(".//div[@id='appian-nprogress']//div//div")).isDisplayed())
		{
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			  probar.TurnOnImplicitWaits();
		}	
	}
	public void ExplicitWait(By variable) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(owebdriver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(variable));
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			flow.StepFailWithoutScreenshot(Exception);
			e.printStackTrace();

		}
	}
}

