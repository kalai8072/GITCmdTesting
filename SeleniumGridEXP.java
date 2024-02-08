package org.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumGridEXP {
	WebDriver driver;

	@Test
	public void setup() throws MalformedURLException {

		String url = "https://www.youtube.com/";
		String Node = "http://192.168.43.71:4444";

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");

		cap.setPlatform(Platform.WINDOWS);

		//cap.setBrowserName("firefox");

		//cap.setPlatform(Platform.WINDOWS);

		WebDriver driver = new RemoteWebDriver(new URL(Node), cap);
		driver.get(url);
		driver.getTitle();
		driver.close();

	}
}
