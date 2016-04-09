import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sabrimutlucag on 09/04/16.
 */
public class NavigateToAUrl {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Packt publishing");
        searchBox.submit();
    }
}
