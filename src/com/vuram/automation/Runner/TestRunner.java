package com.vuram.automation.Runner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import com.vuram.automation.support.Dynamicxmlcreation;
import com.vuram.automation.Constants.Constants;

public class TestRunner extends Dynamicxmlcreation {
	public List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
	public HashMap<String, String> testcase = new HashMap<String, String>();
	public List<XmlSuite> mySuites = null;
	public List<XmlTest> myTests = new ArrayList<XmlTest>();
	
	// Run it as java application to kick start the execution and don't change anything here
	public static void main(String args[]) throws IOException { 
		try {
			omxl.runTestNGTest(Constants.Excelfilepath, Constants.sheetname,Constants.sheetnameforOutput,Constants.xmlfilename, Constants.Suitename,
					Constants.reportfolderpath);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
