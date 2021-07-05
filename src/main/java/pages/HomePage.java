package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By searchField = By.id("premese");
    private By searchButton = By.id("reserc");
    private By searchLocator = By.id("search");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clickLink (String linkText) {return driver.findElement(By.linkText(linkText));}

    public SignUpPage clickSignUp() {
        clickLink("Sign Up").click();
        return new SignUpPage(driver);
    };

    public VideoArchivePage clickVideoArchive() {
        clickLink("VIDEO ARCHIVE").click();
        return new VideoArchivePage(driver);
    };

    public SearchResults searchResults(String text) {
        driver.findElement(searchLocator).sendKeys(text);
        return new SearchResults(driver);
    }

    public void clickSearchField(){
        driver.findElement(searchField).click();
    }
    public void setSearchField(String searchResult){ driver.findElement(searchField).sendKeys(searchResult); }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public LoginPage clickLogin() {
        clickLink("Login").click();
        return new LoginPage(driver);
    };
}
