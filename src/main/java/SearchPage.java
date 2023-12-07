import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends PageBase{

    public SearchPage(WebDriver driver) {
        super(driver);
    }


    private By ProductName = By.xpath("//form/input[@type=\"text\"]");
    private WebElement ProductNameelement;
    public void EnterProductName(String Product)
    {
        ProductNameelement = driver.findElement(ProductName);
        Sendtext(ProductNameelement,Product);
    }


    private By SearchButton = By.xpath("//form/button[@type=\"submit\"]");
    private WebElement SearchButtonelement;
    public void ClickonSearchButton()
    {
        SearchButtonelement = driver.findElement(SearchButton);
        Clicking(SearchButtonelement);
    }


    private By ProductTitel = By.linkText("Apple MacBook Pro 13-inch");
    private WebElement ProutectTitelelement;
    public void ClickonProductTitel()
    {
        ProutectTitelelement = driver.findElement(ProductTitel);
        Clicking(ProutectTitelelement);
    }


    private By Quantity = By.className("qty-input");
    private WebElement Quantityelement;
    public void EnterQuantity(String quantity)
    {
        Quantityelement = driver.findElement(Quantity);
        Sendtext(Quantityelement , quantity);
    }


    private By AddToCartButton = By.xpath("//div/button[@class=\"button-1 add-to-cart-button\"]");
    private WebElement AddToCartButtonelement;
    public void ClickonAddToCartButton()
    {
        AddToCartButtonelement = driver.findElement(AddToCartButton);
        Clicking(AddToCartButtonelement);
    }


    private By AddToWishListButton = By.id("add-to-wishlist-button-4");
    private WebElement AddToWishListButtoneelement;
    public void ClickonAddToWishListButton()
    {
        AddToWishListButtoneelement = driver.findElement(AddToWishListButton);
        Clicking(AddToWishListButtoneelement);
    }

    private By AddToCompareProductsButton = By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button");
    private WebElement AddToCompareProductsButtonelment;
    public void ClickonAddToCompareProductsButton()
    {
        AddToCompareProductsButtonelment = driver.findElement(AddToCompareProductsButton);
        Clicking(AddToCompareProductsButtonelment);
    }


    private By EmailToFriendButton = By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button");
    private WebElement EmailToFriendButtonelement;

    public void ClickonEmailToFriendButton()
    {
        EmailToFriendButtonelement = driver.findElement(EmailToFriendButton);
    }


}
