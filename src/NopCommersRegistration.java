import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommersRegistration {

    protected  static WebDriver driver;

    //public static  String getCurrentDateTime(){
     // DateFormate dateFormate = new SimpleDateFormate("MMDDYYYYHHSS")


    public static void main(String[] args) {

System.setProperty( "webdriver.chrome.driver","src\\Selenium\\chromedriver.exe" );
driver = new ChromeDriver(  );

//implicit wait apply
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
        //to get url
        driver.get( "https://demo.nopcommerce.com/" );
        //Regiter new user
        //driver.findElement( By.id("Fast name") ).sendKeys( "Muha" );
        driver.findElement( By.xpath( "//div[@name='FirstName' ]") );

        //driver.findElement( By.id( "Last name" ) ).sendKeys( "sayed" );
        driver.findElement( By.xpath( "//div//input[@'name=LastName']") );

       // driver.findElement(By.id( "Email" ) ).sendKeys( "sayed@yahoo.com" );
        driver.findElement( By.xpath( "//div//input[@'type=email']" ) );

        driver.findElement( By.id( "password" ) ).sendKeys( "ssss1234" );
        driver.findElement( By.id( "ConfirmPassword" ) ).sendKeys( "ssss1234" );
        driver.findElement( By.id( "regiter-button" ) ).click();
        String accualkSuccessfullMessage = driver.findElement( By.xpath( "//div[@'class=result']" ) ).getText();
        Assert.assertEquals( "Your registration completed",accualkSuccessfullMessage );

    }


}
