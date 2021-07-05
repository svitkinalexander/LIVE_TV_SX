package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By searchHeader = By.cssSelector("span[class='sporttitle'] b");

    public SearchPage() {
    }

    public String getMessage() {
        return driver.findElement(searchHeader).getText();
    }
}
