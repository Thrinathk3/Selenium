package com.foreach;

import java.util.*;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.get("http://amazon.in");
		List<WebElement> elements = dr.findElements(By.xpath("//a"));
		
		//Consumer<WebElement> consumer = (e)-> System.out.println(e.getText());
		
		Consumer<WebElement> consumer1 = (e)->{
			if(!e.getText().isEmpty()) {
				System.out.println(e.getText());
			}
		};
		
		//elements.forEach(consumer);
		elements.forEach(consumer1);
		
		
		
		
		//elements.forEach(e->System.out.println(e.getText()));
		
	}

}

