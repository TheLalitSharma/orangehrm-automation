package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    By welcomeMenu = By.id("welcome");
    By logoutLink = By.linkText("Logout");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        driver.findElement(welcomeMenu).click();
        // Small sleep/wait might be needed here for menu to open
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(logoutLink).click();
    }
}
