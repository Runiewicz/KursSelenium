package cucumber.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class CreateAccount {
    private WebDriver driver;

    @Given("^user has open page \"([^\"]*)\"$")
    public void userHasOpenPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^he user completes the registration form for the new account$")
    public void heUserCompletesTheRegistrationFormForTheNewAccount() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy

        List<WebElement> radioButtons = driver.findElements(By.className("radio-inline"));
        radioButtons.get(1).click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.clear();
        firstName.sendKeys("Ania");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.clear();
        lastName.sendKeys("Testerka");

        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("anna@mailinator.com");

        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("Kwiatek5000");

        WebElement Birthdate = driver.findElement(By.name("birthday"));
        Birthdate.clear();
        Birthdate.sendKeys("05/22/2010");

        WebElement optin = driver.findElement(By.name("optin"));
        optin.click();

        WebElement newsletter = driver.findElement(By.name("newsletter"));
        newsletter.click();
    }

    @And("^user clicks on Save$")
    public void userClicksOnSave() {
        // Prześlij formularz
        WebElement savebutton = driver.findElement(By.className("btn btn-primary form-control-submit float-xs-right"));
        savebutton.click();
    }

    @Then("^user has a new account on the store's website(.*)")
    public void userHasANewAccountOnTheStoreSWebsite(String expectedText) {
        System.out.println(expectedText);
    }
}
