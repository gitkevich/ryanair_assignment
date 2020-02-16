package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setUp()
    {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        homePage.open();
        homePage.clickLogin();
        homePage.enterEmail("ryanairtester1234@gmail.com");
        homePage.enterPassword("Ryanair12");
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}
