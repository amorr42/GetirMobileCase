package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.Case1;

import static setups.DriverPool.getDriverInstance;

import base.BasePage;

public class Case1_Steps {
			
	
	Case1 case1 = new Case1((AndroidDriver<MobileElement>) getDriverInstance());
	
/*
	@Given("^User should pass onboarding screens$")
	public void user_should_pass_onboarding_screens() throws Throwable {
	    case1.skipIntro();
	    Thread.sleep(3000);
	}
*/
	@And("^User checks if home page exists or not$")
	public void user_checks_if_home_page_exists_or_not() throws Throwable {
		
		case1.checkHomePage();
		Thread.sleep(1000);
	}

	@And("^User changes category to Baby Care$")
	public void user_changes_category_to_Baby_Care() throws Throwable {
		case1.selectBabyCare();
		Thread.sleep(2000);
	}

	@And("^User open a random product detail$")
	public void user_open_a_random_product_detail() throws Throwable {
		case1.clickProductDetail();
		Thread.sleep(2000);
	}

	@Then("^User adds this product to basket and return last page$")
	public void user_adds_this_product_to_basket_and_return_last_page() throws Throwable {
		case1.addProductBasket();
		Thread.sleep(2000);
	}

	@And("^User changes category to Snacks$")
	public void user_changes_category_to_Snacks() throws Throwable {
		case1.selectSnacks();
		Thread.sleep(2000);
	}

	@And("^User open a random product detaill$")
	public void user_open_a_random_product_detaill() throws Throwable {
		case1.clickProductDetail();
		Thread.sleep(2000);
	}

	@Then("^User adds this product to basket and return last pagel$")
	public void user_adds_this_product_to_basket_and_return_last_pagel() throws Throwable {
		case1.addProductBasket();
		Thread.sleep(2000);
	}

	@And("^User goes to basket and control added products and prices$")
	public void user_goes_to_basket_and_control_added_products_and_prices() throws Throwable {
		case1.goBasketAndControl();
		Thread.sleep(2000);
	}

	@And("^User should deletes all products from basket and makes controls$")
	public void user_should_deletes_all_products_from_basket_and_makes_controls() throws Throwable {
		case1.deleteAllProductsBasket();
		Thread.sleep(5000);
	}
	
}
