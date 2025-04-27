package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.BaseTest;
import io.qameta.allure.Description;


public class LogoutTest extends BaseTest {

    @Test(description = "Verify that user can logout")
    @Description("Test Description: Logout test for OrangeHRM demo app")
    public void testLogout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(loginPage.getUsername(), loginPage.getPassword());

        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();

    }
}
