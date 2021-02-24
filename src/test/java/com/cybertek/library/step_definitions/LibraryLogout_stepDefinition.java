package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LibrarianPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibraryLogout_stepDefinition {
    LibrarianPage librarianPage = new LibrarianPage();
    @Then("I will be able to logout")
    public void i_will_be_able_to_logout() {
        librarianPage.userID.click();
        librarianPage.logOut.click();
    }
}
