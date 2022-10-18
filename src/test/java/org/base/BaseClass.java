package org.base;

import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	public void loadUrl(String url) {
		driver.get(url);

	}
	
	public void maximize() {
		
		driver.manage().window().maximize();

	}
	
	public void quite() {
		
		driver.quit();

	}

}
