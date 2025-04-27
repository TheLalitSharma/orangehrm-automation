package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.BaseTest;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();

        // Optionally, validate if login page is displayed after logout
    }
}
