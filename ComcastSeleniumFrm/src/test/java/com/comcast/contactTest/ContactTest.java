package com.comcast.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="smokeTesting")
  public void createContactTest() {
	  System.out.println("createContactTest is running");
  }
	@Test(groups="regressionTesting")
  public void editContactTest() {
	  System.out.println("editContactTest is running");
  }
	@Test(groups="regressionTesting")
  public void deleteContactTest() {
	  System.out.println("deleteContactTest is running");
  }
	@Test(groups="regressionTesting")
  public void searchContactTest() {
	  System.out.println("searchContact is running");
  }
  
}
