package page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopsProductsPage extends Base{
	
	public DesktopsProductsPage() {
		PageFactory.initElements(driver, this);
	}


	   @FindBy(xpath="//button[contains(@onclick,'cart.add')]//ancestor::div//a[text()='HP LP3065']")
		private WebElement addHP3065tothecart;
	
	   @FindBy(xpath="//input[@name='quantity']")
	   private WebElement selectquantity;
	   
	   
	   @FindBy(xpath="//button[text()='Add to Cart']")
	   private WebElement AddtoCart;
	   
	   @FindBy(xpath="//div[text()='Success: You have added ']")
	   private WebElement SucessMessageHP;
	   
	   @FindBy(xpath="//button[contains(@onclick,'cart.add')]//ancestor::div//a[text()='Canon EOS 5D Camera']")
	   private WebElement addCanonEOS5DCamera;
	   
	   @FindBy(xpath="//select[@id='input-option226']")
	   private WebElement selectcolor;
	   
	   
	   @FindBy(xpath="//div[text()='Success: You have added ']")
	   private WebElement SucessMessageCanon;
	   
	   @FindBy(xpath="//img[@alt='Canon EOS 5D Camera']")
	   private WebElement Canon5DItem;
	   
	   @FindBy(xpath="//a[text()='Reviews (0)']")
	   private WebElement clickonReviewLink;
	   
	   @FindBy(id = "input-name")
	   private WebElement YourNameField;
	   
	   @FindBy(xpath = "//textarea[@id='input-review']")
	   private WebElement YourReviewField;
	   
	   @FindBy(xpath = "//input[@value='5']")
	   private WebElement RatingField;
	   
	   @FindBy(xpath ="//button[text()='Continue']")
	   private WebElement ClickonContinueButton;
	   
	   @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	   private WebElement CanonReviewSuccessMessage;
	   
	   
	   
		public void clickOnaddHP3065tothecart() {
			addHP3065tothecart.click();
		}
		
		public void selectquantity () {
			selectquantity.click();
		}
	
		public void AddtoCart () {
			AddtoCart.click();
		}
		
		public String getSuccessMessageforHP() {
			String actualMessage = SucessMessageHP.getText();
			return actualMessage;
		}
		
		public void clickOnaddCanonEOS5DCamera() {
			addCanonEOS5DCamera.click();
		}
		  
		public void SelectColor(String selectColor){
			Select select = new Select(selectcolor);
			select.selectByVisibleText(selectColor);
			}
		
		public String getSuccessMessageforCanon() {
			String actualMessage = SucessMessageCanon.getText();
			return actualMessage;
		}
		
		public void Canon5DItem () {
			Canon5DItem.click();
		}
		
		public void ReviewLink () {
			clickonReviewLink.click();
		}
		
		public void YourNameField () {
			YourNameField.sendKeys("Sana");
		}
		
		public void YourReviewField () {
			YourReviewField.sendKeys("This is one of the best quality camera.");
		}
		
		public void RatingField () {
			RatingField.click();
		}
	
		public void ClickonContinueButton () {
			ClickonContinueButton.click();
		}
		
		public String CanonReviewSuccessMessage() {
			String actualMessage = CanonReviewSuccessMessage.getText();
			return actualMessage;
		}
}
