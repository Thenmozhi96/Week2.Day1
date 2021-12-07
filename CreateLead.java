package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException 
	        {
		WebDriverManager.chromedriver().setup();//--> for setup the chrome driver
		ChromeDriver driver1= new ChromeDriver();//-->launch the browser
		driver1.get("http://leaftaps.com/opentaps");//-->load URL
		driver1.manage().window().maximize();
		String tit = driver1.getTitle();
		System.out.println(tit);
		driver1.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver1.findElement(By.id("password")).sendKeys("crmsfa");
		driver1.findElement(By.className("decorativeSubmit")).click();
		driver1.findElement(By.linkText("CRM/SFA")).click();
		driver1.findElement(By.linkText("Leads")).click();
		driver1.findElement(By.linkText("Create Lead")).click();
		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("TATA Consultancy Service");
		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Thenmozhi");
		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
		WebElement ele1=driver1.findElement(By.id("createLeadForm_dataSourceId"));
		Select ele2=new Select(ele1);
		ele2.selectByVisibleText("Partner");
		driver1.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("04");
		driver1.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("22");
		driver1.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("234567");
		driver1.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver1.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2354698752");
		driver1.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Thenmozhi");
		driver1.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abc.com");
		driver1.findElement(By.id("createLeadForm_generalToName")).sendKeys("Thenmozhi");
		driver1.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Shanmugam");
		driver1.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("111");
		driver1.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("abc street");
		driver1.findElement(By.id("createLeadForm_generalCity")).sendKeys("abc");
		
		WebElement cou = driver1.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country=new Select(cou);
		country.selectByValue("AUS");
		Thread.sleep(3000);
		WebElement sta = driver1.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(sta);
		state.selectByValue("AU-NT");
				
		driver1.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("00");
		driver1.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("00");
		driver1.findElement(By.className("smallSubmit")).click();
		String tit1=driver1.getTitle();
		System.out.println(tit1);
		String tex=driver1.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(tex);
		String firstname=driver1.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname);
	}

}
