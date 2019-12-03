package by.belarusbank;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSetting {


    @Test
    public void FirstTest() {

        driver.get("https://belarusbank.by/"); //Зайти на сайт Беларусьбанк
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Курсы валют, кредиты, вклады, платежные карточки, страхование")); //Сравить title с сайтом и выйти, если все ок
        System.out.println(driver.getTitle());
        driver.quit();
    }
    @Test
    public void FirstTest2() {


        driver.get("https://belarusbank.by/");


        WebElement element = driver.findElement(By.xpath("//a[@class='mobile-main-nav-btn mobile-main-nav-btn--ib']")); //Зайти в мобильный интернет-банкинг
        element.click();
        driver.close();
        driver.switchTo().window("https://ibank.asb.by/wps/portal/ibank/Home/login/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id=\"login_in\"")));

        driver.quit();


    }
    @Test
    public void FirstTest3() {
        driver.get("https://belarusbank.by/");

        WebElement element = driver.findElement(By.xpath("//button[@class='mobile-main-nav-btn mobile-main-nav-btn--menu js-open-mobile-menu']")); //Меню бургер откроется
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.xpath("/html[1]/body[1]/nav[2]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//li[@class='fixed-nav-menu__item js-tabs__tab open']//a[1]//span[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
        driver.findElement(By.id("summa")).sendKeys("5000"); //Ввод суммы
        driver.findElement(By.xpath("//div[@class='form-group js-accordion']//div[2]//div[1]//div[1]//div[1]")).click(); //Открыть чекбокс Выбора валюты
        driver.findElement(By.xpath("//div[@class='page-grid__item page-grid__item--main col col-lg-9']//li[2]")).click(); //Выбор валюты бел. рубли
        driver.findElement(By.id("vklad_name_block")).click(); //Открыть чекбокс Название вклада

        driver.findElement(By.cssSelector("body.no-touch.no-ie.no-firefox.no-ios.page-loaded:nth-child(2) main.page-main:nth-child(8) div.page-grid-block div.container div.page-grid.grid div.page-grid__item.page-grid__item--main.col.col-lg-9:nth-child(2) section.page-section.flc div.page-grid-block:nth-child(4) div.container div.page-grid.grid div.page-grid__item.page-grid__item--main.col.col-lg-12 div.group-block form.form:nth-child(2) div.form-group.js-accordion:nth-child(1) div.form-group__body.js-accordion__body div.form-grid.grid div.form-grid__item.col.col-lg-6.col-xs-12:nth-child(3) div.form-row div.form-row__input div.js-select-visual.select.select--block.open ul.select-list > li:nth-child(2)")).click();


    }

    @Test
    public void comptests() {
        //Тест: Вклад при корректных данных(положительный)
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.get("https://belarusbank.by/");

        driver.findElement(By.xpath("//button[@class='cookie-button']")).click(); // Принял куки
        driver.findElement(By.xpath("//div[@class='fixed-nav__navigation']//div[2]")).click(); // Открыл боковое меню Калькуляторы
        //WebDriverWait wait = new WebDriverWait(driver, 5);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("div.fixed-nav__navigation")));

        driver.findElement(By.xpath("//li[@class='fixed-nav-menu__item js-tabs__tab open']//a[1]//span[2]")).click(); //  открыть калькулятор вкладов













    }




}
