package Mini_Assignment_2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_1 {
    public static void main(String[] args) {
        String chromePath = "C:\\Users\\mayakaushik\\Desktop\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        navigate(driver);
    }
    public static void navigate(WebDriver driver){
        final String URL = "https://phptravels.com/demo";
        driver.get(URL);
        WebElement title = driver.findElement(By.xpath("//strong//parent::h4[@class='main-title go-right h3']"));
        if(check(title)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        login(driver);
    }
    public static void login(WebDriver driver){
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        driver.navigate().to("https://phptravels.org/login");
        WebElement loginTitle = driver.findElement(By.xpath("//a[@class='logo visible-xs visible-sm visible-md']//child::img[@title='PHPTRAVELS']"));
        if(check(loginTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
    private static boolean check(WebElement title){
        if(title.getText().equals("PHPTRAVELS")){
            return true;
        }
        return false;
    }
}
