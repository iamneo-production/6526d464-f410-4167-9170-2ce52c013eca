package com.qa.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_4 {
	@Test
	public void signin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("passwd")));
		driver.findElement(By.id("email_create")).sendKeys("iuyttyuiol@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("123455");
		driver.findElement(By.id("customer_lastname")).sendKeys("223344");
		driver.findElement(By.id("passwd")).sendKeys("122@qwer");
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("postcode")));
		driver.findElement(By.id("address1")).sendKeys("23456");
		driver.findElement(By.id("city")).sendKeys("12344");
		Select dropdown=new Select(driver.findElement(By.id("id_state")));
		dropdown.selectByValue("1");
		driver.findElement(By.id("postcode")).sendKeys("abcdes");
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")));
		driver.findElement(By.id("phone_mobile")).sendKeys("asdfvcd");
		driver.findElement(By.id("alias")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).isDisplayed();
		driver.close();
	}
}
