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
        final String URL = "https://www.phptravels.net/hotels";
        driver.get(URL);
        driver.findElement(By.className("logo"));
        driver.findElement(By.linkText("home"));
        driver.findElement(By.linkText("flights"));
        driver.findElement(By.linkText("Tours"));
        driver.findElement(By.linkText("Company "));
        driver.findElement(By.className("theme-btn theme-btn-small waves-effect"));
        driver.findElement(By.className("theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect"));
    }
}

