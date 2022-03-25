import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
    WebDriver driver = SenarioTest.driver;



    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPageClass(){
        PageFactory.initElements(driver,this);
    }


    public void logFun(String userName, String passWord){
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();
    }
}
