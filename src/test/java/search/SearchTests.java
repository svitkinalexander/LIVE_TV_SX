package search;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTests extends BaseTest {

    @Test
    public void testSearch() {
        SearchPage searchPage = new SearchPage();
        homePage.clickSearchField();
        homePage.setSearchField("football");
        homePage.clickSearchButton();
        Assert.assertEquals(searchPage.getMessage(), "Search on LiveTV", "Wrong values");
    }
}
