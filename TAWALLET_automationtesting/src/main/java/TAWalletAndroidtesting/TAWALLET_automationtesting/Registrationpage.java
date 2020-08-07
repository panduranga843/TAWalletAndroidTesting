package TAWalletAndroidtesting.TAWALLET_automationtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("unused")
public class Registrationpage extends Baseclass {
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
@Test
	public void Registrationbuttonclick() {
		System.out.println("Registration is calling222");
	   	 driver.findElementById("button1").click();
		 System.out.println("3.Registraion clicked");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
@Test
	public void textpointslowkyc(){
		String tv = driver.findElement(By.id("textViewLowKYC")).getText();
		//System.out.println("textview"+tv.length());
		
		String tv1="1. Wallet balance cannot exceed Rs. 10,000/- at any point of time.\r\n" + 
				"2. Load Money maximum of Rs. 10,000/- per month (includes balances from other wallet a/c also)\r\n" + 
				"3. Load Money can be done using only UPI, NEFT & IMPS Inward.\r\n" + 
				"4. Load Money using Net Banking, Credit and Debit card is not allowed.\r\n" + 
				"5. Recharges & Bill Payments - allowed.\r\n" + 
				"6. Ticket Booking (Bus/ Flight/ Hotel) - allowed.\r\n" + 
				"7. Merchant Payments (QR / Barcode/ OTP) - allowed.\r\n" + 
				"8. Other Goods & Services - allowed.\r\n" + 
				"9. Fund transfer to other wallet a/c � Not allowed.\r\n" + 
				"10. Fund transfer to bank a/c (IMPS) � Not allowed.\r\n" + 
				"11. Gift Vouchers - Not allowed.\r\n" + 
				"12. Rupay Card - Not allowed.";
		
		//System.out.println(tv1.length()+"actual length");
		
		if(tv1.length()==tv.length()) {
			System.out.println("4.In Text view all points are matched");
		}
		else {
			System.out.println("BUG-1.Text view points not Matched");
		
		}
		
	}
	@Test
	public void termsandcondition() throws InterruptedException {

		driver.findElementById("checkBoxInstr").click();
		System.out.println("5.Checking Terms and conditions successfully");
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().back();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void buttonproceed(){
		WebElement e1=driver.findElementById("buttonProceed");
		e1.click();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		System.out.println("6.Allowed Permission for Contacts");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	@Test
public void checkinglowkycornot(String usermobile) {
		
		driver.findElementById("mobile").sendKeys(usermobile);//8184892784
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.findElementById("buttonVerify").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test
public void verificationofmobile() {
	
	if(IsPresent("content_text")&&driver.findElementById("content_text").getText().toString().equals("User Already registered"))
    {
    	System.out.println("Executed If Case");
    	System.out.println("7.User already registered");
		driver.findElementById("confirm_button").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Navigate up").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.findElementById("com.ta.wallet.tawallet:id/confirm_button").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    else
    {    	
    	System.out.println("Executed else Case");
    	System.out.println("7.User not Registered");
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
}
}
