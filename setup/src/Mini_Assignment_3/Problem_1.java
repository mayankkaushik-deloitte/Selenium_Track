package Mini_Assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Problem_1 {
    public static void main(String[] args) {
        String chromePath = "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        navigate(driver);
    }
    public static void navigate(WebDriver driver){
        final String URL = "https://the-internet.herokuapp.com/";
        driver.get(URL);
        driver.findElement(By.xpath("//li//child::a[text()='Frames']")).click();
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
        driver.switchTo().frame(0);
        WebElement title = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
        title.getText();
    }
}
