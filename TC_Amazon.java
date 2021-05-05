package com.qa.testscript;

import org.testng.Reporter;


import java.io.IOException;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.TestNG;

import com.qa.pages.Amazonpages;
import com.qa.utility.ExcelUtility;
public class TC_Amazon  extends BaseTest{
	
@Test
(dataProvider="getData")
public void search(String input) throws InterruptedException
{	
	AmazonOR.getSearchBox().sendKeys(input);
	AmazonOR.getSearchBTN().click();
	AmazonOR.ClickOn().click();
	Set<String> win=driver.getWindowHandles();
	String han=null;
	for(String s:win)
	{
		System.out.println(s);
		han=s;
	}
	System.out.println(han);//to switch to the new tab
	driver.switchTo().window(han);
	
	AmazonOR.getAddCartButton().click();
	System.out.println("Added to the cart succesfully");
	

}
@DataProvider
public String[][] getData() throws IOException 
{
	String x1path="D:\\selenium\\SeleniumAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
	String x1sheet="Sheet1";
	
	int rowCount=ExcelUtility.getRowCount(x1path, x1sheet);
	int cellCount=ExcelUtility.getCellCount(x1path, x1sheet, rowCount);
	String[][] data=new String[rowCount][cellCount];
	for(int i=1;i<=rowCount;i++)
	{
		for(int j=0;j<cellCount;j++)
		{
			data[i-1][j]=ExcelUtility.getCellData(x1path,x1sheet,i,j);
		}
	}
	return data;
	
}
}










	



