package com.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.base_Class.Base_Class;
import com.objects_Only.Page_Object_Manager;
import com.pom_Class1.Pom_Class1;
import com.pom_Class1.Pom_Class2;
import com.pom_Class1.Pom_Class3;
import com.pom_Class1.Pom_Class4;
import com.pom_Class1.Pom_Class5;
import com.pom_Class1.Pom_Class6;
import com.pom_Class1.Pom_Class7;

public class Runner_Class2 extends Base_Class {
	public static WebDriver driver = getbrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		Url("https://www.snapdeal.com/");
		actions("movetoelement", pom.getp1().getClickelectonics());
		ClickOnElement(pom.getp1().getSemiautomatic());
		sleep(5000);
		ClickOnElement(pom.getp2().getTvaudioclick());
		ClickOnElement(pom.getp2().getDthclick());
		javascriptexecutor("scrollby", "window.scrollBy(0,800);", null);
		sleep(5000);
		actions("movetoelement", pom.getp3().getClickdthbox());
		sleep(4000);
		ClickOnElement(pom.getp3().getMsgbox());
		takesscreenshot("./picture/img.png");
		ClickOnElement(pom.getp4().getClosewindow());
		ClickOnElement(pom.getp4().getImg());
		sleep(5000);
		windows(1);
		javascriptexecutor("scrollby", "window.scrollBy(0,200);", null);
		ClickOnElement(pom.getp4().getAddtocart());
		sleep(4000);
		ClickOnElement(pom.getp5().getCheckout());
		navigate("https://www.snapdeal.com/");
		actions("movetoelement", pom.getp6().getCatext());
		ClickOnElement(pom.getp7().getJackets());
		sleep(4000);
		javascriptexecutor("scrollby", "window.scrollBy(0,1000);", null);
		sleep(4000);
		ClickOnElement(pom.getp7().getSelectblazers());

	}
}
