package com.dropdown;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingFunctions  {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		BasePack.Base.selectValueFromDropDown(e->e.selectByVisibleText("India"),element);
		selectValueFromDropDown(e->e.selectByValue("MEX"),element);
		selectValueFromDropDown(e->e.selectByIndex(3),element);
		
		driver.quit();

	}
	
	private static void selectValueFromDropDown(Consumer<Select>consumer, WebElement element) {
		//Select select = new Select(element);
		consumer.accept(new Select(element));
	}
}
