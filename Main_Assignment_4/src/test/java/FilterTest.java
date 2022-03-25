import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FilterTest {
    WebDriver driver;

    @Test
    public void ClickOnFunnel(){
        //click on filter
        driver.findElement(By.xpath("//div[@class='right_component']//span//select")).click();
        //click on price high to low
        driver.findElement(By.xpath("//div[@class='right_component']//span//select//option[4]")).click();
        //click on add to cart
        driver.findElement(By.xpath("//div[@class='pricebar']//button[@id='add-to-cart-sauce-labs-backpack']")).click();

    }
    public void clickRemove(){
        //click on remove
        driver.findElement(By.xpath("//div[@id='inventory_container']//div//div//div//div//div[2]//div[2]//button[@id='remove-sauce-labs-fleece-jacket']")).click();
        //click on add to cart
        driver.findElement(By.xpath("//div[@class='pricebar']//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }
}
