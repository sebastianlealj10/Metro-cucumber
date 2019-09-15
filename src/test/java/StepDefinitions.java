import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {

    /** Webdriver class for all methods */
    private WebDriver driver;

    private String picked_item;

    @Given("The users enters to the Metro page")
    public void the_users_enters_to_the_Metro_page() {
        /* Path to the current project folder */
        String Path = System.getProperty("user.dir");
        /* Path to chromedriver */
        System.setProperty("webdriver.chrome.driver",Path +
                "/src/main/resources/chromedriver.exe");
        /* New Webdriver Object */
        driver = new ChromeDriver();
        /* Send the Webdriver object to the PageObject HomePage */
        HomePage.openWebsite(driver);
    }

    @When("The user searches a {string}")
    public void the_user_adds_a_product_to_the_shopping_cart(String string) {
        /* Send the Webdriver object to the PageObject HomePage */
        HomePage.searchProduct(driver,string);
    }

    @When("The users adds the item to the shopping cart")
    public void the_users_adds_the_item_to_the_shopping_cart() {
        /* Send the Webdriver object to the PageObject CartPage and return the item name selected */
        picked_item = CartPage.addItem(driver);
    }

    @Then("The product is added successfully")
    public void the_product_is_added_successfully() {
        /* Send the Webdriver object to the PageObject CartPage and return the item name in the cart */
        String product = CartPage.selectProduct(driver);
        /* Assert the selected item with the item in the cart */
        assertEquals(picked_item,product);
        /* Quit the Webdriver Object */
        driver.quit();
    }

}
