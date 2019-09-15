import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


class CartPage {

    static String selectProduct(WebDriver driver) {
        /* Search the required WebElements and click them */
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
        /* Return the item name in the cart */
        return (item_added.getText());
    }
    static String addItem(WebDriver driver) {

        /* Search the firt item in the search */
        List <WebElement> element_name =  driver.findElements
                (By.cssSelector(".product-item__name"));
        List <WebElement> element_add =  driver.findElements
                (By.cssSelector(".product-item__add-to-cart"));
        element_add.get(0).click();
        /* Return the item name in the cart */
        return (element_name.get(0).getText());
    }

}
