package Mini_Assignment_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_4 {
    public static void main(String[] args) {
        String chromePath = "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        navigate(driver);
    }
    public static void navigate(WebDriver driver){
        final String URL = "https://www.goibibo.com/flights/";
        driver.get(URL);
        driver.findElement(By.xpath("//span[text()='Round-trip']")).click();
        driver.findElement(By.xpath("//input")).click();
        driver.findElement(By.xpath("//input")).sendKeys("New York");
        driver.findElement(By.xpath("//ul[@id='autoSuggest-list']//child::li[@tabindex='0']//child::div[@class='sc-iAKWXU iyyKqe']")).click();
        driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']//child::input")).sendKeys("Seattle");
        driver.findElement(By.xpath("//span[text()='Departure']//parent::div[@class='sc-bkkeKt gAqCbJ fswFld ']")).click();
        for(int i = 0 ; i < 3 ; i++){
            driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
        }
        driver.findElement(By.xpath("//div[@aria-label='Fri Jun 24 2022']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Fri Jul 08 2022']")).click();
        driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
        driver.findElement(By.xpath("//a[@class='sc-dtMgUX daltrV']")).click();
        driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
    }
}
