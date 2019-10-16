package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Random;

public class Adding_users {

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
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void Dodatkowe () throws InterruptedException {

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.clear();
        // Wpisz informacje do wyszukania
        String[] nametable = {"Anna", "Marcin", "Róża"};
        Random random1 = new Random();
        int name_random = random1.nextInt(nametable.length);
        int name_wynik = name_random % nametable.length;
        firstName.sendKeys(nametable[name_wynik]);

        WebElement lastName = driver.findElement(By.id("last-name"));

        lastName.clear();
        // Wpisz informacje do wyszukania
        String[] lastnametable = {"Kowalski", "Runiewicz", "Tracz"};
        Random random2 = new Random();
        int last_random = random2.nextInt(lastnametable.length);
        int last_wynik = last_random % lastnametable.length;
        lastName.sendKeys(lastnametable[last_wynik]);



        List<WebElement> radioButtons = driver.findElements(By.name("gender"));
        radioButtons.get(0).click();

        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.clear();
        dateOfBirth.sendKeys("05/22/2010");

        WebElement address = driver.findElement(By.id("address"));
        address.clear();
        address.sendKeys("Prosta 51");

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        // Wpisz informacje do wyszukania
        String[] emailtable = {"a@mailinator.com", "b@mailinator.com", "c@mailinator.com"};
        Random random3 = new Random();
        int email_random = random3.nextInt(emailtable.length);
        int email_wynik = email_random % emailtable.length;
        email.sendKeys(emailtable[email_wynik]);

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Pass123");

        WebElement company = driver.findElement(By.id("company"));
        company.clear();
        // Wpisz informacje do wyszukania
        String[] companytable = {"Unitee", "CodersLab", "Wo-wo"};
        Random random4 = new Random();
        int company_random = random4.nextInt(companytable.length);
        int company_wynik = company_random% companytable.length;
        company.sendKeys(companytable[company_wynik]);

        WebElement comment = driver.findElement(By.id("comment"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy automat testowy");

        WebElement jobExpectationSelect = driver.findElement(By.id("expectation"));
        Select select = new Select(jobExpectationSelect);
        select.selectByVisibleText("Nice manager/leader");

        WebElement role = driver.findElement(By.id("role"));
        Select roleSelect = new Select(role);
        roleSelect.selectByIndex(new Random().nextInt(4));
        Thread.sleep(5000);
        driver.findElement(By.id("submit")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}

