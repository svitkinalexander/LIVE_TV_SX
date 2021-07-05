package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserPage {
    private WebDriver driver;
    private By loginHeader = By.cssSelector("span[class='sporttitle'] b");

    public NewUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessage() {
        return driver.findElement(loginHeader).getText();
    }
}
