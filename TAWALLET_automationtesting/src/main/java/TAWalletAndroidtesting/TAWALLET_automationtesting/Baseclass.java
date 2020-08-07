package TAWalletAndroidtesting.TAWALLET_automationtesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {
	
	
	@SuppressWarnings("unused")
	private static boolean IsPresent(String ElementName)
	{
		boolean present;
		try {
		   driver.findElement(By.id(ElementName));
		   present = true;
		} catch (Exception errro){
		   present = false;
		}
		return present;
	}
	static AndroidDriver<WebElement> driver;
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		Baseclass bc=new Baseclass();
		bc.setup();
		bc.permissions();
		bc.Registration();
		bc.Login();
		bc.Homepage();
		
}	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"OnePlus 7T");
		
		dc.setCapability("appPackage", "com.ta.wallet.tawallet");
		dc.setCapability("appActivity", "com.ta.wallet.tawallet.agent.View.Activities.SplashScreen");
		//dc.setCapability("noReset", "true");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver<WebElement>(url, dc);	
	}
	@Test
	public void permissions() {		
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_always_button").click();
		System.out.println("TESTCASES OF TA Wallet");
		System.out.println("1.Allowed permission for location");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		System.out.println("2.Allowed permission for phonecalls");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	@Test
public void Registration() throws InterruptedException {
	
	Registrationpage rp=new Registrationpage();
	rp.Registrationbuttonclick();
	rp.textpointslowkyc();
	rp.termsandcondition();
	rp.buttonproceed();
	rp.checkinglowkycornot("7095924019");
	rp.verificationofmobile();
}
	@Test
public void Login(){
	Loginpage lp=new Loginpage();
	lp.logincredentials("7095924019", "Dadymom@1");
	
} 
	@Test
public void Homepage() throws InterruptedException {
	
	Homepage hp=new Homepage();
	hp.Loadmoney();
	hp.profileupgradewallet();
	
}

}
