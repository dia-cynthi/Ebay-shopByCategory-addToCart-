package ebay.BDD.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopByCategoryFunctionality_Elements {
	
	@FindBy(xpath = "//*[@id=\"gh-shop-a\"]")
	public WebElement shopByCategoryButton;
	

	@FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[2]/a")
	public WebElement clothingAndAccessoriesButton;

	@FindBy(xpath = "//span[contains(text(),'Men')]")
	public WebElement men;

	@FindBy(xpath = "//*[@id=\"s0-16-12-0-1[0]-0-0\"]/ul/li[3]/a")
	public WebElement mensClothing;

	@FindBy(id = "//*[@id=\"s0-16-12-0-1[0]-0-0\"]/ul/li[7]/a")
	public WebElement shirts;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/h1/span")
	public WebElement mensShirtPage;
}
