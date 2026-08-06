package GSI.jenkinn.project;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import Pages.ElementPage;
import Pages.Page2;

public class Page_Example {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.engineerdiaries.com/selenium");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

       // driver.findElement(By.id("input_text")).clear();

       // driver.findElement(By.id("input_text")).sendKeys("hello");

      //  ElementPage page=new ElementPage(driver);

	//	page.getInputBox().clear();

	//	page.getInputBox().sendKeys("hello");
        Page2 page = new Page2(driver);



        page.getInputBox().clear();



        page.getInputBox().sendKeys("hello");
      //  driver.quit();
    }
}