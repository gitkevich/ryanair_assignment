package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookingDetailsFlow {

    WebDriver driver;



    public BookingDetailsFlow(WebDriver driver){
        this.driver = driver;
    }

    public void closeFamilySeatingPopup() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[2]/button")));
        driver.findElement(By.xpath("//div[2]/div[2]/button")).click();
    }

    public void addSeats() {
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//seat-map")));
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//ry-overlay")));

        List<WebElement> freeStandardSeats = driver.findElements(By.xpath(".//button[@class='ng-star-inserted seatmap__seat seatmap__seat--standard']"));
        WebElement seat1 = freeStandardSeats.get(0);
        seat1.click();
        WebElement seat2 = freeStandardSeats.get(1);
        seat2.click();
        WebElement seat3 = freeStandardSeats.get(2);
        seat3.click();
        driver.findElement(By.cssSelector("button.seats-action__button.ry-button.ry-button--gradient-yellow")).click();
    }


    public void addCabinBags() {
        driver.findElement(By.xpath("//ry-default-takeover/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.xpath("//bags-cabin-bag-row[2]/bags-cabin-bag-products-container/bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.xpath("//bags-cabin-bag-row[3]/bags-cabin-bag-products-container/bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.xpath("//button[@class='ry-button--gradient-yellow']")).click();
    }


    public void skipAnythingElseScreen() {
        driver.findElement(By.xpath("//div[2]/button")).click();
    }

    public void viewBasket() {
        driver.findElement(By.linkText("View basket")).click();
    }

    public void clickCheckout() {
        driver.findElement(By.xpath("//ry-tooltip[@id='ry-tooltip-1']/div[2]/ry-price-breakdown-container/ry-price-breakdown-footer/div/div/ry-basket-continue-flow-container/ry-basket-continue-flow/button")).click();
    }
}
