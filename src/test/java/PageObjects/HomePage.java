package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    String url = "https://www.ryanair.com/ie/en";

    By closeCookiesPopupButtonPath = By.id("glyphs.close");
    By logInButtonInMenuPath = By.xpath("//hp-header-menu-item[4]/button/span");
    By logInPopupPath = By.tagName("ry-form");
    By emailFieldPath = By.xpath("//input[@name='email']");
    By passwordFieldPath = By.xpath("//div[2]/ry-input/label/span[2]/input");
    By departureFieldPath = By.id("input-button__departure");
    By destinationFieldPath = By.id("input-button__destination");
    By oneWayCheckboxPath = By.xpath("//hp-trip-type-button[2]/button/label");
    By datePath = By.xpath("//div[@data-id='2020-03-12']");
    By adultCountIncreaseButtonPath = By.xpath("//ry-counter/div[2]/div[3]");
    By childCountIncreaseButtonPath = By.xpath("//ry-counter[3]/div[2]/div[3]");
    By searchButtonPath = By.tagName("ry-spinner");
    By flightCardPath = By.xpath("//flight-info");
    By fareCardPath = By.xpath("//fare-card");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        driver.get(url);
        this.wait = wait;
    }

    public void closeCookiesPopup(){
        WebElement closeCookiesPopupButton = driver.findElement(closeCookiesPopupButtonPath);
        closeCookiesPopupButton.click();
    }

    public void clickLogin() {
        WebElement logInButtonInMenu = driver.findElement(logInButtonInMenuPath);
        logInButtonInMenu.click();
    }

    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInPopupPath));
        WebElement emailInput = driver.findElement(emailFieldPath);
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password){
        WebElement passwordInput = driver.findElement(passwordFieldPath);
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void submitLogin(){
        WebElement loginPopup = driver.findElement(logInPopupPath);
        WebElement form = loginPopup.findElement(By.tagName("form"));
        form.submit();
    }

    public void chooseDeparture(String airport) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(logInPopupPath));
        WebElement departureField = driver.findElement(departureFieldPath);
        departureField.click();
        departureField.clear();
        departureField.sendKeys(airport);
    }

    public void chooseDestination(String airport) {
        WebElement destinationField = driver.findElement(destinationFieldPath);
        destinationField.click();
        destinationField.clear();
        destinationField.sendKeys(airport);    }

    public void chooseOneway() {
        WebElement oneWayCheckbox = driver.findElement(oneWayCheckboxPath);
        oneWayCheckbox.click();
    }

    public void chooseDepartDate() {
        WebElement departDate = driver.findElement(datePath);
        departDate.click();
    }

    public void increaseAdultsCount() {
        WebElement adultButtonIncreaseButton = driver.findElement(adultCountIncreaseButtonPath);
        adultButtonIncreaseButton.click();
    }

    public void increaseChildrenCount() {
        WebElement childCountIncreaseButton = driver.findElement(childCountIncreaseButtonPath);
        childCountIncreaseButton.click();
    }

    public void clickSearch() {
        WebElement searchButton = driver.findElement(searchButtonPath);
        searchButton.click();
    }

    public void pickFlightCard() {
        WebElement flightCard = driver.findElement(flightCardPath);
        flightCard.click();
    }

    public void pickFareCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fareCardPath));
        WebElement fareCard = driver.findElement(fareCardPath);
        fareCard.click();
    }

    public void fillAdult1Details() {
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
