import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


class CartPage {

    static String selectProduct(WebDriver driver) {

        WebElement cart_button =(new WebDriverWait(driver,10))
                .until(ExpectedConditions.elementToBeClickable
                        (By.cssSelector(".minicart__action--toggle-open")));
        cart_button.click();
        WebElement cart_open =(new WebDriverWait(driver,10))
                .until(ExpectedConditions.elementToBeClickable
                        (By.cssSelector(".minicart__action--buy")));
        cart_open.click();
        WebElement item_added =(new WebDriverWait(driver,10))
                .until(ExpectedConditions.elementToBeClickable
                        (By.cssSelector(".product-item__name")));
        return (item_added.getText());
    }
    static String addItem(WebDriver driver) {

        List <WebElement> element_name =  driver.findElements
                (By.cssSelector(".product-item__name"));
        List <WebElement> element_add =  driver.findElements
                (By.cssSelector(".product-item__add-to-cart"));
        element_add.get(0).click();
        return (element_name.get(0).getText());
    }

}
