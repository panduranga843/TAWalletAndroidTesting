package TAWalletAndroidtesting.TAWALLET_automationtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("unused")
public class Homepage extends Baseclass{
	
	public void Loadmoney() throws InterruptedException {
		
				//com.ta.wallet.tawallet:id/cancel_button--enable fingerprint
				//com.ta.wallet.tawallet:id/confirm_button--enablefingerprint proceed
				driver.findElementById("cancel_button").click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				System.out.println("8.Enable fingerprint option will be set later");
				System.out.println("BUG-2.RBI Notification alert is not showing after Login.");
				System.out.println("9.For Full Kyc user we are viewing the Login page Directly");
				driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[96,563][264,731]']")).click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				String textview = driver.findElement(By.id("dynamicNote")).getText();
				//System.out.println("textview"+textview.length());
				
				String textview1="Note:Payment Gateway Charges are apply for all PG transactions, Credit Card Transactions (Visa/Master:1.90%+GST & Diner/Amex: 2.75+GST),Debit Card 0.86% Including GST, Netbanking: 2.13% Including GST, UPI:0.60% of transaction amount, Wallet 2.29% Including GST.)";
				//System.out.println("textview1"+textview1.length());
				
				if(textview.length()==textview1.length()){System.out.println("9.Notes points in Load money Matched");}
				else {System.out.println("BUG-3.Notes Points in load money Not Matched");}
				
				//com.ta.wallet.tawallet:id/etFAMamount
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElementById("etFAMamount").sendKeys("10");
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElementById("radioPayment").click();
				//com.ta.wallet.tawallet:id/radioPayment
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//com.ta.wallet.tawallet:id/btnFAMAddMoney
				driver.findElementById("btnFAMAddMoney").click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				Thread.sleep(5000);
						
				driver.findElementByAccessibilityId("Navigate up").click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//com.ta.wallet.tawallet:id/confirm_button
				driver.findElementById("confirm_button").click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.findElementByAccessibilityId("Navigate up").click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}	
public void profileupgradewallet() {
		
		WebElement profile = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[724,2148][787,2206]']"));
		profile.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//com.ta.wallet.tawallet:id/et_tpin_utility_confirmTpin
		driver.findElementById("et_tpin_utility_confirmTpin").sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//com.ta.wallet.tawallet:id/btn_tpin_utility_confirm_button
		driver.findElementById("btn_tpin_utility_confirm_button").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//com.ta.wallet.tawallet:id/tvUpgradeWallet
		driver.findElementById("tvUpgradeWallet").click();
		System.out.println("BUG-4.Upgrade wallet is not opening");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
}
