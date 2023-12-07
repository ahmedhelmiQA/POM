import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By Email = By.id("Email");
    private WebElement Emailelement;
    public void EnterEmail(String Emailfield)
    {
        Emailelement = driver.findElement(Email);
        Sendtext(Emailelement,Emailfield);
    }


    private By Password = By.id("Password");
    private WebElement Passwordelement;
    public void EnterPassword(String Passwordfield)
    {
        Passwordelement = driver.findElement(Password);
        Sendtext(Passwordelement,Passwordfield);
    }



    private By LoginButton = By.xpath("//div/button[@type=\"submit\"]");
    private WebElement LoginButtonelement;
    public void Clickonloginbutton()
    {
        LoginButtonelement = driver.findElement(LoginButton);
        Clicking(LoginButtonelement);
    }

}
