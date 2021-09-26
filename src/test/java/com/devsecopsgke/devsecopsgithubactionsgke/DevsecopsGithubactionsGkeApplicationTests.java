package com.devsecopsgke.devsecopsgithubactionsgke;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;




class DevsecopsGithubactionsGkeApplicationTests {
	private WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.navigate().to("http://35.200.200.123/");		
	}
	@Test
	public void userLogin()
	{		
System.out.println("Current URL is:" + driver.getCurrentUrl());
System.out.println("Current Title is:" + driver.getTitle());
	}
	@AfterClass
	public void tearDown(){
		if (driver != null) {
			driver.quit();
		}
	}
}
