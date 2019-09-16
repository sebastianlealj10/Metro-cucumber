import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class HomePage{
    private WebDriver driver;

    @FindBy(how = How.ID,using = "onesignal-popover-cancel-button")
    WebElement javascriptAlert;

    @FindBy(how = How.ID,using = "search-autocomplete-input")
    WebElement searchBar;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        }

    public void openWebsite() {

        /* Discar the Javascript Alert */
        WebElement JavaScriptAlert = implicitclickWait(javascriptAlert);
        clickOnElement(JavaScriptAlert);
    }
    public void searchProduct(String string) {

        /* Search the desired item*/
        WebElement search_bar = implicitclickWait(searchBar);
        sendText(search_bar,string);
        sendEnter(search_bar);
    }
    private void clickOnElement(WebElement element){

        element.click();
    }
    private void sendText(WebElement element, String text){

        element.sendKeys(text);
    }
    private void sendEnter(WebElement element){

        element.sendKeys(Keys.ENTER);
    }
    private WebElement implicitclickWait(WebElement element){

        return (new WebDriverWait(driver,10))
                .until(ExpectedConditions.elementToBeClickable
                        (element));
    }

}
