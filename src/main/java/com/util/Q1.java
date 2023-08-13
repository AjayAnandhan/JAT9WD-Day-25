package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

            
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
            
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();

        driver.findElement(By.xpath("//a[text()='22']")).click();

        String selectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

        driver.quit();
        
	}

}
