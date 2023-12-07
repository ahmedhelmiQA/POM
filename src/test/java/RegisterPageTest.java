import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test
    public void Validregister()
    {
        homePage = new HomePage(driver);
        homePage.ClickonRegisterbutton();
        registerPage = homePage.ClickonRegisterbutton();
        registerPage.chooseGender();
        registerPage.EnterFirstName("ahmed");
        registerPage.EnterLastName("helmi");
        registerPage.EnterEmail("test@test.com");
        registerPage.EnterPassword("123456789");
        registerPage.EnterRepassword("123456789");
        registerPage.ClickonRegisterButton();
    }
}
