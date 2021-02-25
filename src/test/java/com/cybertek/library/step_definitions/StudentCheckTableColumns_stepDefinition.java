package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class StudentCheckTableColumns_stepDefinition {
        UsersPage usersPage = new UsersPage();
    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> options) {
        List<String> actual = BrowserUtils.getElements(usersPage.studentTable);
        Assert.assertEquals(options,actual);
    }


    @And("user click borrowing books module")
    public void userClickBorrowingBooksModule() {
        usersPage.borrowingBooksLink.click();
    }
}
