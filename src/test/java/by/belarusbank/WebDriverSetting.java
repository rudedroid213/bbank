package by.belarusbank;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "F:\\Java\\IdeaProjects\\delivery001\\chromedriver.exe");
        driver = new ChromeDriver();


    }
    @After
    public void close() {
      //  driver.quit();


    }

}
