package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShowRecords_stepDefinition {
    UsersPage usersPage = new UsersPage();
    Select select;
    @Then("User see default value as {int}")
    public void user_see_default_value_as(Integer int1) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(usersPage.ShowRecordsDropdown));
        select = new Select(usersPage.ShowRecordsDropdown);
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, int1 + "");
    }




    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> options) {
        select = new Select(usersPage.ShowRecordsDropdown);
        List<WebElement> webElements = select.getOptions();
        List<String> actualText = BrowserUtils.getElements(webElements);

        Assert.assertEquals(options, actualText);
    }






}
