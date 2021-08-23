package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pkeywords.Case2keywords;

public class Case2 extends Case2keywords {
	
	public Case2(AndroidDriver<MobileElement> driver) {
		super(driver);
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

	public void getsNumberCategories() {
				
			if(elementsOne.size()>0) {
				System.out.println("Total elements : " + elementsOne.size());
			try {
				Thread.sleep(2000);
				System.out.println(elementsOne.get(elementsOne.size()));               
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
			
		}else {
			System.out.println("ElementList Null");
		}		
	}

	public void openCategory() {
		
		addWishList(childrenElem);											
	}

	public void addThreeProducts() throws InterruptedException {
		
		addWishList(childrenElems);		
	}
	
	public void openMenu() {
		
		clickWithFindElement(menuButton);
		
	}

	public void goWishList() {
		clickWithFindElement(wishMenuButton);
		
	}
	
	public void controlAndDeleteProduct() {
		List<WebElement> childrenElements = findChildrenOfParent(parentss, childrenss);
		removeAllProductsFromCart(childrenElements);
			try {
            String priceText = "Your Cart is empty !";
            assertEquals(text, priceText);
			} catch (AssertionError ae) {
         Assert.fail("\n" + "Favori listeniz bos mesaji gelmeli ya da anasayfaya geri dönmeli" + "\n" + ae);
			}
	}
	
	
	
	
	
}
