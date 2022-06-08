package step.definition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;

public class HomePageStepDef extends Base {

	HomePage homepage = new HomePage();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homepage.ClickonCurrencyIcon();
		logger.info("User is able to click on Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepage.ClickonEuroButton();
		logger.info("User is able to chose Euro from DropDown");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepage.CurrencyChangedtoEuro();
		logger.info("currency value is change to Euro");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepage.ClickonShoppingCartIcon();
		logger.info("User is able to click on shopping cart");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homepage.EmptyShoppingCartMessage();
		logger.info("“Your shopping cart is empty!” message is display");
	}

}
