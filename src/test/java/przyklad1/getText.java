package przyklad1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pl.wikipedia.org/");
    }

    @Test
    public void getText() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("main-page-column1"));
        System.out.println(element.getText());
    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        driver.quit();
    }
}

