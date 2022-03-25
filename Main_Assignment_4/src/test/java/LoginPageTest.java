import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.log.Log;
import org.testng.annotations.Test;

public class LoginPageTest extends SenarioTest{
    @Test
    public void LoginFailureTest(){
        LoginPageClass login = new LoginPageClass();
        login.logFun("asdad","Asdasd");
    }
    @Test
    public void LoginSuccessTest(){
        String userName = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();
        LoginPageClass login = new LoginPageClass();
        login.logFun(userName,password);
    }
}
