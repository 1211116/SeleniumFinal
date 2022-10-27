package com.timeTracking.actitime.Automation.genericUtitlty;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
@BeforeSuite
	public void bsConfig() {
	System.out.println("Database Connect has been extablised");

}

@BeforeClass
public void bcConfig() {
System.out.println("The Browser  Connect has been launced");
System.out.println("Navigate to the url");

}
@BeforeMethod
public void bmConfig() {
System.out.println("logged in to the application");
}

@AfterMethod
public void amConfig() {
System.out.println("logged out from  the application");
}

@AfterClass
public void acConfig() {
	System.out.println("Browser has been closed");
}

@AfterSuite
public void asConfig() {
	System.out.println("End Database connections");
}
}
