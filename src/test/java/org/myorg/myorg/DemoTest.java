package org.myorg.myorg;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@GraphWalker(value = "random(edge_coverage(100))", start = "start")
public class DemoTest extends ExecutionContext implements CitySearchDemo{
	
	WebDriver driver = new FirefoxDriver();

	@Override
	public void v_ShowAllSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_ValidCityEntered() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_EnterCity() {
		driver.findElement(By.id("searchInput")).sendKeys("Istanbul");
		
	}

	@Override
	public void e_ClickInfoSearchButton() {
		try {
			driver.findElement(By.id("showInfo")).click();
			
			Thread.sleep(6000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void e_goBackWeather() {
		try {
			driver.findElement(By.cssSelector("button")).click();
			driver.findElement(By.id("searchInput")).clear();
			Thread.sleep(6000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void e_invalidCity() {
		try {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("button")).click();
		driver.findElement(By.id("searchInput")).clear();
		Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void e_init() {
		driver.get("http://127.0.0.1:5500/home.html");
		
	}

	@Override
	public void e_ClickShowAllButton() {
		try {
			driver.findElement(By.id("showAll")).click();
			
			Thread.sleep(6000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void e_ClickCurrency() {
		try {
			driver.findElement(By.id("showCurrency")).click();
			
			Thread.sleep(6000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void v_CurrencySearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_ClickWeatherButton() {
		try {
			driver.findElement(By.id("showWeather")).click();
			
			Thread.sleep(6000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void v_WeatherSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_SiteIdle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_goBackShowAll() {
		driver.findElement(By.id("searchInput")).clear();
		
	}

	@Override
	public void e_goBackCurrency() {
		try {
			driver.findElement(By.cssSelector("button")).click();
			driver.findElement(By.id("searchInput")).clear();
			Thread.sleep(6000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void e_goBackInfo() {
		try {
			driver.findElement(By.cssSelector("button")).click();
			driver.findElement(By.id("searchInput")).clear();
			Thread.sleep(6000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void v_InfoSearch() {
		// TODO Auto-generated method stub
		
	}

}
