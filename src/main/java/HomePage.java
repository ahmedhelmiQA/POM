import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    By RegisterButton = By.className("ico-register");
    WebElement RegisterButtonelement;
    public RegisterPage ClickonRegisterbutton()
    {
        RegisterButtonelement = driver.findElement(RegisterButton);
        Clicking(RegisterButtonelement);
        return new RegisterPage(driver);
    }

    By LoginButton = By.className("ico-login");
    WebElement LoginButtonelement;
    public LoginPage ClickonLoginButton()
    {
        LoginButtonelement = driver.findElement(LoginButton);
        Clicking(LoginButtonelement);
        return new LoginPage(driver);
    }


    By SearchButtone = By.xpath("//form[@id=\"small-search-box-form\"]");
    WebElement SearchBoxelement;
    public SearchPage ClickonSearchBox()
    {
        SearchBoxelement = driver.findElement(SearchButtone);
        Clicking(SearchBoxelement);
        return new SearchPage(driver);
    }

}
