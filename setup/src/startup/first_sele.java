package startup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_sele {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
