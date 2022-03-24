package Mini_Assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Problem_2 {
    public static void main(String[] args) {
        String chromePath = "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        navigate(driver);
    }
    public static void navigate(WebDriver driver){
        final String URL = "https://jqueryui.com/droppable/";
        driver.get(URL);
        driver.switchTo().frame(0);
        WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
    }
}
