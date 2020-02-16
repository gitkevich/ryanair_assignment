package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingDetailsFlow {

    WebDriver driver;

    BookingDetailsFlow(WebDriver driver){
        this.driver = driver;
    }

    void closeFamilySeatingPopup() {
        driver.findElement(By.xpath("//ry-portal[@id='ry-modal-portal']/div/seats-modal/ry-message-dialog/ry-dialog/div/div[2]/div[2]/button")).click();
    }

    public void addSeats() {
        driver.findElement(By.xpath("//div[4]/div/button[4]")).click();
        driver.findElement(By.xpath("//div[4]/div/button[5]")).click();
        driver.findElement(By.xpath("//div[4]/div/button[6]")).click();
    }

    public void addCabinBags() {
        driver.findElement(By.xpath("//bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.xpath("//bags-cabin-bag-row[2]/bags-cabin-bag-products-container/bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
        driver.findElement(By.xpath("//bags-cabin-bag-row[3]/bags-cabin-bag-products-container/bags-cabin-bag-product[2]/div/bags-product-selector/div/div/ry-checkbox/label/div/div")).click();
    }

    public void finishChoosingBags() {
        driver.findElement(By.xpath("//bags-continue-flow/button")).click();
    }

    public void finishChoosingSeats() {
        driver.findElement(By.xpath("//span/button")).click();
    }

    public void clickContinue() {
        driver.findElement(By.xpath("//div[2]/button")).click();
    }

    public void viewBasket() {
        driver.findElement(By.linkText("View basket")).click();
    }

    public void clickCheckout() {
        driver.findElement(By.xpath("//ry-tooltip[@id='ry-tooltip-1']/div[2]/ry-price-breakdown-container/ry-price-breakdown-footer/div/div/ry-basket-continue-flow-container/ry-basket-continue-flow/button")).click();
    }
}
