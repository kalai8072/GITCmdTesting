package org.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestingUsingGrid {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {
		String StandaloneURL = "http://192.168.43.71:4444";

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64");
		driver = new RemoteWebDriver(new URL(StandaloneURL), cap);

	}

	@Test (priority=1)
	public void test1() {

		System.out.println("Test one Started....");
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}

	@Test (priority=2)
	public void test2() {

		System.out.println("Test two Started....");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}

	@Test (priority=3)
	public void test3() {

		System.out.println("Test three Started....");
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}
	@Test (priority=4)
	public void test4() {

		System.out.println("Test four Started....");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		
	}


}
