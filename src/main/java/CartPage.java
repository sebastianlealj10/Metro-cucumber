import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


class CartPage {

    private WebDriver driver;

    @FindBy(how = How.CSS,using = ".minicart__action--toggle-open")
    WebElement cartButton;

    @FindBy(how = How.CSS,using = ".minicart__action--buy")
    WebElement opencartButton;

    @FindBy(how = How.CSS,using = ".product-item__name")
    WebElement item;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String selectProduct() {

        /* Search the required WebElements and click them */
        WebElement iconButton = implicitclickWait(cartButton);
        iconButton.click();
        WebElement openCart = implicitclickWait(opencartButton);
        openCart.click();
        WebElement itemName = implicitclickWait(item);
        /* Return the item name */
        return (itemName.getText());
    }

    public String addItem() {

        /* Search the first item in the search */
        List <WebElement> elementName =  driver.findElements(By.cssSelector(".product-item__name"));
        List <WebElement> elementAdd =  driver.findElements(By.cssSelector(".product-item__add-to-cart"));
        clickOnElement(elementAdd.get(0));
        /* Return the item name in the cart */
        return (elementName.get(0).getText());
    }

    private void clickOnElement(WebElement element){

        element.click();
    }

    private WebElement implicitclickWait(WebElement element){

        return (new WebDriverWait(driver,10))
                .until(ExpectedConditions.elementToBeClickable
                        (element));
    }

}
