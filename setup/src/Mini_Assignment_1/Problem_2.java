package Mini_Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_2 {
    public static void main(String[] args) {
        String chromDriverPath = "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromDriverPath);
        WebDriver driver = new ChromeDriver();
        final String URL = "https://www.phptravels.net/hotels";
        driver.get(URL);
        driver.findElement(By.xpath("//input[@name='checkin']"));
        driver.findElement(By.xpath("//input[@name='checkout']"));
        driver.findElement(By.xpath("//i[@class='la la-minus']/following::i[3]"));
        driver.findElement(By.xpath("//i[@class='la la-plus']/following::i[3]"));
        driver.findElement(By.xpath("//i[@class='la la-minus']/following::i[4]"));
        driver.findElement(By.xpath("//i[@class='la la-plus']/following::i[4]"));

    }

}
