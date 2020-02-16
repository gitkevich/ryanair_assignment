package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    WebDriver driver;

    PaymentPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterPhoneNumber() {
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
        driver.findElement(By.xpath("(//input[@name='undefined'])[5]")).sendKeys("ul.Potlicka 20F/5");
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
        driver.findElement(By.xpath("//div[2]/ry-checkbox/label/div/div")).click();
    }

    public void clickPay() {
        driver.findElement(By.xpath("//pay-button/div/button")).click();
    }
}
