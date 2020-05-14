package org.graphwalker.graphwalker;


import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@GraphWalker(value = "random(edge_coverage(100))", start = "start")
public class DemoTest extends ExecutionContext implements TeaWebsite {
public static List<String> listo = new ArrayList<String>();
public static ArrayList<String> cityList = new ArrayList<String>();
public static WebDriver driver = new FirefoxDriver();
public WebDriverWait waiter = new WebDriverWait(driver,10);


  /**
   * This method implements the {EDGE_VERTEX} 'css_dotbtndotbtnmnsprimary'
   * {DESCRIPTION}
   */

  public void css_dotbtnmnsprimary() {
		godMethod("css_dotbtnmnsprimary");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'css_dotwsbmnsbuttondotbuttonczgtheme'
   * {DESCRIPTION}
   */

  public void css_dotwsbmnsbuttondotbuttonczgtheme() {
		godMethod("css_dotwsbmnsbuttondotbuttonczgtheme");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'css_dotwsbmnsbuttondotcustomStyle'
   * {DESCRIPTION}
   */

  public void css_dotwsbmnsbuttondotcustomStyle() {
		godMethod("css_dotwsbmnsbuttondotcustomStyle");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_init'
   * {DESCRIPTION}
   */

  public void e_init() {
		godMethod("e_init");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'id_address'
   * {DESCRIPTION}
   */

  public void text_address() {
		godMethod("text_address");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'id_cardczgnumber'
   * {DESCRIPTION}
   */

  public void text_cardczgnumber() {
		godMethod("text_cardczgnumber");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'id_cardholderczgname'
   * {DESCRIPTION}
   */

  public void text_cardholderczgname() {
		godMethod("text_cardholderczgname");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'id_email'
   * {DESCRIPTION}
   */

  public void text_email() {
		godMethod("text_email");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'id_name'
   * {DESCRIPTION}
   */

  public void text_name() {
		godMethod("text_name");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'id_verificationczgcodevvvvvvv'
   * {DESCRIPTION}
   */

  public void text_verificationczgcode() {
		godMethod("text_verificationczgcode");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'select_card_type'
   * {DESCRIPTION}
   */

  public void select_cardczgtype() {
	  Select ss = new Select(driver.findElement(By.id("card_type")));
		ss.selectByVisibleText("Mastercard");
		//godMethod("select_cardczgtype");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'start'
   * {DESCRIPTION}
   */

  public void start() {
		godMethod("start");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_AddressEntered'
   * {DESCRIPTION}
   */

  public void v_AddressEntered() {
		godMethod("v_AddressEntered");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_CardHolderNameEntered'
   * {DESCRIPTION}
   */

  public void v_CardHolderNameEntered() {
		godMethod("v_CardHolderNameEntered");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_CardNumEntered'
   * {DESCRIPTION}
   */

  public void v_CardNumEntered() {
		godMethod("v_CardNumEntered");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_CardTypeSelected'
   * {DESCRIPTION}
   */

  public void v_CardTypeSelected() {
		godMethod("v_CardTypeSelected");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_CheckOut'
   * {DESCRIPTION}
   */

  public void v_CheckOut() {
		godMethod("v_CheckOut");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_ClickedTea'
   * {DESCRIPTION}
   */

  public void v_ClickedTea() {
		godMethod("v_ClickedTea");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_EmailEntered'
   * {DESCRIPTION}
   */

  public void v_EmailEntered() {
		godMethod("v_EmailEntered");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_NameEntered'
   * {DESCRIPTION}
   */

  public void v_NameEntered() {
		godMethod("v_NameEntered");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_PlacedOrder'
   * {DESCRIPTION}
   */

  public void v_PlacedOrder() {
		godMethod("v_PlacedOrder");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_VerificationCodeEntered'
   * {DESCRIPTION}
   */

  public void v_VerificationCodeEntered() {
		godMethod("v_VerificationCodeEntered");
		
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_WebsiteOpened'
   * {DESCRIPTION}
   */

  public void v_WebsiteOpened() {
		godMethod("v_WebsiteOpened");
		
  }


		public static void godMethod(String str){
	String[] parts = str.split("_");
	if(parts[0].equals("start")) {}
	else if(parts[0].equals("css")) {
			try {
				driver.findElement(By.cssSelector(beautify(parts[1]))).click();
				listo.clear();
				Thread.sleep(2000);
			} catch(Exception e){
				System.out.println(e);
			}
		
		} else if (parts[0].equals("id")) {
			try {
				driver.findElement(By.id(beautify(parts[1]))).click();
				listo.clear();
				Thread.sleep(2000);
			} catch(Exception e){
				System.out.println(e);
			}
		} else if (parts[0].equals("name")) {
			try {
				driver.findElement(By.name(beautify(parts[1]))).click();
				listo.clear();
				Thread.sleep(2000);
			} catch(Exception e){
				System.out.println(e);
			}
		}  else if(parts[0].equals("button")) {
				try {
					driver.findElement(By.id(beautify(parts[1]))).click();
					listo.clear();
					Thread.sleep(2000);
				} catch(Exception e){
					System.out.println(e);
				}
		} else if(parts[0].equals("text")){
			String email = "ataberk@deneme.com";
			String name = "ataberk ozek";
			String address = "57  Merthyr Road";
			String cardNum = "5542923476485129";
			String verCode = "123";
			if(parts[1].equals("email")) {
				driver.findElement(By.id(parts[1])).sendKeys(email);
			} else if (parts[1].equals("name")) {
				driver.findElement(By.id(parts[1])).sendKeys(name);
			}else if(parts[1].equals("address")) {
				driver.findElement(By.id(parts[1])).sendKeys(address);
			}else if (parts[1].equals("cardczgnumber")) {
				driver.findElement(By.id(beautify(parts[1]))).sendKeys(cardNum);
				listo.clear();
			}else if (parts[1].equals("cardholderczgname")) {
				driver.findElement(By.id("cardholder_name")).sendKeys(name);
				listo.clear();
			} else if (parts[1].equals("verificationczgcode")) {
				driver.findElement(By.id("verification_code")).sendKeys(verCode);
				listo.clear();
			}
		} else if(parts[1].equals("init")){
			driver.get("http://www.practiceselenium.com/welcome.html");
		}
}

public static String beautify(String str) {
    String result = "";
    char[] result2 = str.toCharArray();

    for(int i=0; i<str.length(); i++){
        listo.add(String.valueOf(result2[i]));
    }
    if (str.toLowerCase().contains("dot".toLowerCase())) {
        for (int i = 0; i < listo.size(); i++) {
            if (listo.get(i).equals("o") && listo.get(i-1).equals("d") && listo.get(i+1).equals("t") && i != 0) {
                listo.set(i-1, ".");
                listo.remove(i);
                listo.remove(i);
                result = String.join("", listo);
            }
        }
    }
    if (str.toLowerCase().contains("mns".toLowerCase())) {
        for (int i = 0; i < listo.size(); i++) {
            if (listo.get(i).equals("n") && listo.get(i-1).equals("m") && listo.get(i+1).equals("s") && i != 0) {
                listo.set(i-1, "-");
                listo.remove(i);
                listo.remove(i);
                result = String.join("", listo);
            }
        }
    }  if (str.toLowerCase().contains("czg".toLowerCase())) {
        for (int i = 0; i < listo.size(); i++) {
            if (listo.get(i).equals("z") && listo.get(i-1).equals("c") && listo.get(i+1).equals("g") && i != 0) {
                listo.set(i-1, "_");
                listo.remove(i);
                listo.remove(i);
                result = String.join("", listo);
            }
        }
    }
    return result;
}
		private static int selectRandomNum(int size) {
			Random rgen = new Random();
			int r = rgen.nextInt(size+1);
			return r;
		}
}

