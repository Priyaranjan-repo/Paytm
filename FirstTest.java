package com.paytm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://paytm.com");
		System.out.println(driver.getTitle());

	}
}
