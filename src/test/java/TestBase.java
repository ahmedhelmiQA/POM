import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
    HomePage homepage;
    protected WebDriver driver;

    @BeforeTest
    public void address()
    {
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

     /*
    @BeforeTest
    public void ProudectDetails()
    {
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
        driver.manage().window().maximize();
    }
    */

    /*
    @Test
    public void HomePage()
    {
        homepage = new HomePage(driver);
        homepage.ClickonRegisterbutton();
    }

     */

    /*
    @AfterTest
    public void quite()
    {
        driver.quit();
    }

     */

}
