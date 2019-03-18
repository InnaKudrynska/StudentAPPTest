import com.sun.javafx.scene.KeyboardShortcutsHandler;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifficultTest {

    @Test
    public void testMethod () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.ua");
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("cats");
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);

    }
}
