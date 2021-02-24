package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
    public AddUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Users")
    public WebElement UsersPageLink;

    @FindBy(linkText = "Add User")
    public WebElement AddUserButton;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement FullNameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement EmailBox;

    @FindBy(id = "user_group_id")
    public WebElement UserGroupBox;

    @FindBy(id = "status")
    public WebElement StatusBox;

    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement StartDateBox;

    @FindBy()
    public WebElement EndDateBox;

    @FindBy()
    public WebElement AddressBox;

}
