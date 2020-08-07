package TAWalletAndroidtesting.TAWALLET_automationtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("unused")
public class Loginpage extends Baseclass {
	
public void logincredentials(String usermobile,String password){
		
		driver.findElementById("mobile").sendKeys(usermobile);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("pass").sendKeys(password);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("com.ta.wallet.tawallet:id/button2").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
}
