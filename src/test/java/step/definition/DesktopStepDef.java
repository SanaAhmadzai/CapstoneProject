package step.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import page.objects.DesktopsProductsPage;
import utilities.Util;

public class DesktopStepDef extends Base {
	
	DesktopsPage desktopsPage = new DesktopsPage();
	DesktopsProductsPage productsPage = new DesktopsProductsPage();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(desktopsPage.isLogoDisplayed());
		logger.info("user is on Home Page");
	}

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");
	}

	@And("User click on Show all desktops")
	public void user_click_On_Show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
		}
		int size = items.size();
		Assert.assertEquals(size, 12);
		Util.takeScreenShot();
	}

	@When("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		productsPage.clickOnaddHP3065tothecart();
		logger.info("User clicked ADD TO CART option on ‘HP LP3065’ item");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		productsPage.selectquantity();
		logger.info("User selected quantity {int}");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		productsPage.AddtoCart();
		logger.info("User clicked add to Cart button");
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		productsPage.getSuccessMessageforHP();
		logger.info("User is able to see a message ‘Success: you have added HP LP {int} to your Shopping cart!");
		Util.takeScreenShot();
	}

	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		productsPage.clickOnaddCanonEOS5DCamera();
		logger.info("User clicked ADD TO CART option on ‘Canon EOS 5D’ item");
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		productsPage.SelectColor("Red");
		logger.info("User selected color from dropdown ‘Red");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		productsPage.getSuccessMessageforCanon();
		logger.info("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!");
		Util.takeScreenShot();
	}
	

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		productsPage.Canon5DItem();
		logger.info("User clicked on Canon EOS 5D item");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		productsPage.ReviewLink();
		logger.info("User clicked on write a review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		productsPage.YourNameField();
		productsPage.YourReviewField();
		productsPage.RatingField();
		logger.info("user filled the review information with provided information");
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		productsPage.ClickonContinueButton();
		logger.info("User clicked on Continue Button");
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		productsPage.CanonReviewSuccessMessage();
		logger.info("User is able to see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”");
		Util.takeScreenShot();
	}

}