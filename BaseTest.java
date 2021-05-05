package com.qa.testscript;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages.Amazonpages;
import com.qa.pages.Flipkartpages;
import com.qa.pages.RediffPages;

public class BaseTest {

	public WebDriver driver;
	public RediffPages RediffOR;
	public Amazonpages AmazonOR;
	public Flipkartpages FlipkartOR;
	public SoftAssert softAssertion;


	@BeforeClass
	@Parameters({ "browser", "pageUrl"})
	public void Setup(String browser, String pageUrl) {
		switch (browser) {
		case "chrome": 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGADEESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		    break; 
			
		case "edge": 
			System.setProperty("webdriver.edge.driver", "C:\\Users\\JAGADEESH\\Downloads\\edgedriver_arm64\\msedgedriver.exe");
			driver = new EdgeDriver();
		    break; 
		/*
		case "firefox": 
			System.setProperty("webdriver.gecko.driver", "F:\\trainings\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		    break; */
	
		default: 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGADEESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		    break; 

		}
	 RediffOR =new RediffPages(driver);
		AmazonOR=new Amazonpages(driver);
		FlipkartOR=new Flipkartpages(driver);
	
		
		driver.get(pageUrl);

		softAssertion= new SoftAssert();
	}

	@AfterClass
	public void TearDown() {
		softAssertion.assertAll();
		driver.quit();
	}

	public void captureScreenshot(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source =ts.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"/Screenshots/"+ tname+".png");
		FileUtils.copyFile(Source, target);
		System.out.println("Screenshot is captured");
		
	}
}
