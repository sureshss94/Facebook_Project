package com.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver browser_Configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		return driver;

	}
	public static void geturl(String url) {
           driver.get(url);
	}

	public static void clickonElement(String type, WebElement element) {

		if (type.equalsIgnoreCase("click")) {
			element.click();
		} else if (type.equalsIgnoreCase("clear")) {
			element.clear();

		}
	}

	public static void inputValueElement(WebElement element, String data) {

		element.sendKeys(data);

	}

	public static void dropdown(String type, WebElement element, String data) {

		try {
			Select s = new Select(element);

			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(data);

			} else if (type.equalsIgnoreCase("bytext")) {
				s.selectByVisibleText(data);

			} else if (type.equalsIgnoreCase("byindex")) {
				int index = Integer.parseInt(data);
				s.selectByIndex(index);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void waitbrowser(String type, int sec) throws Exception {
		if (type.equalsIgnoreCase("wait")) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		} else if (type.equalsIgnoreCase("longwait")) {
			Thread.sleep(sec);
		}

	}

	public static void TakesScreenshot(String path) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(scr, dest);
		;

	}
	public static void Driver_operations(String type) {
		if (type.equalsIgnoreCase("close")) {
			driver.close();
			
		} else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		} else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}else if (type.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}
}
