package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewUserPage;
import pages.SignUpPage;

public class SignUpTests extends BaseTest {

    @Test
    public void testSuccessSignUp() {
        SignUpPage signUpPage = homePage.clickSignUp();
        signUpPage.setUserName("username");
        signUpPage.setEmail("user@name.pass");
        signUpPage.setPassWord1("password");
        signUpPage.setPassWord2("password");
        NewUserPage newUserPage = signUpPage.clickLoginButton();
        Assert.assertEquals
                (newUserPage.getMessage(),"LiveTV Sign Up", "Message is wrong");

    }

    @Test
    public void testSuccessLogin() {
        SignUpPage signUpPage = homePage.clickSignUp();
        signUpPage.setEmail("user@name.pass");
        signUpPage.setPassWord1("password");
        NewUserPage newUserPage = signUpPage.clickLoginButton();
        Assert.assertEquals
                (newUserPage.getMessage(),"username", "Message is wrong");

    }
}
