import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
    private HomePage homepage;
    private LoginPage loginPage;
    @Test
    public void ValidloginTC()
    {
        homepage=new HomePage(driver);
        homepage.ClickonLoginButton();
        loginPage= homepage.ClickonLoginButton();
        loginPage.EnterEmail("Test@test.com");
        loginPage.EnterPassword("123456789");
        loginPage.Clickonloginbutton();

    }


}
