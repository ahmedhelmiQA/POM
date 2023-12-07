import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    private By FirstName = By.id("FirstName");
    private WebElement FirstNameelement;
    public void EnterFirstName(String firstname)
    {
     FirstNameelement = driver.findElement(FirstName);
     Sendtext(FirstNameelement,firstname);
    }


    private By LastName = By.id("LastName");
    private WebElement LastNameelement;
    public void EnterLastName(String lastname)
    {
        LastNameelement = driver.findElement(LastName);
        Sendtext(LastNameelement,lastname);
    }


    private By EmailFalid = By.id("Email");
    private WebElement Emailelement;
    public void EnterEmail(String email)
    {
     Emailelement = driver.findElement(EmailFalid);
     Sendtext(Emailelement,email);
    }


    private By PasswordFelid = By.id("Password");
    private WebElement Passwordelement;
    public void EnterPassword(String password)
    {
        Passwordelement = driver.findElement(PasswordFelid);
        Sendtext(Passwordelement,password);
    }


    private By Repassword = By.id("ConfirmPassword");
    private WebElement Repasswordelement;
    public void EnterRepassword(String repassword)
    {
     Repasswordelement = driver.findElement(Repassword);
     Sendtext(Repasswordelement,repassword);
    }


    private By GenderMale = By.id("gender-male");
    private WebElement GenderMaleelement;
    public void chooseGender()
    {
        GenderMaleelement = driver.findElement(GenderMale);
        Clicking(GenderMaleelement);
    }


    private By RegisterButton = By.id("register-button");
    private WebElement RegisterButtonelement;
    public void ClickonRegisterButton()
    {
     RegisterButtonelement = driver.findElement(RegisterButton);

     Clicking(RegisterButtonelement);
    }



}
