package pkeywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Case2keywords extends BasePage {

	public Case2keywords(AndroidDriver<MobileElement> driver) {
		super(driver);		
	}
	
	public By categoryPath = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Water\"]");	
	public By parents = By.xpath("//android.widget.LinearLayout");
	public By childrens= By.xpath("//android.widget.ImageView");
	public By parentss = By.xpath("//android.widget.LinearLayout[1]");
	public By childrenss = By.xpath("//android.widget.ImageView");
	public By menuButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
	public By wishMenuButton = By.xpath("//android.widget.TextView[@text='My Wishlist']");
	
	protected List<MobileElement> elementsOne = driver.findElementsByXPath("//android.support.v7.app.ActionBar.Tab");
	protected List<WebElement> childrenElems = findChildrenOfParent(parents, childrens);
	protected List<WebElement> childrenElem = findChildrenOfParent(parentss, childrenss);
	
	
	
}
