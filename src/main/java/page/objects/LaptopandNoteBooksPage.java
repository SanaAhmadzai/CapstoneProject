package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopandNoteBooksPage extends Base {

	public LaptopandNoteBooksPage() {
		PageFactory.initElements(driver, this);
	}
	
	   @FindBy(xpath="//a[text()='Laptops & Notebooks']")
		private WebElement ClickonLaptopandNoteBooktab ;
	
	   @FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	   private WebElement ShowAllLaptopsandNotbooks;
	
	   @FindBy(xpath="//button[contains(@onclick,'cart.add')]//ancestor::div//img[@title='MacBook']")
	   private WebElement AddMacBookitem;
	
	   @FindBy(xpath="//div[contains(@class,'alert-success alert-dismissible')]")
	   private WebElement SuccessMessageforMacBook;
	   
	   @FindBy(id= "cart-total")
	   private WebElement CartTotal;
	   
	   @FindBy(xpath="//i[@class='fa fa-times']")
	   private WebElement ClickonRedXButton;
	   
	   @FindBy(xpath="//span[@id='cart-total']")
	   private WebElement CartTotalAfterCancelingItem;
	   
	   
	   @FindBy(xpath="(//button[@data-original-title='Compare this Product'])[2]")
	   private WebElement ProductComparisonIconMacBook;
	   
	   @FindBy(xpath="(//button[@data-original-title='Compare this Product'])[3]")
	   private WebElement CompareMacBookAir;
	   
	   @FindBy(xpath="//div[contains(@class,'alert-success')]")
	   private WebElement SuccessMessageAfterProductComparison;
	   
	   @FindBy(xpath="//a[text()='product comparison']")
	   private WebElement ProductComparisonLink;
	   
	   @FindBy(xpath="/html/body/div[2]/div/div")
	   private WebElement ProductComparisonChart;
	   
	   
	   
	   @FindBy(xpath="(//button[@data-original-title='Add to Wish List'])[5]")
	   private WebElement ClickHeartIconforSonyVAIO;
	   
	   @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	   private WebElement FailureMessage;
	   
	   
	   
	   @FindBy(xpath="//img[@title='MacBook Pro']")
	   private WebElement ClickonMacBookPro;
	   
	   @FindBy(xpath="//h2[text()='$2,000.00']")
	   private WebElement PriceTag;
	   
	   
	   
	   public void ClickonLaptopandNoteBooktab() {
		   ClickonLaptopandNoteBooktab.click();
		}
	
	   public void ShowAllLaptopsandNotbooks() {
		   ShowAllLaptopsandNotbooks.click();
		}
	
	   public void ClickonAddMacBookitem() {
		   AddMacBookitem.click();
	   }
	
		public String getSuccessMessageforMacBook() {
			String actualMessage = SuccessMessageforMacBook.getText();
			return actualMessage;
		}
		
		public void CartTotalAfterMacBookwasAdded () {
			CartTotal.getText();
		}
		
		public void ClickCartoption() {
			CartTotal.click();
		}
		
		public void ClickonCancelButton() {
			ClickonRedXButton.click();
		}
		
		public void CartTotalAfterCancelingItem () {
			CartTotalAfterCancelingItem.getText();
		}
	
		
		
		public void ProductComparisonIconMacBook() {
			ProductComparisonIconMacBook.click();
		}
		
		public void ProductComparisonIconBookAir() {
			CompareMacBookAir.click();
		}
		
		public String SuccessMessageAfterProductComparison() {
			String actualMessage = SuccessMessageAfterProductComparison.getText();
			return actualMessage;
		}
		
		public void ClickonProductComparisonLink() {
			ProductComparisonLink.click();
		}
	
		public void ProductComparisonChartDisplayed() {
			ProductComparisonChart.isDisplayed();
		}
		
		
		public void ClickHeartIconforSonyVAIO() {
			ClickHeartIconforSonyVAIO.click();
		}
		
		public String FailureMessageforSonyVAIO() {
			String actualMessage = FailureMessage.getText();
			return actualMessage;
		}
		
		
		
		public void ClickonMacBookPro() {
			ClickonMacBookPro.click();
		}
		
		public boolean PriceTag() {
			if (PriceTag.isDisplayed())
			return true;
			else
			return false;
			}
		
		
		
}
