package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class SearchResults {
    private WebDriver driver;
    private Set<WebElement> results;
    private By searchBlockResults = By.xpath("//div[@id = 'contents']");


    public SearchResults(WebDriver driver) {
        this.driver = driver;
    }

    public Set<WebElement> getResults() {
        driver.findElement(searchBlockResults).getText();
        return results;
    }

}
