package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.text.Highlighter;

public class VideoArchivePage {
    private WebDriver driver;
    private By highlights = By.cssSelector("a.small[href=\"/enx/showvideo/918107_samaritaine_kavali/\"]");

    public VideoArchivePage(WebDriver driver) {
        this.driver = driver;
    }

    public ShowVideoPage clickHighlightsButton (){
        driver.findElement(highlights).click();
        return new ShowVideoPage(driver);
    }
}
