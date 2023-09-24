package step_definitions;

import org.example.pageObject.DraggablePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DraggableSteps {

    private WebDriver driver = Hooks.driver;
    // private Actions actions = Hooks.actions;

    DraggablePage draggablePage = new DraggablePage(driver);

    @Given("User already on website jQueryui.com")
    public void verifyJqueryPage() {
        Assert.assertTrue(draggablePage.verifyJqueryPage());
    }

    @When("User clicks Draggable menu")
    public void userClickDragMenu() {
        draggablePage.clickDraggableMenu();
    }

    @And("User already on draggable menu page")
    public void verifyDraggablePage() {
        Assert.assertTrue(draggablePage.verifyDraggablePage());
    }

    @And("User clicks and hold the object")
    public void userDragAndDropObject() {
        draggablePage.dragAndDropObject();
    }

    @Then("User clicks Droppable menu")
    public void userClickDroppableMenu() {
        draggablePage.clickDroppableMenu();
    }
}
