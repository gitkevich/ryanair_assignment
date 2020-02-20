package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class PaymentPage {

    WebDriver driver;

    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterPhoneNumber() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("contact-details")));
        driver.findElement(By.xpath("//button/div")).click();
        driver.findElement(By.xpath("//ry-dropdown-item[156]/button/div/div")).click();
        driver.findElement(By.name("undefined")).click();
        driver.findElement(By.name("undefined")).clear();
        driver.findElement(By.name("undefined")).sendKeys("793422507");
    }

    public void chooseNoInsurance() {
        driver.findElement(By.xpath("//div[3]/div/ry-checkbox/label/div/div")).click();
    }

    public void enterCardNumber() {
        driver.findElement(By.xpath("(//input[@name='undefined'])[2]")).click();
        driver.findElement(By.xpath("(//input[@name='undefined'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@name='undefined'])[2]")).sendKeys("5555555555555557");
    }

    public void enterCardExpiryDate() {
        driver.findElement(By.xpath("//span[2]/div/ry-dropdown/div[2]/button/icon")).click();
        driver.findElement(By.xpath("//span[2]/div/ry-dropdown/div[2]/div/div/ry-dropdown-item[10]/button/div/div")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[233]")).click();
        driver.findElement(By.xpath("//span[2]/div[2]/ry-dropdown/div[2]/div/div/ry-dropdown-item/button/div/div")).click();
    }

    public void enterCardCVV() {
        driver.findElement(By.xpath("(//input[@name='undefined'])[3]")).click();
        driver.findElement(By.xpath("(//input[@name='undefined'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@name='undefined'])[3]")).sendKeys("265");
    }

    public void enterCardholderName() {
        driver.findElement(By.xpath("(//input[@name='undefined'])[4]")).click();
        driver.findElement(By.xpath("(//input[@name='undefined'])[4]")).clear();
        driver.findElement(By.xpath("(//input[@name='undefined'])[4]")).sendKeys("Michael Smith");
    }

    public void fillAddressFields() {
        driver.findElement(By.xpath("(//input[@name='undefined'])[5]")).click();
        driver.findElement(By.xpath("(//input[@name='undefined'])[5]")).clear();
        driver.findElement(By.xpath("(//input[@name='undefined'])[5]")).sendKeys("ul.Potulicka 20F/5");
        driver.findElement(By.xpath("(//input[@name='undefined'])[7]")).click();
        driver.findElement(By.xpath("(//input[@name='undefined'])[7]")).clear();
        driver.findElement(By.xpath("(//input[@name='undefined'])[7]")).sendKeys("Szczecin");
        driver.findElement(By.cssSelector("ry-dropdown.address-form__input.ng-untouched.ng-pristine.ng-invalid > div.dropdown.b2 > button.dropdown__toggle.b2 > icon.dropdown__toggle-chevron > span._container.icon-14 > svg")).click();
        driver.findElement(By.xpath("//form/ry-dropdown/div[2]/div/div/ry-dropdown-item[156]/button/div/div")).click();
        driver.findElement(By.xpath("(//input[@name='undefined'])[8]")).click();
        driver.findElement(By.xpath("(//input[@name='undefined'])[8]")).clear();
        driver.findElement(By.xpath("(//input[@name='undefined'])[8]")).sendKeys("70-234");
    }

    public void chooseCurrency() {
        driver.findElement(By.xpath("(//button[@type='button'])[463]")).click();
        driver.findElement(By.xpath("//form/div/div/div/div[2]/ry-dropdown/div[2]/div/div/ry-dropdown-item/button/div/div")).click();
    }

    public void confirmTermsAndConditions() {
        driver.findElement(By.xpath("//terms-and-conditions/div/div/ry-checkbox/label/div/div")).click();
    }

    public void clickPay() {
        driver.findElement(By.xpath("//pay-button/div/button")).click();
    }

    public void waitUntilPaymentErrorIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".payment-methods-error")));
    }

    public void verifyErrorText() {
        String message = driver.findElement(By.cssSelector(".payment-methods-error")).getText();
        assertTrue(message.contains("Transaction could not be processed. Your payment was not authorised therefore we could not complete your booking. Please ensure that the information was correct and try again or use a new payment card."));

    }
}
