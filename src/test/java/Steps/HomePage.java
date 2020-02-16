package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    HomePage(WebDriver driver){
        this.driver = driver;
    }

    void open() {
        driver.get("https://www.ryanair.com/ie/en");
    }

    void clickLogin() {
        driver.findElement(By.xpath("//hp-header-menu-item[3]/button/span")).click();
    }

    void enterEmail(String email){
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
    }

    void enterPassword(String password){
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    }

    public void clickDeparture() {
        driver.findElement(By.id("input-button__departure")).click();
    }

    public void chooseDUB() {
        driver.findElement(By.xpath("//ry-tooltip[@id='ry-tooltip-1']/div[2]/hp-lazy-controls-tooltips/hp-app-controls-tooltips/hp-controls-tooltips-container/hp-controls-tooltips/hp-origin-container/hp-airports/hp-airports-list/div[2]/div/hp-airport-item/span/span")).click();
    }

    public void clickDestination() {
        driver.findElement(By.id("input-button__destination")).click();
    }

    public void chooseSXF() {
        driver.findElement(By.xpath("//ry-tooltip[@id='ry-tooltip-2']/div[2]/hp-lazy-controls-tooltips/hp-app-controls-tooltips/hp-controls-tooltips-container/hp-controls-tooltips/hp-destination-container/hp-airports/hp-airports-list/div[2]/div/hp-airport-item/span/span")).click();
    }

    public void chooseOneway() {
        driver.findElement(By.xpath("//hp-trip-type-button[2]/button/label")).click();
    }

    public void clickDepartDate() {
        driver.findElement(By.xpath("//hp-input-button/div/div[2]")).click();
    }

    public void chooseDate12032020() {
        driver.findElement(By.xpath("//ry-tooltip[@id='ry-tooltip-3']/div[2]/hp-lazy-controls-tooltips/hp-app-controls-tooltips/hp-controls-tooltips-container/hp-controls-tooltips/hp-datepicker-container/hp-datepicker/ry-datepicker-desktop/div/calendar[2]/calendar-body/div[4]/div[10]/div")).click();
    }

    public void increaseAdultsCount() {
        driver.findElement(By.xpath("//ry-tooltip[@id='ry-tooltip-4']/div[2]/hp-lazy-controls-tooltips/hp-app-controls-tooltips/hp-controls-tooltips-container/hp-controls-tooltips/hp-passengers-container/hp-passengers/hp-passengers-picker/ry-counter/div[2]/div[3]")).click();
    }

    public void increaseChildrenCount() {
        driver.findElement(By.xpath("//ry-tooltip[@id='ry-tooltip-4']/div[2]/hp-lazy-controls-tooltips/hp-app-controls-tooltips/hp-controls-tooltips-container/hp-controls-tooltips/hp-passengers-container/hp-passengers/hp-passengers-picker/ry-counter[3]/div[2]/div[3]")).click();
    }

    public void clickSearch() {
        driver.findElement(By.xpath("//div/button")).click();
    }

    public void pickFlightCard() {
        driver.findElement(By.xpath("//div/div/div/div")).click();
    }

    public void pickFareCard() {
        driver.findElement(By.xpath("//fare-card/div/div/button")).click();
    }

    public void fillAdult1Details() {
        driver.findElement(By.cssSelector("icon.dropdown__toggle-chevron > span._container.icon-14 > svg")).click();
        driver.findElement(By.xpath("//ry-dropdown[@id='title-0-error-message']/div[2]/div/div/ry-dropdown-item/button/div/div")).click();
        driver.findElement(By.id("formState.passengers.ADT-0.name")).click();
        driver.findElement(By.id("formState.passengers.ADT-0.name")).clear();
        driver.findElement(By.id("formState.passengers.ADT-0.name")).sendKeys("Michael");
        driver.findElement(By.id("formState.passengers.ADT-0.surname")).clear();
        driver.findElement(By.id("formState.passengers.ADT-0.surname")).sendKeys("Smith");
    }

    public void fillAdult2Details() {
        driver.findElement(By.cssSelector("#title-0-error-message > div.dropdown.b2 > button.dropdown__toggle.b2 > icon.dropdown__toggle-chevron > span._container.icon-14 > svg > path")).click();
        driver.findElement(By.xpath("//ry-dropdown[@id='title-0-error-message']/div[2]/div/div/ry-dropdown-item[2]/button/div/div[2]")).click();
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
