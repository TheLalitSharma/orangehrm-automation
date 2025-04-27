package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {
    WebDriver driver;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By addEmployeeButton = By.xpath("//button[text()= ' Add ' ]");
    By firstNameField = By.name("firstName");
    By lastNameField = By.name("lastName");
    By saveButton = By.xpath("//button[@type='submit']");
    By dashboardNewUser = By.xpath("//div[@class='orangehrm-edit-employee']");

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

    public boolean isEmployeeSaved() {
        return driver.findElement(dashboardNewUser).isDisplayed();
    }
}
