package trello;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public static By loginBTN = By.linkText("Log in");
    public static By username = By.id("username-uid1");
    public static By continueBTN = By.id("login-submit");
    public static By password = By.id("password");
    public static By submitLoginBTN = By.id("login-submit");
    public static By dismissMFA = By.id("mfa-promote-dismiss");
}
