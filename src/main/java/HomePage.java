import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class HomePage {

    static void openWebsite(WebDriver driver) {

        /* Navigate to the Metro Website and discart the Javascript alert */
        driver.get("https://www.metro.pe/");
        driver.manage().window().maximize();
        WebElement JavaScript_alert = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.elementToBeClickable
                        (By.id("onesignal-popover-cancel-button")));
        JavaScript_alert.click();
    }
    static void searchProduct(WebDriver driver, String string) {

        /* Search the desired item*/
        WebElement search_bar = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.elementToBeClickable
                        (By.id("search-autocomplete-input")));
        search_bar.sendKeys(string);
        search_bar.sendKeys(Keys.ENTER);
    }


}
