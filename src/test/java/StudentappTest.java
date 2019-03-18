import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentappTest {

    @Test
    public void testMethod () {
        WebDriver studik = new ChromeDriver();
        studik.get("http://37.59.228.229:3000/");
        studik.findElement(By.cssSelector("body > div.row > div.col.s3.blue.lighten-5.list-container > a > i")).click();
        studik.findElement(By.cssSelector("input#icon_telephone")).clear();
        studik.findElement(By.cssSelector("input#icon_telephone")).sendKeys("380939632896");
        studik.findElement(By.cssSelector("input#icon_telephone")).sendKeys(Keys.ENTER);
        studik.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > form > div:nth-child(1) > div > div > div:nth-child(1)")).click();
        studik.findElement(By.cssSelector("input#icon_prefix")).clear();
        studik.findElement(By.cssSelector("input#icon_prefix")).sendKeys("Innjackman");
        studik.findElement(By.cssSelector("input#icon_prefix")).sendKeys(Keys.ENTER);
        studik.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > a")).click();
    }
}
