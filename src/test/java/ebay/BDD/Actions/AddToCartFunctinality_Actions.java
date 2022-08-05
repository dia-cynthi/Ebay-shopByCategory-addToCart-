package ebay.BDD.Actions;

import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ebay.BDD.Elements.AddToCartFunctionality_Elements;
import ebay.BDD.Elements.ShopByCategoryFunctionality_Elements;
import ebay.BDD.utilities.SetupDriver;



public class AddToCartFunctinality_Actions {

	AddToCartFunctionality_Elements elements;

	public AddToCartFunctinality_Actions() {
		this.elements = new AddToCartFunctionality_Elements();
		PageFactory.initElements(SetupDriver.driver,this.elements);

	}

	public void getebay_home_page() {
		SetupDriver.driver.get("https://ebay.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	public void clickAddToCart() {
		this.elements.addToCart.click();
		
	}

	public void clickgoToCartButton() {
		this.elements.goToCartButton.click();
	}

	
	public String getcartPage() {
		String cartPage = this.elements.cartPage.getText();
		
		return cartPage;
		
		
	}

	
}
