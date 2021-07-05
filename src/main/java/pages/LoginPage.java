package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By login = By.id("lgn");
    private By password = By.cssSelector("input[name=\"password\"]");
    private By buttonLogin = By.cssSelector("input[type=\"submit\"]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLogin(String loginName){
        driver.findElement(login).sendKeys(loginName);
    }

    public void setPassword(String passWord){
        driver.findElement(password).sendKeys(passWord);
    }

    public UserSession clickLoginButton (){
        driver.findElement(buttonLogin).click();
        return new UserSession(driver);
    }
}
