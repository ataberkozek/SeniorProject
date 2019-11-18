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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GraphWalker(value = "random(edge_coverage(100))", start = "start")
public class DemoTest implements CitySearchDemo{
FirefoxDriver driver = new FirefoxDriver();

	@Override
	public void v_ShowAllSearch() {
		System.out.println("showAll");
		
	}

	@Override
	public void v_ValidCityEntered() {
		System.out.println("validCity");
		
	}

	@Override
	public void e_EnterCity() {
		System.out.println("EnterCity");
		
	}

	@Override
	public void e_ClickInfoSearchButton() {
		System.out.println("clickinfo");
		
	}

	@Override
	public void e_init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_ClickShowAllButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_ClickCurrency() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_CurrencySearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_ClickWeatherButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_InvalidCityEntered() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_InvalidSearch() {
		// TODO Auto-generated method stub
		
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
	public void e_InvalidInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_InfoSearch() {
		// TODO Auto-generated method stub
		
	}

}
