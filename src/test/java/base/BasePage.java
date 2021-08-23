package base;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class BasePage {
	
	protected AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;
    
	public BasePage(AndroidDriver<MobileElement> driver) {
        this.driver =  driver;
        wait = new WebDriverWait(driver, 20, 500);
    }
	
	public By skpBtn = By.id("com.allandroidprojects.getirsample:id/btn_skip");
	
	public By categoryBabyCare = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Baby Care\"]");
	public By categorySnacks = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Snacks\"]");
	public By clickProductDetail = By.xpath("//android.widget.FrameLayout");
	public By addProductBasket = By.xpath("//android.widget.TextView[@text='ADD TO CART']");
	public By clickBasket = By.xpath("//android.widget.TextView[@content-desc='Cart']");
	public By parent = By.className("android.widget.LinearLayout");
	public By children = By.xpath("//android.widget.TextView[@text='Remove']");
	public By text = By.id("com.allandroidprojects.getirsample:id/text_action_bottom1");
	public By emptyBasketText = By.id("com.allandroidprojects.getirsample:id/tvInfo");
	
	
	
    protected void waitVisibility(By element) {    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    
    protected void clickWithFindElement(By element) {
        waitVisibility(element);
        driver.findElement(element).click(); 
    }

    protected String readText(By element) {
        waitVisibility(element);
        return driver.findElement(element).getText();
    }
    
    protected void assertEquals(By element, String expectedText) {
        waitVisibility(element);
        Assert.assertEquals(readText(element), expectedText);
    }

    public List<MobileElement> FindElements(By element) {
    	waitVisibility(element);
        List<MobileElement> elements = driver.findElements(element);
        return elements;
    }
    
    protected List<WebElement> findChildrenOfParent(By parentBy, By childrenBy) {
        waitVisibility(parentBy);
        WebElement parentElement = driver.findElement(parentBy);
        return parentElement.findElements(childrenBy);
    }
    
    protected void addWishList(List<WebElement> elementList) {
    	
    Random rand = new Random();
	int randomIndex = rand.nextInt(elementList.size());
		 
        if (elementList.size() > 0) {
            elementList.get(randomIndex).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
            elementList.get(randomIndex).click();
        } else {
            System.out.println("Bu kategori altinda urun yok");
        }
    }
	
    protected void removeAllProductsFromCart(List<WebElement> elementList) {

        for (int i = 0; i < elementList.size(); i++) {
            elementList.get(i).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
            elementList.get(i).click();
        }
	
    }
}

