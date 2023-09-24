package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser() {
        // fungsi untuk clear chace chrome driver
        WebDriverManager.chromedriver().clearDriverCache().setup();

        // fungsi untuk setup chrome agar bisa terbuka
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        // inisiasi library selenium
        driver = new ChromeDriver(co);

        String appUrl = "https://jqueryui.com/";
        driver.get(appUrl); // fungsi membuka link html
        driver.manage().window().maximize(); // fungsi untuk maximize browser
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}