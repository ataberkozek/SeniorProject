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
	WebDriverWait waiter = new WebDriverWait(driver,10);
	
	@AfterExecution
    public void cleanup() {
        if (driver != null) {
            driver.quit();
        }
    }

	@Override
	public void v_ShowAllSearch() {
		//v_WeatherSearch();
		Assert.assertNotNull(driver.findElement(By.id("temperature")).getText());
		Assert.assertNotNull(driver.findElement(By.id("humidity")).getText());
		v_InfoSearch();
		v_CurrencySearch();
		
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
			
			Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void e_goBackWeather() {
		try {
			driver.findElement(By.cssSelector("button")).click();
			driver.findElement(By.id("searchInput")).clear();
			Thread.sleep(2000);
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
			
			Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void e_ClickCurrency() {
		try {
			driver.findElement(By.id("showCurrency")).click();
			
			Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void v_CurrencySearch() {
		Assert.assertNotNull(driver.findElement(By.id("usd")).getText());
		Assert.assertNotNull(driver.findElement(By.id("euro")).getText());
		Assert.assertNotNull(driver.findElement(By.id("try")).getText());

		
	}

	@Override
	public void e_ClickWeatherButton() {
		try {
			driver.findElement(By.id("showWeather")).click();
			
			Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void v_WeatherSearch() {
		Assert.assertNotNull(driver.findElement(By.id("cityTemperature")).getText());
		Assert.assertNotNull(driver.findElement(By.id("cityHumidity")).getText());
		
	}

	@Override
	public void v_SiteIdle() {
	 Assert.assertTrue(waiter.until(ExpectedConditions.titleContains("Discover new cities")));
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
			Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void e_goBackInfo() {
		try {
			driver.findElement(By.cssSelector("button")).click();
			driver.findElement(By.id("searchInput")).clear();
			Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		
	}

	@Override
	public void v_InfoSearch() {
		Assert.assertNotNull(driver.findElement(By.id("population")).getText());
		Assert.assertNotNull(driver.findElement(By.id("countryCurrency")).getText());
		Assert.assertNotNull(driver.findElement(By.id("languages")).getText());
		Assert.assertNotNull(driver.findElement(By.id("region")).getText());
		Assert.assertNotNull(driver.findElement(By.id("subRegion")).getText());
		
	}

}
