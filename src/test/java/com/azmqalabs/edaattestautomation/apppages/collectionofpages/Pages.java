package com.azmqalabs.edaattestautomation.apppages.collectionofpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.azmqalabs.edaattestautomation.apppages.allapplicationpages.*;
import com.azmqalabs.edaattestautomation.common.DBConnect;
import com.azmqalabs.edaattestautomation.common.uielement.fieldDecorator;

public class Pages{

	private WebDriver driver;
	private ExtentTest test;
	public BillerLoginPage BillerLoginPage;
	public DBConnect DBConnect;
	public InvokeApplicationPage InvokeApplicationPage;
	public BillerSettingsPage BillersettingsPage;
	public BillerSettingProductsManagementPage BillerSettingProductsManagementPage;
	public BillerUserMngUserListPage BillerUserMngUserListPage;

	public Pages(WebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(new fieldDecorator(driver,test), this);
		DBConnect= new DBConnect(driver,test);
		InvokeApplicationPage = new InvokeApplicationPage(driver,test);
		BillerLoginPage = new  BillerLoginPage(driver,test);
		BillersettingsPage=new  BillerSettingsPage(driver,test);
		BillerSettingProductsManagementPage=new  BillerSettingProductsManagementPage(driver,test);
		BillerUserMngUserListPage=new  BillerUserMngUserListPage(driver,test);
	}
}
