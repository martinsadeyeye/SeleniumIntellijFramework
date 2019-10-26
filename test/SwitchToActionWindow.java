import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActionWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/MARTINS/Downloads/chromedriver.exe");

        // new Instance of Chrome Driver
        WebDriver driver = new ChromeDriver();

        // driver navigating to test url
        driver.get("http://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // to get the original window handle
        String originalHandle = driver.getWindowHandle();

        //a for loop to iterate through the window handle
        // And then be able to switch back to the tab

        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);


        driver.quit();

    }

}
