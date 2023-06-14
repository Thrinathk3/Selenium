package com.qa.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public final class OrderPage extends Base {
	
	private OrderPage() {}
	@Test
	public void orderPageTitleVerfy() throws InterruptedException{
		WebElement electronic = driver.findElement(By.xpath("//descendant::div[@class='eFQ30H'][4]"));
		WebElement laptop = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronic).perform();
		Thread.sleep(3000);
		act.moveToElement(laptop).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe' and text()='Laptops']")).click();
		Thread.sleep(3000);
		String actTitle = driver.getTitle();
		String expTitle = "Laptop Buy Online at Lowest Prices in India - Laptops Deals | Flipkart.com";
		Assert.assertEquals(expTitle, actTitle, "verfyTitle");
		
	}

}
