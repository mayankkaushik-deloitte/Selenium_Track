package Mini_Assignment_3;

import org.antlr.v4.runtime.InputMismatchException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input;
import org.openqa.selenium.interactions.Actions;

public class Problem_3 {
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
        driver.findElement(By.xpath("//li//child::a[text()='JavaScript Alerts']")).click();
        driver.findElement(By.xpath("//li//child::button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.sendKeys("Text");
        alert.accept();
        String res = driver.findElement(By.xpath("//p[@id='result']")).getText();
        if(!check(res)){
            System.out.println("Wrong Input");
        }else{
            System.out.println("Correct Input");
        }
    }
    public static boolean check(String res) throws InputMismatchException {
        int i = 0;
        int n = res.length();
        while(i < n && !(res.charAt(i) == ':')){
            i++;
        }
        i += 2;
        String temp = res.substring(i,n - 1);
        if(!temp.equals("Text"))return false;

        return true;
    }
}
