package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {

    WebDriver driver;

    String date = "1-08-2026";

    @FindBy(id = "input_text")
    WebElement inputBox;
    public Page2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputBox() {
        return inputBox;
    }
}