package com.aldiyan.automation;

import com.aldiyan.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openLoginPage() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void loginPositiveTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();

        String successMessage = loginPage.getMessage();

        assert successMessage.contains("You logged into a secure area!");
    }

    @Test
    public void loginNegativeTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickLogin();

        String errorMessage = loginPage.getMessage();

        assert errorMessage.contains("Your password is invalid!");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}