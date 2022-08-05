package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartFunctionality_Elements {
	
	@FindBy(xpath = "//*[@id=\"/html/body\"]")
	public WebElement itemsPage;
	
	@FindBy(xpath = "//*[@id=\"atcRedesignId_btn\"]]")
	public WebElement addToCart;

	@FindBy(xpath = "//*[@id=\"atcRedesignId_overlay-atc-container\"]/div/div[1]/div[1]/h2")
	public WebElement itemAddedToCart;
	
	@FindBy(xpath = "//*[@id=\"atcRedesignId_overlay-atc-container\"]/div/div[1]/div[2]/div[2]/a[2]/span/span")
	public WebElement goToCartButton;

	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[4]/div/div[1]/button")
	public WebElement cartPage;
	

}
