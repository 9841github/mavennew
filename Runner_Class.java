package com.runner;

//import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.base_Class.Base_Class;
import com.pom.Pom_Class;

public class Runner_Class extends Base_Class {
	public static void main(String[] args) throws InterruptedException {
		getbrowser("chrome");
		Pom_Class ref = new Pom_Class(driver);
		Url("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiA4b2MBhD2ARIsAIrcB-QaienotzUAGTrblbOtaxD5sU4LNsP9_E_tB5nderI97ZrFyTxC6lYaAgq_EALw_wcB");
		inputvalueElement(ref.getSearch(), "handbags");
		ClickOnElement(ref.getSubmit());
		ClickOnElement(ref.getButton());
		sleep(5000);
		ClickOnElement(ref.getCheckbox());
		sleep(5000);
		javascriptexecutor("scrollby", "window.scrollBy(0,1000);", null);
		ClickOnElement(ref.getPokoryclick());
		windows(1);
		ClickOnElement(ref.getAddtobag());
		sleep(5000);
		ClickOnElement(ref.getGotobag());
		System.out.println(driver.getCurrentUrl());
		quit();
	}

}