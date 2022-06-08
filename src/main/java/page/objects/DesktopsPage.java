package page.objects;

import core.Base;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DesktopsPage extends Base {
	
	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement logo; 
	
	@FindBy(xpath ="//a[text()='Desktops']")
	private WebElement DesktopsTab;

	@FindBy(xpath ="//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(xpath="//div[@class='image']//a//img")
	private List<WebElement> Desktopitems;
   
   
    
	public boolean isLogoDisplayed() {
	if (logo.isDisplayed())
	return true;
	else
	return false;
	}

	public void clickOnDesktopTab() {
	Actions action = new Actions(driver);
	action.moveToElement(DesktopsTab).build().perform();
	}
	
	public void clickOnShowAllDesktops() {
	showAllDesktops.click();
	}
	
	public List<WebElement> elements() {
	List<WebElement> DesktopsItems = Desktopitems;
	return DesktopsItems;
	}
	

	
	
	
}




