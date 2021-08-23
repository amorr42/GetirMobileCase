package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class Case1 extends BasePage {
	
	public Case1(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public void skipIntroPage() {
		
		clickWithFindElement(skpBtn);
	}
	
	public void checkHomePage(){
				
		MobileElement list = driver.findElement(By.xpath("//android.widget.LinearLayout"));
    	MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"GetirSample\")"));
		String el = listGroup.getText();
    	
		try {
			String title = "GetirSample";
			Assert.assertEquals(el, title);
        } catch (AssertionError ae) {
            Assert.fail("\n" + "Anasayfa Acilmadi" + "\n" + ae);
        }
		
	}
					
	public void selectBabyCare() {
		
	    int startX = 952;
	    int endX = 123;
	    int startY = 370;
	    int endY = 375;
      
	    TouchAction ts = new TouchAction(driver);
	    ts.press(PointOption.point(startX,startY));
	    ts.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)));
	    ts.moveTo(PointOption.point(endX,startY));
	    ts.release();
	    ts.perform();
	    
	    clickWithFindElement(categoryBabyCare);
        
	}
		  
	public void clickProductDetail() {
		List<MobileElement> elementList = driver.findElements(clickProductDetail);
		if (elementList.size() > 0) {
            elementList.get(0).click();
        } else {
            System.out.println("Urun Bulunamadi");
        }		
				
	}

	public void addProductBasket() throws InterruptedException {
		
		clickWithFindElement(addProductBasket);
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}


	public void selectSnacks() {
		
		int startX = 300;
	    int endX = 920;
	    int startY = 367;
	    int endY = 362;
      
	    TouchAction ts = new TouchAction(driver);
	    ts.press(PointOption.point(startX,startY));
	    ts.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)));
	    ts.moveTo(PointOption.point(endX,startY));
	    ts.release();
	    ts.perform();
		
	    clickWithFindElement(categorySnacks);
	   	    	    
	}
	
	public void goBasketAndControl() throws InterruptedException {
		
		clickWithFindElement(clickBasket);
		Thread.sleep(1000);
		 try {
	            String priceText = "$3,96";
	            assertEquals(text, priceText);
	     } catch (AssertionError ae) {
	         Assert.fail("\n" + "Sepete ürün eklenmemis" + "\n" + ae);
	     }
		 
	}

	public void deleteAllProductsBasket() throws InterruptedException {
						
		List<WebElement> childrenElements = findChildrenOfParent(parent, children);
		removeAllProductsFromCart(childrenElements);
			try {
            String priceText = "Your Cart is empty !";
            assertEquals(text, priceText);
			} catch (AssertionError ae) {
         Assert.fail("\n" + "Sepetiniz bos mesaji gelmeli ya da anasayfaya geri dönmeli" + "\n" + ae);
			}
			
	}
	
}	
	
	
	
	
	
	
	
	
	



