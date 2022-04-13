package com.vuram.automation.Businessflows;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vuram.automation.BusinessReusableComponents.User_Login;
import com.vuram.automation.BusinessReusableComponents.Waitforprobar;
import com.vuram.automation.utility.VATT;
@Test
public class RaiseExpenseRequest extends VATT{
	Waitforprobar pro=new Waitforprobar();
	public  void RaiseRequest() throws Exception
	{
		try {
		User_Login login=new User_Login();
		login.Userlogin();
		owebdriver.findElement(By.xpath("(//*[text()='   Expense '])[1]")).click();
		pro.WaitforProgressBar();
		flow.ClickWebElement("Submit Expense Reimbursement");
		flow.ExplicitWait(By.xpath("//*[text()='Expense Reimbursement Form']"));
		pro.WaitforProgressBar();
		flow.Timeout(5000);
		owebdriver.findElement(By.xpath("//*[@placeholder='Give a name for your request']")).sendKeys("Mickey");
		flow.SingleSelectDropDown("CSR Expenses", "Expense Category");
		pro.WaitforProgressBar();
		flow.SingleSelectDropDown("INR", "Reimbursement Currency");
		flow.SelectCheckboxBasedonIndex(2);
		pro.WaitforProgressBar();
		owebdriver.findElement(By.xpath("//button//*[@class='DatePickerWidget---calendar_icon']")).click();
		owebdriver.findElement(By.xpath("(//div[@class='DatePicker---footer']//div//button)[1]")).click();
		pro.WaitforProgressBar();
		flow.Timeout(4000);
		flow.SingleSelectDropDown("Donation", "Expense Type");
		flow.SingleSelectDropDown("Corporate Credit Card", "Payment Mode");
		flow.SingleSelectDropDown("EUR", "Expense Currency");
		flow.SetWebText("2", "Conversion Rate");
		flow.SetWebText("10000", "Expense Amount");
		flow.SetWebText("Spent on office setup", "Expense Notes");
		flow.ClickWebElement("Add new Attachment");
		flow.ExplicitWait(By.xpath("//*[text()='Expense Item']"));
		flow.SingleSelectDropDown("1 - Donation", "Expense Item");
		flow.UploadFile("C:\\Users\\amalamarym\\Downloads\\dummy pdf (4).pdf");
		flow.Timeout(5000);
		flow.SetWebText("Reimbursment needed ", "Comments");
		flow.ClickWebElement("Review");
        flow.ExplicitWait(By.xpath("//*[text()='Review  Expense Reimbursement Details']"));
        String ExpenseAmount=owebdriver.findElement(By.xpath("//*[text()='TOTAL AMOUNT TO BE REIMBURSED:']")).getText();
        System.out.println(ExpenseAmount);
        flow.ClickWebElement("Submit");
        flow.ClickWebElement("Yes");
        flow.ExplicitWait(By.xpath("//*[text()='Submit Expense Reimbursement']"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
