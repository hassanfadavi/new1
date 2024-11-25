package pages.Fcebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookMainPage {

    public WebDriver driver;

    //elements
    public WebElement userName;
    public WebElement passWord;
    public WebElement loginButton;

    //constructor
    public FaceBookMainPage(WebDriver driver){
        this.driver=driver;
       this.userName=driver.findElement(By.xpath("//input[@name='email']"));
       this.passWord=driver.findElement(By.xpath("//input[@name='pass']"));
        this.loginButton=driver.findElement(By.xpath("//button[@name='login']"));
    }

    //userName
    public void inputUserName(String userName){
        this.userName.sendKeys(userName);

    }
    //password
    public void inputPassWord(String passWord){
        this.passWord.sendKeys(passWord);
    }
    //click on Login
    public void loginButton(){
        loginButton.click();
    }

}
