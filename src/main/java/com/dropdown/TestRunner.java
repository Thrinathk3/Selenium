package com.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		selectValueFromDropDown(element, "India", "text");
		selectValueFromDropDown(element, "MEX", "value");
		selectValueFromDropDown(element, "1", "index");
		
		driver.quit();

	}
	private static void selectValueFromDropDown(WebElement element, String textorValueorInder, String strategy) {
		Select select = new Select(element);
		if(strategy.equalsIgnoreCase("text")) {
			select.selectByVisibleText(textorValueorInder);
		}
		else if(strategy.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(textorValueorInder));
		}
		else if(strategy.equalsIgnoreCase("value")) {
			select.selectByValue(textorValueorInder);
		}
		else {
			System.out.println("invalid strategy");
		}
	}
}
