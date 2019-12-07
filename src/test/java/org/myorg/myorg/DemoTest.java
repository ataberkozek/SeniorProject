package org.myorg.myorg;


import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
public class DemoTest extends ExecutionContext implements CitySearchDemo {
	public static ArrayList<String> cityList = new ArrayList<String>();

	public static WebDriver driver = new FirefoxDriver();
	public WebDriverWait waiter = new WebDriverWait(driver,10);
	
	@AfterExecution
    public void cleanup() {
        if (driver != null) {
            driver.quit();
        }
    }

  /**
   * This method implements the {EDGE_VERTEX} 'button_currencyReturn'
   * {DESCRIPTION}
   */
  public void button_currencyReturn() {
		godMethod("button_currencyReturn");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'button_infoReturn'
   * {DESCRIPTION}
   */
  public void button_infoReturn() {
		godMethod("button_infoReturn");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'button_showAll'
   * {DESCRIPTION}
   */
  public void button_showAll() {
		godMethod("button_showAll");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'button_showCurrency'
   * {DESCRIPTION}
   */
  public void button_showCurrency() {
		godMethod("button_showCurrency");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'button_showInfo'
   * {DESCRIPTION}
   */
  public void button_showInfo() {
		godMethod("button_showInfo");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'button_showWeather'
   * {DESCRIPTION}
   */
  public void button_showWeather() {
		godMethod("button_showWeather");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'button_weatherReturn'
   * {DESCRIPTION}
   */
  public void button_weatherReturn() {
		godMethod("button_weatherReturn");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_goBackShowAll'
   * {DESCRIPTION}
   */
  public void e_goBackShowAll() {
	  driver.findElement(By.id("searchInput")).clear();
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_init'
   * {DESCRIPTION}
   */
  public void e_init() {
		godMethod("e_init");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_invalidCity'
   * {DESCRIPTION}
   */
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

  /**
   * This method implements the {EDGE_VERTEX} 'text_searchInput'
   * {DESCRIPTION}
   */
  public void text_searchInput() {
		godMethod("text_searchInput");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_CurrencySearch'
   * {DESCRIPTION}
   */
  public void v_CurrencySearch() {
		Assert.assertNotNull(driver.findElement(By.id("usd")).getText());
		Assert.assertNotNull(driver.findElement(By.id("euro")).getText());
		Assert.assertNotNull(driver.findElement(By.id("try")).getText());
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_InfoSearch'
   * {DESCRIPTION}
   */
  public void v_InfoSearch() {
		Assert.assertNotNull(driver.findElement(By.id("population")).getText());
		Assert.assertNotNull(driver.findElement(By.id("countryCurrency")).getText());
		Assert.assertNotNull(driver.findElement(By.id("languages")).getText());
		Assert.assertNotNull(driver.findElement(By.id("region")).getText());
		Assert.assertNotNull(driver.findElement(By.id("subRegion")).getText());
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_ShowAllSearch'
   * {DESCRIPTION}
   */
  public void v_ShowAllSearch() {
	  Assert.assertNotNull(driver.findElement(By.id("temperature")).getText());
		Assert.assertNotNull(driver.findElement(By.id("humidity")).getText());
		v_InfoSearch();
		v_CurrencySearch();
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_SiteIdle'
   * {DESCRIPTION}
   */
  public void v_SiteIdle() {
	  Assert.assertTrue(waiter.until(ExpectedConditions.titleContains("Discover new cities")));
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_ValidCityEntered'
   * {DESCRIPTION}
   */
  public void v_ValidCityEntered() {
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_WeatherSearch'
   * {DESCRIPTION}
   */
  public void v_WeatherSearch() {
		Assert.assertNotNull(driver.findElement(By.id("cityTemperature")).getText());
		Assert.assertNotNull(driver.findElement(By.id("cityHumidity")).getText());
		
  }


	public static void godMethod(String str){
		String[] parts = str.split("_");
		if(parts[0].equals("button")) {
			try {
				driver.findElement(By.id(parts[1])).click();
				Thread.sleep(2000);
				}catch(Exception e){
					System.out.println(e);
				}
		} else if(parts[0].equals("text")){
			String result = selectRandomCity();
			driver.findElement(By.id(parts[1])).sendKeys(result);
		} else if(parts[1].equals("init")){
			driver.get("http://127.0.0.1:5500/home.html");
		}
		}
		public static String selectRandomCity() {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("src/test/java/org/myorg/myorg/cities.txt"));
        } catch(Exception e) {
            System.out.println("Could not find file");
        }

        int count = 0;
        while(scanner.hasNext()) {
            count++;
            cityList.add(scanner.next());
        }

        Random generator = new Random();
        int randomNumber = generator.nextInt(count);

        String selectedCity = cityList.get(randomNumber);

        return selectedCity;
    }

    public static boolean isValidCity(String city) {

        boolean isValid = false;
        for (int i = 0; i < cityList.size(); i++) {
            if (city.equalsIgnoreCase(cityList.get(i))) {
                isValid = true;
            }
        }
        return isValid;
    }
}

