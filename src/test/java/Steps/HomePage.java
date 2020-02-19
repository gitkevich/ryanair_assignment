package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;

    HomePage(WebDriver driver){ this.driver = driver; }

    void open() {
        driver.get("https://www.ryanair.com/ie/en");
    }

    void closeCookiesPopup(){
        driver.findElement(By.id("glyphs.close")).click();
    }

    void clickLogin() {
        driver.findElement(By.xpath("//hp-header-menu-item[4]/button/span")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("ry-form")));
    }

    void enterEmail(String email){
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    void enterPassword(String password){
        WebElement passwordInput = driver.findElement(By.xpath("//div[2]/ry-input/label/span[2]/input"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    void submitLogin(){
        WebElement ryForm = driver.findElement(By.tagName("ry-form"));
        WebElement form = ryForm.findElement(By.tagName("form"));
        form.submit();
    }

    public void clickDeparture() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName("ry-form")));
        driver.findElement(By.id("input-button__departure")).click();
    }

    public void chooseDUB() {

        driver.findElement(By.id("input-button__departure")).clear();
        driver.findElement(By.id("input-button__departure")).sendKeys("Dublin");

    }

    public void clickDestination() {
        driver.findElement(By.id("input-button__destination")).click();
    }

    public void chooseSXF() {
        driver.findElement(By.id("input-button__destination")).clear();
        driver.findElement(By.id("input-button__destination")).sendKeys("Berlin Schönefeld");    }

    public void chooseOneway() {
        driver.findElement(By.xpath("//hp-trip-type-button[2]/button/label")).click();
    }

    public void clickDepartDate() {
        driver.findElement(By.xpath("//div[@data-id='2020-03-12']")).click();
    }

    public void increaseAdultsCount() {
      driver.findElement(By.xpath("//ry-counter/div[2]/div[3]")).click();
    }

    public void increaseChildrenCount() {
        driver.findElement(By.xpath("//ry-counter[3]/div[2]/div[3]")).click();
    }

    public void clickSearch() {
        driver.findElement(By.tagName("ry-spinner")).click();
    }

    public void pickFlightCard() {
        driver.findElement(By.xpath("//flight-info")).click();
    }

    public void pickFareCard() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//fare-card")));
        driver.findElement(By.xpath("//fare-card")).click();
    }

    public void fillAdult1Details() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("passenger")));

        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//ry-dropdown-item/button/div/div")).click();
        driver.findElement(By.id("formState.passengers.ADT-0.name")).click();
        driver.findElement(By.id("formState.passengers.ADT-0.name")).clear();
        driver.findElement(By.id("formState.passengers.ADT-0.name")).sendKeys("Michael");
        driver.findElement(By.id("formState.passengers.ADT-0.surname")).clear();
        driver.findElement(By.id("formState.passengers.ADT-0.surname")).sendKeys("Smith");
    }

    public void fillAdult2Details() {
        driver.findElement(By.xpath("//ry-dropdown[@id='title-0-error-message']/div[2]/button/icon")).click();
        driver.findElement(By.xpath("//ry-dropdown[@id='title-0-error-message']/div[2]/div/div/ry-dropdown-item[2]/button/div/div")).click();
        driver.findElement(By.id("formState.passengers.ADT-1.name")).click();
        driver.findElement(By.id("formState.passengers.ADT-1.name")).clear();
        driver.findElement(By.id("formState.passengers.ADT-1.name")).sendKeys("Nancy");
        driver.findElement(By.id("formState.passengers.ADT-1.surname")).clear();
        driver.findElement(By.id("formState.passengers.ADT-1.surname")).sendKeys("Smith");
    }

    public void fillChildDetails() {
        driver.findElement(By.id("formState.passengers.CHD-0.name")).click();
        driver.findElement(By.id("formState.passengers.CHD-0.name")).clear();
        driver.findElement(By.id("formState.passengers.CHD-0.name")).sendKeys("Robert");
        driver.findElement(By.id("formState.passengers.CHD-0.surname")).clear();
        driver.findElement(By.id("formState.passengers.CHD-0.surname")).sendKeys("Smith");
    }

    public void clickContinueBooking() {
        driver.findElement(By.xpath("//continue-flow/div/div/button")).click();
    }
}
