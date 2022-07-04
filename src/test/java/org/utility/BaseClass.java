package org.utility;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String val;
	static File f=new File("C:\\Users\\soni\\eclipse-workspace\\ProjectModuleWithoutPage\\src\\test\\resources\\testData\\credentials.properties");
	static File f1=new File("C:\\\\Users\\\\soni\\\\eclipse-workspace\\\\ProjectModuleWithoutPage\\\\src\\\\test\\\\resources\\\\testData\\\\BillingAddress.properties");
	static FileReader fr;
	static FileWriter write;
	static Properties prop;
	static TakesScreenshot ts;
	public static void browserLauch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public static void getUrl(String val) {
		driver.get(val);	

	}

	public static WebElement findEleById(String id) {
		return driver.findElement(By.id(id));

	}
	

	public static WebElement findEleByName(String name) {
		return driver.findElement(By.id(name));

	}

	public static WebElement findEleByXpath(String xpath) {
		return driver.findElement(By.id(xpath));

	}
	public static void Screenshot() throws IOException {
		ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);		
		File Destination = new File("C:\\Users\\soni\\eclipse-workspace\\ProjectModuleWithoutPage\\src\\test\\resources\\testData\\output.jpeg");
		FileUtils.copyFile(Source, Destination);
		
	}

	public static void data(WebElement element, String data) {
		try {
			fr=new FileReader(f);
			prop = new Properties();
			prop.load(fr);
			val = prop.getProperty(data);
			element.sendKeys(val);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
		
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void readProperty(String value) {
		try {
			fr=new FileReader(f);
			prop = new Properties();
			prop.load(fr);
			val = prop.getProperty(value);
			getUrl(val);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
		
	}
	public static void getValue(WebElement element,String value) throws IOException {
		String attValue=element.getAttribute(value);		
		write=new FileWriter(f1);
		prop = new Properties();
		prop.setProperty("BookingId", attValue);
		prop.store(write, "FirstFile");		
		
	}
	

}
