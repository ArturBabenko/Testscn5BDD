import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTests {

    @Before
    public void main() {
        String fileLocation = "//Users//arthurbabenko//Documents//Testing//";
        System.setProperty("webdriver.chrome.driver", fileLocation+
                "selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();

    }

    @Test
    public void firstTest() {



    }
}
