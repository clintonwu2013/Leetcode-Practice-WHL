package javaapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mxxxx\\Desktop\\selenium\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver = new ChromeDriver();

		//Applied wait time
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();

		//open browser with desried URL
		driver.get("https://www.google.com");

		//closing the browser
		driver.close();

	}

}
