import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FilterTest {
    WebDriver driver;

    @Test
    public void ClickOnFunnel(){
        driver.findElement(By.xpath("//div[@class='right_component']//span//select")).click();
        driver.findElement(By.xpath("//div[@class='right_component']//span//select//option[4]")).click();
        driver.findElement(By.xpath("//div[@class='pricebar']//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }
}
