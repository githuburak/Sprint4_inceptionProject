package com.seamlessly.pages;

import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath="///*[@id=\"appmenu\"]/li[1]/a")
    public WebElement files;

    @FindBy(xpath="//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement photos;

    @FindBy(xpath="//*[@id=\"appmenu\"]/li[3]/a")
    public WebElement activity;

    @FindBy(xpath="//*[@id=\"appmenu\"]/li[4]/a")
    public WebElement contacts;

    @FindBy(xpath="//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement calendar;

    @FindBy(xpath="//*[@id=\"apps\"]/ul/li[6]/a")
    public WebElement notes;

    @FindBy(xpath="//*[@id=\"apps\"]/ul/li[7]/a")
    public WebElement deck;

    @FindBy(xpath="//*[@id=\"apps\"]/ul/li[8]/a")
    public WebElement tasks;

    @FindBy(css = "img[width='32']")
    public WebElement avatarIcon;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement logOut;

    @FindBy(xpath = "//*[@id=\"expand\"]")
    public WebElement profileSetting;

    public void navigateTo(String tab) {

        String tabLocator = "//a[.='" + tab + "']";
        BrowserUtils.waitForClickablility(By.xpath(tabLocator), 7);
        Driver.get().findElement(By.xpath(tabLocator)).click();

    }
}
