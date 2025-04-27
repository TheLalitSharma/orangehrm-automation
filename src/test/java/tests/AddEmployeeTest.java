package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AddEmployeePage;
import utilities.BaseTest;
import io.qameta.allure.Description;


public class AddEmployeeTest extends BaseTest {

    @Test(description = "Verify that user can add employee")
    @Description("Test Description: Add employee test for OrangeHRM demo app")
    public void testAddEmployee() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(loginPage.getUsername(), loginPage.getPassword());

        Assert.assertTrue(loginPage.isUserLoggedIn(), "User is not logged in");

        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        addEmployeePage.addEmployee("John", "Doe");
        Assert.assertTrue(addEmployeePage.isEmployeeSaved(), "Employee is not saved");

    }
}

