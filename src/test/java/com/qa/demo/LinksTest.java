package com.qa.demo;

import java.util.ArrayList;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTest {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://amazon.in");
	}

	@Test(description="find Links only started with \"C\" or\"D\"", priority=1,enabled=true)
	public void linkWithChar() {
		System.out.println("*************"
				+ "**********************************");
		//find Links only started with "C" or"D"
		driver.findElements(By.xpath("//a"))
		.stream()
		.map(f->f.getText())
		.filter(s->!s.isEmpty())
		.distinct()	
		.sorted()
		.filter(s->s.startsWith("C")||s.startsWith("D"))
		.forEach(System.out::println);
		
	}
	@SuppressWarnings("unlikely-arg-type")
	@Test(enabled=false)
	public void linkWithCharss() {
		System.out.println("*************"
				+ "**********************************");
		List<String> allLinks = new ArrayList<>();

		
		driver.findElements(By.xpath("//a"))
		.stream()
		.map(f->f.getText())
		.filter(s->!s.isEmpty())
		.sorted()
		.forEach(link->allLinks.add(link));
		
		
		List<String> allLink = new ArrayList<>(new HashSet<String>(allLinks));
		for(String link:allLinks) {
			if(!link.equals(allLink)) {
				System.out.println(link);
			}
		}
	}
	
	@Test(enabled=false)
	public void linkWithChars() {
		System.out.println("***********************************************");
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		List<String> text = new ArrayList<>();
		
		for (int i=0;i<list.size();i++) {
			String temp = list.get(i).getText();
			if(!temp.isEmpty()) {
				text.add(list.get(i).getText());
			}
		}
		/*
		 *for (WebElement element:list) {
			if(!element.getText().isEmpty()) 
				text.add(element.getText());
		}*/
		List<String> listAfterRemovingDuplicates = new ArrayList<>(new HashSet<String>(text));
		Collections.sort(listAfterRemovingDuplicates);
		
		for(int i=0;i<listAfterRemovingDuplicates.size();i++) {
			String temp = listAfterRemovingDuplicates.get(i);
			if(temp.startsWith("C")||temp.startsWith("D")) {
				System.out.println(temp);
			}
		}
		/*
		 * for(String str:listAfterRemovingDuplicates) {
			if(str.startsWith("C")||str.startsWith("D")) 
				System.out.println(str);
		}*/
		
		
	}
	@Test(description="find empty links count", priority=2,enabled=false)
	public void counteEmptylinks() {
		//find empty links count
		System.out.println("***********************************************");
		long count = driver.findElements(By.xpath("//a"))
				.stream()
				.parallel()
				.map(f->f.getText())
				.filter(s->s.isEmpty())
				.count();
		System.out.println("Number of Empty Links is :"+count);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}


