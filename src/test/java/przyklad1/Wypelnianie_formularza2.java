package przyklad1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Wypelnianie_formularza2 {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");
    }

    @Test
    public void mystoreTest() throws InterruptedException {

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

        WebElement savebutton = driver.findElement(By.className("btn btn-primary form-control-submit float-xs-right"));
        savebutton.click();
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}

