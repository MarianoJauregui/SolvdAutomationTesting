import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InstaTest {

    private WebDriver driver;
/*
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get("https://www.instagram.com/?hl=es");
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
        username.sendKeys("a user name");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("a user password");
        WebElement submit = driver.findElement(By.xpath("//buton[@type='submit]"));
        submit.click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

 */
}
