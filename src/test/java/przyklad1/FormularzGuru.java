package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class FormularzGuru {

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
        driver.get("https://tester.codersguru.pl");
    }

    @Test
    public void GuruTest() throws InterruptedException {
        WebElement Zalozkontobutton = driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]"));
        Zalozkontobutton.click();

        WebElement email = driver.findElement(By.name("fos_user_registration_form[email]"));
        email.clear();
        email.sendKeys("mo@gmail.com");

        WebElement firstName = driver.findElement(By.name("fos_user_registration_form[name]"));
        firstName.clear();
        firstName.sendKeys("Ania");

        WebElement lastName = driver.findElement(By.name("fos_user_registration_form[lastname]"));
        lastName.clear();
        lastName.sendKeys("Kowalska");

        WebElement password = driver.findElement(By.name("fos_user_registration_form[plainPassword][first]"));
        password.clear();
        password.sendKeys("test123");

        WebElement secondpassword = driver.findElement(By.name("fos_user_registration_form[plainPassword][second]"));
        secondpassword.clear();
        secondpassword.sendKeys("test123");

        WebElement city = driver.findElement(By.name("form[city]"));
        city.clear();
        city.sendKeys("Wrocław");

        WebElement postcode = driver.findElement(By.name("form[postal_code]"));
        postcode.clear();
        postcode.sendKeys("50-457");

        WebElement street = driver.findElement(By.name("form[street]"));
        street.clear();
        street.sendKeys("Racławicka");


        WebElement number = driver.findElement(By.name("form[number]"));
        number.clear();
        number.sendKeys("10/7");

        Thread.sleep(2000);

        WebElement regulations = driver.findElement(By.xpath("//*[@id=\"registration-main-form\"]/div[12]/input"));
        regulations.click();

        Thread.sleep(5000);

        driver.findElement(By.id("register-submit-btn")).click();
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
