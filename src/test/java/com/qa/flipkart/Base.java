package com.qa.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
		@BeforeClass
		public void setUP() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
		}
		
		@AfterClass
		public void tearDown() {
			driver.close();
		}
}
