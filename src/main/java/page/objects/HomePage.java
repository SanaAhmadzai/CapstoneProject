package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//form[@id='form-currency']")
	private WebElement CurrencyIcon;

	@FindBy(xpath="//button[@name='EUR']")
	private WebElement EuroButton;
	
	@FindBy(xpath="//form[@id='form-currency']")
	private WebElement CurrencyEuro;
	
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement ShoppingCartIcon;
	
	@FindBy(xpath="//ul[@class='dropdown-menu pull-right']")
	private WebElement EmptyShoppingCardMessageDisplayed;
	
	

	public void ClickonCurrencyIcon() {
		CurrencyIcon.click();
	}
	public void ClickonEuroButton() {
		EuroButton.click();
	}
	public void CurrencyChangedtoEuro() {
		CurrencyEuro.isDisplayed();
	}
	
	
	public void ClickonShoppingCartIcon() {
		ShoppingCartIcon.click();
	}
	public void EmptyShoppingCartMessage() {
		EmptyShoppingCardMessageDisplayed.isDisplayed();
	}

}
