import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/MARTINS/Downloads/chromedriver.exe");

        // new Instance of Chrome Driver
        WebDriver driver = new ChromeDriver();

        // driver navigating to test url
        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileupload = driver.findElement(By.id("file-upload-field"));
        fileupload.sendKeys("file-to-upload.png");

        driver.quit();
    }
}
