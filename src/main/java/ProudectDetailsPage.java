import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProudectDetailsPage extends PageBase{
    public ProudectDetailsPage(WebDriver driver) {
        super(driver);
    }
    private By AddToCartButton = By.xpath("//div/button[@class=\"button-1 add-to-cart-button\"]");
    private WebElement AddToCartButtonelement;
    private By Quantity = By.xpath("//div/input[@class=\"qty-input valid\"]");
    private WebElement Quantityelement;
    private By AddToWishListButton = By.xpath("add-to-wishlist");
    private WebElement AddToWishListButtoneelement;
    private By AddToCompareProductsButton = By.xpath("compare-products");
    private WebElement AddToCompareProductsButtonelment;
    private By EmailToFriendButton = By.xpath("//div[@class=\"email-a-friend\"]");
    private WebElement EmailToFriendButtonelement;
}
