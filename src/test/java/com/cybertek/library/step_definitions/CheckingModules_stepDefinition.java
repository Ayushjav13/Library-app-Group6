package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LibrarianPage;
import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CheckingModules_stepDefinition {
    LibrarianPage librarianPage = new LibrarianPage();
    UsersPage usersPage = new UsersPage();
    @When("I enter username {string}")
    public void i_enter_username(String string) {
       librarianPage.usernameBox.sendKeys(string);
    }


    @When("I enter password {string}")
    public void i_enter_password(String string) {
        librarianPage.passwordBox.sendKeys(string);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        librarianPage.signIn.click();
    }


    @Then("User able to see following columns:")
    public void userAbleToSeeFollowingColumns(List<String> expectedModules) {
        List <String> actualModules = BrowserUtils.getElements(usersPage.navBarList);
        Assert.assertEquals(expectedModules,actualModules);

        Driver.closeDriver();
    }
}
