package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationUser {
    private WebDriver driver;
    @Given("^The user is on the main page https://tester\\.codersguru\\.pl$")
    public void theUserIsOnTheMainPageHttpsTesterCodersguruPl() {

        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Codersguru
        driver.get("https://tester.codersguru.pl");
    }

    @When("^Go to user registration$")
    public void goToUserRegistration() {
        WebElement Zalozkontobutton = driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]"));
        Zalozkontobutton.click();
    }

    @And("^Enter in the form field (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void enterInTheFormFieldFirstnameSurnamePasswordPasswordCityPostcodeStreetHouseApartmentNumber
            (String emailText,
             String firstNameText,
             String lastNameText,
             String passwordText,
             String secondPasswordText,
             String cityText,
             String postcodeText,
             String streetText,
             String numberText
            ) {

        WebElement email = driver.findElement(By.name("fos_user_registration_form[email]"));
        email.clear();
        email.sendKeys(emailText);

        WebElement firstName = driver.findElement(By.name("fos_user_registration_form[name]"));
        firstName.clear();
        firstName.sendKeys(firstNameText);

        WebElement lastName = driver.findElement(By.name("fos_user_registration_form[lastname]"));
        lastName.clear();
        lastName.sendKeys(lastNameText);

        WebElement password = driver.findElement(By.name("fos_user_registration_form[plainPassword][first]"));
        password.clear();
        password.sendKeys(passwordText);

        WebElement secondpassword = driver.findElement(By.name("fos_user_registration_form[plainPassword][second]"));
        secondpassword.clear();
        secondpassword.sendKeys(secondPasswordText);

        WebElement city = driver.findElement(By.name("form[city]"));
        city.clear();
        city.sendKeys(cityText);

        WebElement postcode = driver.findElement(By.name("form[postal_code]"));
        postcode.clear();
        postcode.sendKeys(postcodeText);

        WebElement street = driver.findElement(By.name("form[street]"));
        street.clear();
        street.sendKeys(streetText);


        WebElement number = driver.findElement(By.name("form[number]"));
        number.clear();
        number.sendKeys(numberText);

        WebElement regulations = driver.findElement(By.xpath("//*[@id=\"registration-main-form\"]/div[12]/input"));
        regulations.click();

    }

    @And("^sending him$")
    public void sendingHim() {

        driver.findElement(By.id("register-submit-btn")).click();

        Assert.assertNotNull(driver.findElement(By.id("user-name")));
    }

    @Then("^private user has been successfully registered$")
    public void privateUserHasBeenSuccessfullyRegistered() {
            driver.quit();
    }
}
