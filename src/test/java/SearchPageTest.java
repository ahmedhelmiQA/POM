import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchPageTest extends TestBase {

    private HomePage homePage;
    private SearchPage searchPage;



    @Test (priority = 1)
    public void ValidSearch () throws InterruptedException {
        Thread.sleep(3000);
        homePage = new HomePage(driver);
        homePage.ClickonSearchBox();
       searchPage = homePage.ClickonSearchBox();
       searchPage.EnterProductName("Apple");
       searchPage.ClickonSearchButton();
       searchPage.ClickonProductTitel();
       searchPage.EnterQuantity("1");
       searchPage.ClickonAddToCartButton();
       searchPage.ClickonAddToWishListButton();
       searchPage.ClickonAddToCompareProductsButton();
       searchPage.ClickonEmailToFriendButton();
    }


/*
    @Test (priority = 1)
    public void productDetails() throws InterruptedException {
        Thread.sleep(3000);
        homepage = new HomePage(driver);
        homepage.ClickonSearchBox();
        searchPage=homePage.ClickonSearchBox();
        searchPage.ClickonProductTitel();
    }
*/

    @Test (priority = 2)
    public void SaleProduct() throws InterruptedException {
        Thread.sleep(4000);
        homePage = new HomePage(driver);
        homePage.ClickonSearchBox();
        searchPage = homePage.ClickonSearchBox();
        searchPage.EnterQuantity("3");
        searchPage.ClickonAddToCartButton();
    }
    @Test (priority = 3)
    public void AddToWishList() throws InterruptedException {
        Thread.sleep(4000);
        homePage = new HomePage(driver);
        homePage.ClickonSearchBox();
        searchPage= homePage.ClickonSearchBox();
        searchPage.ClickonAddToWishListButton();
    }
    @Test (priority = 4)
    public void CompareProduct () throws InterruptedException {
        Thread.sleep(4000);
        homePage = new HomePage(driver);
        homePage.ClickonSearchBox();
        searchPage = homePage.ClickonSearchBox();
        searchPage.ClickonAddToCompareProductsButton();
    }

    @Test (priority = 6)
    public void ValidSearch2() throws InterruptedException {
        Thread.sleep(3000);
        homePage = new HomePage(driver);
        homePage.ClickonSearchBox();
        searchPage = homePage.ClickonSearchBox();
        searchPage.EnterProductName("computer");
        searchPage.ClickonSearchButton();
    }

   @Test (priority = 7)
    public void ValidSearch1() throws InterruptedException {
        Thread.sleep(3000);
        homePage = new HomePage(driver);
        homePage.ClickonSearchBox();
        searchPage = homePage.ClickonSearchBox();
        searchPage.EnterProductName("htc");
        searchPage.ClickonSearchButton();
    }









}
