package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DraggablePage {

    public static WebDriver driver;
    public static Actions actions;

    public DraggablePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        DraggablePage.driver = driver;

    }

    // select jquery title on landing page
    @FindBy(xpath = "//a[@href='/']")
    private WebElement jqueryTitle;

    // Select draggable menu element
    @FindBy(xpath = "//a[.='Draggable']")
    private WebElement draggableMenu;

    // Select element on drag menu for verify
    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement verifyDraggable;

    // Select draggable object
    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement draggableObject;

    // select box frame
    @FindBy(xpath = "//*[@id=\"content\"]/iframe")
    private WebElement boxFrame;

    // ========================================

    // verify jquery page
    public boolean verifyJqueryPage() {
        return jqueryTitle.isDisplayed();
    }

    // Click draggable menu
    public void clickDraggableMenu() {
        draggableMenu.click();
    }

    // verify draggable page
    public boolean verifyDraggablePage() {
        return verifyDraggable.isDisplayed();
    }

    // drag and drop object
    public void dragAndDropObject() {
        actions.dragAndDrop(boxFrame, draggableObject);
    }
}
