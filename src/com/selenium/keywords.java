package com.selenium;

import org.openqa.selenium.By;

public class keywords {
	public static void openurl(String inputurl)
	{
		deiverinstance.driver.get(inputurl);
	}
	
	
	public static void click(String xpath)
	{
		deiverinstance.driver.findElement(By.xpath(xpath)).click();
	}
	
	
	public static void type(String input, String xpath)
	{
		deiverinstance.driver.findElement(By.xpath(xpath)).sendKeys(input);;
	}
}
