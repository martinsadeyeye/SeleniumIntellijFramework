import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/MARTINS/Downloads/chromedriver.exe");

        // new Instance of Chrome Driver
        WebDriver driver = new ChromeDriver();

        // driver navigating to test url
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datefield = driver.findElement(By.id("datepicker"));
        datefield.sendKeys("01/01/2020");
        datefield.sendKeys(Keys.RETURN);

        driver.quit();
    }
}
