import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class HighLightElement {

    WebDriver driver;

    @Test
    public void loginFacebook() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('email').value='testuser001@gmail.com'");

        WebElement passInput = driver.findElement(By.cssSelector("#pass"));

        js.executeScript("arguments[0].value='01234567890'", passInput);

        WebElement btnLogin = driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]"));

        js.executeScript("arguments[0].style.border='5px  solid  red'", btnLogin);

        File srcSht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(srcSht, new File("F:\\Latest Project\\QA-PTY Current Project\\Scripting Tech\\reports\\src.png"));

        btnLogin.click();

        driver.close();
    }
}
