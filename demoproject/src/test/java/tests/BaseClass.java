package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	

	/*"platformName": "Android",
	  "deviceName": "Samsung",
	  "appPackage": "com.example.myapplication",
	  "appActivity": "com.example.myapplication.MainActivity"*/
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "ONEPLUS 3T");
		
		caps.setCapability(CapabilityType.VERSION, "9.0.4");
	     //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ONEPLUS A3003");
	     //caps.setCapability(MobileCapabilityType.UDID, "39794077");
	     caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000); 
	     //caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	     caps.setCapability(MobileCapabilityType.APP,"/Users/satyadeep/AndroidStudioProjects/MyApplication2/app/build/outputs/apk/debug/app-debug.apk");
		
		caps.setCapability("appPackage", "com.example.myapplication");
		caps.setCapability("appActivity", "com.example.myapplication.MainActivity");
		caps.setCapability("noReset", "false");
	   //  driver = new RemoteWebDriver(url,capabilities)	     
	     
	//     URL url = new URL("http://localhost:4723/wd/hub");
	     URL url = new URL("http://127.0.0.1:4723/wd/hub");
	    driver= new AndroidDriver<MobileElement>(url,caps);	 
	    driver.findElement(By.id("click_me")).click();
	    	
		
	     
	}
	
	@Test
	public void SampleTest()
	
	{	
		System.out.println("I am running Android test");
	}
	
	@AfterTest
	public void teardown()
	
	{
		
		
		
	}
	

}
