package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookingDetailsFlow {

    WebDriver driver;

    BookingDetailsFlow(WebDriver driver){
        this.driver = driver;
    }

    void closeFamilySeatingPopup() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ry-dialog")));
        driver.findElement(By.xpath("//div[2]/div[2]/button")).click();
    }

    public void addSeats() {
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//seat-map")));
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//ry-overlay")));

                driver.findElement(By.xpath("//div[22]/div/button")).click();
                driver.findElement(By.xpath("//div[22]/div/button[2]")).click();
                driver.findElement(By.xpath("//div[22]/div/button[3]")).click();

        driver.findElement(By.cssSelector("button.seats-action__button.ry-button.ry-button--gradient-yellow")).click();

    }


    public void addCabinBags() {

        driver.findElement(By.xpath("//ry-default-takeover/div/div[2]/button[2]")).click();

        driver.findElement(By.xpath("//bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.xpath("//bags-cabin-bag-row[2]/bags-cabin-bag-products-container/bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.xpath("//bags-cabin-bag-row[3]/bags-cabin-bag-products-container/bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.cssSelector("button.ry-button--gradient-yellow")).click();
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
