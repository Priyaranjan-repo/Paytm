package com.paytm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookMyShowPratice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/activities-mumbai");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//div[text()='Mumbai Filmcity Tour']"));
		action.contextClick(rightclick).perform();

	}

}
