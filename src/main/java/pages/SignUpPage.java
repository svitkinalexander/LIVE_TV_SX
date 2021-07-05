package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;
    /*private By loginbutton = By.cssSelector("a.lwhite[href=\"/signup/\"]");*/
    private By usernameField = By.id("fio");//input[id="fio"]
    private By emailField = By.id("email");//input[id="email"]
    private By passwordField1 = By.id("pass1");
    private By passwordField2 = By.id("pass2");
    private By loginButton = By.cssSelector("button[id='fstst']");
    //private By loginButton = By.cssSelector("button[id='captcha']");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName){
        driver.findElement(usernameField).sendKeys(userName);
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassWord1(String passWord){
        driver.findElement(passwordField1).sendKeys(passWord);
    }
    public void setPassWord2(String passWord){
        driver.findElement(passwordField2).sendKeys(passWord);
    }

    public NewUserPage clickLoginButton (){
        driver.findElement(loginButton).click();
        return new NewUserPage(driver);
    }

}
