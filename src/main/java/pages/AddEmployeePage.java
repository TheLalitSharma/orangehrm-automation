package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {
    WebDriver driver;

    By pimMenu = By.id("menu_pim_viewPimModule");
    By addEmployeeButton = By.id("menu_pim_addEmployee");
    By firstNameField = By.id("firstName");
    By lastNameField = By.id("lastName");
    By saveButton = By.id("btnSave");

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee(String firstName, String lastName) {
        driver.findElement(pimMenu).click();
        driver.findElement(addEmployeeButton).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(saveButton).click();
    }
}
