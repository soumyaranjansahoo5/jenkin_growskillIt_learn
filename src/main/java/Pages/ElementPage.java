package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPage {

    WebDriver driver;

    By inputBox = By.id("input_text");

    // Constructor
    public ElementPage(WebDriver driver) {
        this.driver = driver;
    }

    // Getter method for Input Box
    public WebElement getInputBox() {
        return driver.findElement(inputBox);
    }
}