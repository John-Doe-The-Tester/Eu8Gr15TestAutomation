package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	protected WebDriver driver;

	//constructor
	BasePage() {
		this.driver = Driver.get();
		PageFactory.initElements(driver, this);
	}

}
