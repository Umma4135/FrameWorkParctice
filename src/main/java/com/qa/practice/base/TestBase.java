package com.qa.practice.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.test.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties pro;
	public static FileInputStream fis;
	public static WebDriver driver;

	public void driver_int() throws IOException {

		pro = new Properties();
		fis = new FileInputStream("C:\\Users\\umma4\\eclipse-workspace\\FrameWorkPractice\\src\\main\\java\\com\\qa\\practice\\config\\Configuration.properties");
                                   //use FileInputStream method, its read file
		pro.load(fis);
		String browser_Name = pro.getProperty("Browser");

		if (browser_Name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser_Name.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser_Name.equalsIgnoreCase("edge")) {
			//

		} else if (browser_Name.equalsIgnoreCase("safari")) {
			//

		} else if (browser_Name.equalsIgnoreCase("opera")) {
			//
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");

	}
	public static void main(String[] args) throws IOException {
		TestBase bb = new TestBase();
		bb.driver_int();
	}




	
		

	


	
	}
	
