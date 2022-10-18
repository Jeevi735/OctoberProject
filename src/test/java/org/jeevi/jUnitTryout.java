package org.jeevi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jUnitTryout {

	public static WebDriver driver;

	@BeforeClass
	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Before
	public void urlLaunch() {

		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void login() {

		WebElement textUser = driver.findElement(By.id("username"));
		textUser.sendKeys("Jeevi735");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Jeevi@8667033225");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@After
	public void searchHotel() {

		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(3);

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByIndex(2);

		WebElement type = driver.findElement(By.id("room_type"));
		Select s2 = new Select(type);
		s2.selectByIndex(1);

		WebElement nos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(nos);
		s3.selectByIndex(3);

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
		radioButton.click();
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();

	}

	@AfterClass

	public static void hotelBooking() {
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Jeevi");

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("C");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Mylambadi");

		WebElement cardNum = driver.findElement(By.id("cc_num"));
		cardNum.sendKeys("9087654321654321");

		WebElement type = driver.findElement(By.id("cc_type"));
		Select st = new Select(type);
		st.selectByIndex(2);

		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select sm = new Select(expMonth);
		sm.selectByIndex(9);

		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select sy = new Select(expYear);
		sy.selectByVisibleText("2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("143");

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();

		WebElement id = driver.findElement(By.xpath("//input[@value='D1TCCU9CA1']"));
		
		Actions act =new Actions(driver);
		act.doubleClick(id).perform();
		
		
		
		
		driver.close();

	}

}
