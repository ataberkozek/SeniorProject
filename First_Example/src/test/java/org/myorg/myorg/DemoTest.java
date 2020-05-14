package org.myorg.myorg;


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
public class DemoTest extends ExecutionContext implements TestShop {
public static List<String> listo = new ArrayList<String>();
public static ArrayList<String> cityList = new ArrayList<String>();
public static WebDriver driver = new FirefoxDriver();
public WebDriverWait waiter = new WebDriverWait(driver,10);

  /**
   * This method implements the {EDGE_VERTEX} 'button_SubmitLogin'
   * {DESCRIPTION}
   */
public void button_SubmitLogin() {
		godMethod("button_SubmitLogin");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_adotbankwire'
 * {DESCRIPTION}
 */

public void css_adotbankwire() {
		godMethod("css_adotbankwire");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_adotlogin'
 * {DESCRIPTION}
 */

public void css_adotlogin() {
		godMethod("css_adotlogin");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_adotsfmnswithmnsul'
 * {DESCRIPTION}
 */

public void css_adotsfmnswithmnsul() {
		godMethod("css_adotsfmnswithmnsul");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_buttondotbuttondotbtn'
 * {DESCRIPTION}
 */

public void css_buttondotbuttondotbtn() {
		godMethod("css_buttondotbuttondotbtn");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_buttondotexclusive'
 * {DESCRIPTION}
 */

public void css_buttondotexclusive() {
		godMethod("css_buttondotexclusive");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_dotformmnscontroldotnomnsprint'
 * {DESCRIPTION}
 */

public void css_selectdotformmnscontrol() {
	Select ss = new Select(driver.findElement(By.cssSelector("select.form-control.no-print")));
	ss.selectByValue("2");
		//godMethod("css_dotformmnscontroldotnomnsprint");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_dotstandardmnscheckoutdotbuttonmnsmedium'
 * {DESCRIPTION}
 */

public void css_dotstandardmnscheckoutdotbuttonmnsmedium() {
		godMethod("css_dotstandardmnscheckoutdotbuttonmnsmedium");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_imgdotreplacemns2xdotimgmnsresponsive'
 * {DESCRIPTION}
 */

public void css_imgdotreplacemns2xdotimgmnsresponsive() {
		godMethod("css_imgdotreplacemns2xdotimgmnsresponsive");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'css_spandotajax_cart_product_txt'
 * {DESCRIPTION}
 */

public void css_spandotajaxczgcartczgproductczgtxt() {
		godMethod("css_spandotajaxczgcartczgproductczgtxt");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'e_init'
 * {DESCRIPTION}
 */

public void e_init() {
	driver.get("http://automationpractice.com/index.php");
		//godMethod("e_init");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'id_cgv'
 * {DESCRIPTION}
 */

public void id_cgv() {
		godMethod("id_cgv");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'name_processAddress'
 * {DESCRIPTION}
 */

public void name_processAddress() {
		godMethod("name_processAddress");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'name_processCarrier'
 * {DESCRIPTION}
 */

public void name_processCarrier() {
		godMethod("name_processCarrier");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'start'
 * {DESCRIPTION}
 */

public void start() {
		godMethod("start");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'text_email'
 * {DESCRIPTION}
 */

public void text_email() {
		godMethod("text_email");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'text_passwd'
 * {DESCRIPTION}
 */

public void text_passwd() {
		godMethod("text_passwd");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_CheckboxClicked'
 * {DESCRIPTION}
 */

public void v_CheckboxClicked() {
		godMethod("v_CheckboxClicked");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_ClickCheckOut'
 * {DESCRIPTION}
 */

public void v_ClickCheckOut() {
		godMethod("v_ClickCheckOut");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_GoToCart'
 * {DESCRIPTION}
 */

public void v_GoToCart() {
		godMethod("v_GoToCart");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_GoToMainPage'
 * {DESCRIPTION}
 */

public void v_GoToMainPage() {
		godMethod("v_GoToMainPage");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_HomePage'
 * {DESCRIPTION}
 */

public void v_HomePage() {
		godMethod("v_HomePage");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_PaymentDone'
 * {DESCRIPTION}
 */

public void v_PaymentDone() {
		godMethod("v_PaymentDone");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_PaymentMethodSelected'
 * {DESCRIPTION}
 */

public void v_PaymentMethodSelected() {
		godMethod("v_PaymentMethodSelected");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_ProductAddedToCart'
 * {DESCRIPTION}
 */

public void v_ProductAddedToCart() {
		godMethod("v_ProductAddedToCart");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_ProductClicked'
 * {DESCRIPTION}
 */

public void v_ProductClicked() {
		godMethod("v_ProductClicked");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_SizeSelected'
 * {DESCRIPTION}
 */

public void v_SizeSelected() {
		godMethod("v_SizeSelected");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_VerifyAddress'
 * {DESCRIPTION}
 */

public void v_VerifyAddress() {
		godMethod("v_VerifyAddress");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_VerifyCarrier'
 * {DESCRIPTION}
 */

public void v_VerifyCarrier() {
		godMethod("v_VerifyCarrier");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_WomanSection'
 * {DESCRIPTION}
 */

public void v_WomanSection() {
		godMethod("v_WomanSection");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_emailEntered'
 * {DESCRIPTION}
 */

public void v_emailEntered() {
		godMethod("v_emailEntered");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_initiated'
 * {DESCRIPTION}
 */

public void v_initiated() {
		godMethod("v_initiated");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_loggedIn'
 * {DESCRIPTION}
 */

public void v_loggedIn() {
		godMethod("v_loggedIn");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_passwordEntered'
 * {DESCRIPTION}
 */

public void v_passwordEntered() {
		godMethod("v_passwordEntered");
		
}


/**
 * This method implements the {EDGE_VERTEX} 'v_signInPage'
 * {DESCRIPTION}
 */

public void v_signInPage() {
		godMethod("v_signInPage");
		
}

public static void godMethod(String str){
	String[] parts = str.split("_");
	if(parts[0].equals("start")) {}
	else if(parts[0].equals("css")) {
		if(parts[1].contains("select")) {
		} else {
			try {
				driver.findElement(By.cssSelector(beautify(parts[1]))).click();
				listo.clear();
				Thread.sleep(2000);
			} catch(Exception e){
				System.out.println(e);
			}
		}
		} else if (parts[0].equals("id")) {
			try {
				driver.findElement(By.id(parts[1])).click();
				Thread.sleep(2000);
			} catch(Exception e){
				System.out.println(e);
			}
		} else if (parts[0].equals("name")) {
			try {
				driver.findElement(By.name(parts[1])).click();
				Thread.sleep(2000);
			} catch(Exception e){
				System.out.println(e);
			}
		}  else if(parts[0].equals("button")) {
				try {
					driver.findElement(By.id(parts[1])).click();
					Thread.sleep(2000);
				} catch(Exception e){
					System.out.println(e);
				}
		} else if(parts[0].equals("text")){
			String email = "egebilir@gmail.com";
			String passwd = "35300000";
			if(parts[1].equals("email")) {
				driver.findElement(By.id(parts[1])).sendKeys(email);
			} else if (parts[1].equals("passwd")) {
				driver.findElement(By.id(parts[1])).sendKeys(passwd);
			}
		} else if(parts[1].equals("init")){
			driver.get("http://automationpractice.com/index.php");
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

