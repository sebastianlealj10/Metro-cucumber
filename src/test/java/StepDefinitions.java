import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {

    private WebDriver driver;
    private String picked_item;

    @Given("The users enters to the Metro page")
    public void the_users_enters_to_the_Metro_page() {
        System.setProperty("webdriver.chrome.driver", "\\Users\\sebas\\IdeaProjects\\Metro-cucumber\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        HomePage.openWebsite(driver);
    }
    @When("The user searches a {string}")
    public void the_user_adds_a_product_to_the_shopping_cart(String string) {
        HomePage.searchProduct(driver,string);
    }

    @When("The users adds the item to the shopping cart")
    public void the_users_adds_the_item_to_the_shopping_cart() {
        picked_item = CartPage.addItem(driver);
    }

    @Then("The product is added successfully")
    public void the_product_is_added_successfully() {
        String product = CartPage.selectProduct(driver);
        assertEquals(picked_item,product);
        driver.quit();
    }

}
