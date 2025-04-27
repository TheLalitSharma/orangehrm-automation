package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    Wait<WebDriver> wait;

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By gnbUser = By.xpath("//div[@class='oxd-topbar-header-userarea']");

    private final String username = "Admin";
    private final String password = "admin123";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    @Step("Logging in with username: {0} and password: {1}")
    public void login(String username, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isUserLoggedIn(){
        return driver.findElement(gnbUser).isDisplayed();
    }

}
