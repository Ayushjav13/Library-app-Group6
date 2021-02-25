package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class VerifyingUserCategory_stepDefinition {
    UsersPage usersPage = new UsersPage();
    Select select;
    @When("User click on User Group dropdown")
    public void user_click_on_user_group_dropdown() {
       usersPage.userCategorySelect.click();
    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> options) {
        List<String> actual = BrowserUtils.getElements(usersPage.userCategory);
        Assert.assertEquals(options, actual);
    }

    @And("User click on User Status dropdown")
    public void userClickOnUserStatusDropdown() {
            usersPage.StatusSelect.click();
    }

    @Then("the user should see the following status options:")
    public void theUserShouldSeeTheFollowingStatusOptions(List<String> options) {
        List <String> actual = BrowserUtils.getElements(usersPage.userStatus);
        Assert.assertEquals(options,actual);
    }
}
