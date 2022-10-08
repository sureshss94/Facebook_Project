package com.facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.objects.Pom;
import com.singletondesign.File_Read_Manager;

public class Runner_Class extends BaseClass {
	public static WebDriver driver = browser_Configuration("chrome");

	public static Pom mypom = new Pom(driver);

	@Test(priority = -2)
	private void urlLaunch() throws IOException {
		geturl(File_Read_Manager.get_Instance_Frm().get_Instance_Fb().get_Instance_Url());

	}

	@Test(priority = -1)
	private void logIn() throws IOException {
		inputValueElement(mypom.getEmail(),
				File_Read_Manager.get_Instance_Frm().get_Instance_Fb().get_Instance_Username());

		inputValueElement(mypom.getPassword(),
				File_Read_Manager.get_Instance_Frm().get_Instance_Fb().get_Instance_Password());

		clickonElement("click", mypom.getLogin());
	}

	@Test(priority = 0)
	private void takeScreenshot() throws Exception {
		waitbrowser("longwait", 3000);
		TakesScreenshot("C:\\Users\\suresh\\facebook\\Screenshot/my.png");
		Driver_operations("back");

	}

	@Test(priority = 1)
	private void backToPage() {
		clickonElement("click", mypom.getCreate());
	}

	@Test(priority = 2)
	private void create_Account() throws Exception {

		waitbrowser("wait", 10);

		inputValueElement(mypom.getFirstname(),
				File_Read_Manager.get_Instance_Frm().get_Instance_Fb().get_Instnce_Fname());
		inputValueElement(mypom.getPasswordincreate(),
				File_Read_Manager.get_Instance_Frm().get_Instance_Fb().get_Instance_Passwordcreate());

		dropdown("byvalue", mypom.getDate(), "3");

		dropdown("byvalue", mypom.getMonth(), "3");

		dropdown("byvalue", mypom.getYear(), "2005");
		clickonElement("click", mypom.getGender());

		clickonElement("click", mypom.getSubmitbtn());
		waitbrowser("wait", 10);

		TakesScreenshot("C:\\\\Users\\\\suresh\\\\facebook\\\\Screenshot/my1.png");

	}

}
