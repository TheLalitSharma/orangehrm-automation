package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    By gnbSettings = By.xpath("//li[contains(@class,'oxd-userdropdown')]");
    By logoutLink = By.linkText("Logout");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        driver.findElement(gnbSettings).click();
        driver.findElement(logoutLink).click();
    }
}
