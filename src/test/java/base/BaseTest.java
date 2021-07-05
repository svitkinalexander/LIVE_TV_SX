package base;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    private String link = "http://livetv.sx/";
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){driver.get(link);};

    @AfterClass
    public void tearDown(){driver.quit();};

    /*@AfterMethod
    private void setCookie() {
        Cookie cookie = new Cookie
                .Builder("username", "1234")
                .domain("livetv.sx")
                .build();
        driver.manage().addCookie(cookie);
    }*/
}
