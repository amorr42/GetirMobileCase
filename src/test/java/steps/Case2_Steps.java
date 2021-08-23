package steps;

import static setups.DriverPool.getDriverInstance;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.Case2;

public class Case2_Steps {
	
	Case2 case2 = new Case2((AndroidDriver<MobileElement>) getDriverInstance());
/*	
	@Given("^User should pass onboarding screens$")
	public void user_should_pass_onboarding_screens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
*/
		
	@And("^User checks if home page exists or notl$")
	public void user_checks_if_home_page_exists_or_notl() throws Throwable {
		
		case2.checkHomePage();
		Thread.sleep(2000);
	}
	
	@Then("^User gets the number of categories and write this number to console$")
	public void user_gets_the_number_of_categories_and_write_this_number_to_console() throws Throwable {
		case2.getsNumberCategories();
		Thread.sleep(2000);
	}

	@And("^User open a random category$")
	public void user_open_a_random_category() throws Throwable {
		case2.openCategory();
		Thread.sleep(2000);
	}

	@And("^User adds three random products to wishlist via mini heart icon$")
	public void user_adds_three_random_products_to_wishlist_via_mini_heart_icon() throws Throwable {
		case2.addThreeProducts();
		Thread.sleep(2000);
	}

	@When("^User opens the menu in the left$")
	public void user_opens_the_menu_in_the_left() throws Throwable {
		case2.openMenu();
		Thread.sleep(2000);
	}

	@And("^User go to My Wishlist$")
	public void user_go_to_My_Wishlist() throws Throwable {
		case2.goWishList();
		Thread.sleep(2000);
	}

	@Then("^User controls the page and products and user deletes all of them from Wishlist$")
	public void user_controls_the_page_and_products_and_user_deletes_all_of_them_from_Wishlist() throws Throwable {
		case2.controlAndDeleteProduct();
		Thread.sleep(2000);
	}

	
}
