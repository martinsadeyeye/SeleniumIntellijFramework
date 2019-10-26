import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/MARTINS/Downloads/chromedriver.exe");

        // new Instance of Chrome Driver
        WebDriver driver = new ChromeDriver();

        // driver navigating to test url
        driver.get("http://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);

        actions.moveToElement(name);
        name.sendKeys("Martins Adeyeye");

        WebElement datefield = driver.findElement(By.id("date"));
        datefield.sendKeys("01/01/2020");

        driver.quit();
    }

}
