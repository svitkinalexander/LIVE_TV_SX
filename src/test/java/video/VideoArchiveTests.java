package video;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewUserPage;
import pages.ShowVideoPage;
import pages.SignUpPage;
import pages.VideoArchivePage;

public class VideoArchiveTests extends BaseTest {

    @Test
    public void testPlayVideo() {
        VideoArchivePage videoArchivePage = homePage.clickVideoArchive();
        ShowVideoPage showVideoPage = videoArchivePage.clickHighlightsButton();
        Assert.assertEquals(showVideoPage.getVideo(), "div", "Wrong tag");
    }
}
