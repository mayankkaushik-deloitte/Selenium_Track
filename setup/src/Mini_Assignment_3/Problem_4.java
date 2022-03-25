package Mini_Assignment_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_4 {
    public static void main(String[] args) throws InterruptedException {
        String chromePath = "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        navigate(driver);
    }
    public static void navigate(WebDriver driver) throws InterruptedException {
        final String URL = "https://www.goibibo.com/";
        driver.get(URL);
        //round trip
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/ul/li[2]/span[2]")).click();
        //from new york
        WebElement from =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input"));
        from.sendKeys("New York");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/ul/li[1]/div/div[1]/div/p[1]/span[1]")).click();

        from=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/input"));
        from.sendKeys("Seattle");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@class='sc-bBHHxi cTvqKV'   and contains(text(),'Seattle/Tacoma Intl-WA')]")).click();


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
        driver.findElement(By.xpath("//a[@class='sc-dtMgUX daltrV']")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[3]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();

        //click on search flights
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[3]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/button")).click();
        driver.quit();
    }
}
