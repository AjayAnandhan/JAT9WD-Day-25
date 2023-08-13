package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guvi.in/");
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ajay");
		
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Anandan");
		
		driver.findElement(By.xpath("//input[@id='emailInput']")).sendKeys("wotini8828@vreaa.com");
		
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Ajay@123");
		
		driver.findElement(By.xpath("//input[@id='mobileNumberInput']")).sendKeys("8012241506");
				
		driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();
		
		Thread.sleep(10000);
		
		WebElement a  = driver.findElement(By.xpath("//*[@id=\"status_title\"]"));
		
		String SU = a.getText();
		
		if(SU.contains("Successfully Registered")) {
			
			System.out.println("Sign up was successfull!");
			
			driver.findElement(By.xpath("//*[@id=\"status_proceed\"]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"login_email\"]")).sendKeys("wotini8828@vreaa.com");
			
			driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys("Ajay@123");
			
			driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
			
			Thread.sleep(5000);
			
			WebElement b = driver.findElement(By.xpath("//*[@id=\"title\"]"));
			
			String LI = b.getText();
			
			if(LI.contains("Activation")) {
				System.out.println("Log in was successfull");
				driver.close();
			}
			else {
				System.out.println("Log in was failed");
				driver.close();
			}
			
		}
		else {
			System.out.println("Sign up was failed!");
			driver.close();
		}
		
				
	}

}
