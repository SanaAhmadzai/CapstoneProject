package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;

public class RetailPageStepDef extends Base {

	RetailPage retailpage = new RetailPage();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		retailpage.clickOnMyAccount();
		logger.info("user clicked on MyAccount");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailpage.Login();
		logger.info("user clicked on login");
	}

	@When("User enter username {string}  and password {string}")
	public void user_enter_user_name_and_password(String username, String pass) {
		retailpage.enterEmail(username);
		logger.info("user enter the userName " + username);
		retailpage.enterPassword(pass);
		logger.info("user enter the password  " + pass);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailpage.clickOnLoginButton();
		logger.info("user clicked on login");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(retailpage.MyAccountDashboard());
		logger.info("user should be in MyAccount Page");
	}


	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailpage.RegisterAffiliateAccount();
		logger.info("User can click on ‘Register for an Affiliate Account’ link");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> Affiliateinformation = dataTable.asMaps(String.class, String.class);
		retailpage.CompanyName(Affiliateinformation.get(0).get("Company"));
		retailpage.Website(Affiliateinformation.get(0).get("WebSite"));
		retailpage.TaxID(Affiliateinformation.get(0).get("TaxID"));
		retailpage.ChequePaymentMethod(Affiliateinformation.get(0).get("PaymentMethod"));
		retailpage.ChequePayeeName(Affiliateinformation.get(0).get("chequePayeeName"));
		logger.info("user entered Affiliate Form information");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpage.ABOUTUS();
		logger.info("User is able to check on AboutUs check box");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailpage.ContinueButton();
		logger.info("User clicked  on Continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailpage.SuccessMessage();
		logger.info("User can see a success message");
	}

	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailpage.EditAffiliateAccount();
		logger.info("User can click on ‘Edit your affiliate informationlink");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpage.BankTransferRadioButton();
		logger.info("User can click on Bank Transfer radio button");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> Affiliateinformation = dataTable.asMaps(String.class, String.class);
		retailpage.BankName(Affiliateinformation.get(0).get("BankName"));
		retailpage.BranchNumber(Affiliateinformation.get(0).get("BranchNumber"));
		retailpage.SwiftCode(Affiliateinformation.get(0).get("SwiftCode"));
		retailpage.AccountName(Affiliateinformation.get(0).get("AccountName"));
		retailpage.AccountNumber(Affiliateinformation.get(0).get("AccountNumber"));
		logger.info("user entered Bank information with required information");
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retailpage.EditAccountInformation();
		logger.info("User can click on 'Edit your account information' link");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
		retailpage.FirstName(information.get(0).get("firstname"));
		retailpage.LastName(information.get(0).get("lastName"));
		retailpage.Email(information.get(0).get("email"));
		retailpage.Telephone(information.get(0).get("telephone"));
		logger.info("user modified the information");
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("User click on continue button")
	public void user_click_on_continue_button1() {
	    retailpage.ContinueButton();
	    logger.info("User Clicked on continue button");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		retailpage.SuccessMessageUpdateinfo();
		logger.info("User can see a message ‘Success: Your account has been successfully updated.’");
	}

}