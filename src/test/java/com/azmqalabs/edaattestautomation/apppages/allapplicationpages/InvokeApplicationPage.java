package com.azmqalabs.edaattestautomation.apppages.allapplicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.azmqalabs.edaattestautomation.apppages.masterpages.BasePage;
import com.azmqalabs.edaattestautomation.common.Log;
import com.azmqalabs.edaattestautomation.common.uielement.fieldDecorator;
import com.azmqalabs.edaattestautomation.objectrepository.EdaatOR;

public class InvokeApplicationPage extends BasePage {

	public InvokeApplicationPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(new fieldDecorator(driver, test), this);
	}

	public void Chooseoptions(Log Log) {
		try {
			WebClickUsingJS(EdaatOR.LoginPage_Changelanguage);
			Thread.sleep(1000);
			this.takeScreenShot();
			Thread.sleep(2000);
			WebClickUsingJS(EdaatOR.Biller_Link);
			Log.ReportEvent("PASS", " Verify Biller Application Launched Suceessfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
