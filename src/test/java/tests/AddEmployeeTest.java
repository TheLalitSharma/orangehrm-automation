package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AddEmployeePage;
import utilities.BaseTest;

public class AddEmployeeTest extends BaseTest {

    @Test
    public void testAddEmployee() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        addEmployeePage.addEmployee("John", "Doe");

        // You can add an assertion here to verify employee added
    }
}

