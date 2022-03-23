package Mini_Assignment_1;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_1 {
    public static void main(String[] args) {
        String chromDriverPath = "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromDriverPath);
        WebDriver driver = new ChromeDriver();
        final String URL = "https://phptravels.com/";
        driver.get(URL);
        WebElement logo = driver.findElement(By.id("icon"));
        WebElement home = driver.findElement(By.className("cls-1"));
        WebElement signupBtn = driver.findElement(By.cssSelector("lvl-0 signup-free btn btn-md btn-white-outline open"));
    }
}

