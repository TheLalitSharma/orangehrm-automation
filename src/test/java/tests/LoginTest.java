package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BaseTest;
import io.qameta.allure.Description;

public class LoginTest extends BaseTest {

    @Test(description = "Verify that user can login with valid credentials")
    @Description("Test Description: Login test for OrangeHRM demo app")
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(loginPage.getUsername(), loginPage.getPassword());
        Assert.assertTrue(loginPage.isUserLoggedIn(), "User is not logged in");

    }
}
