package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShowVideoPage {
    private WebDriver driver;
    private By highlightsVideo = By.className("ytp-cued-thumbnail-overlay-image");

    public ShowVideoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVideo() {
        return driver.findElement(highlightsVideo).getTagName();
    }
}
