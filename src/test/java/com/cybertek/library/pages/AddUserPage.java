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


    @FindBy(xpath = "//input[@name='end_date']")
    public WebElement EndDateBox;

    @FindBy(id = "address")
    public WebElement AddressBox;

    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement CloseButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SaveChangesButton;

    @FindBy(linkText = "Edit User")
    public WebElement EditUserLink;

}
