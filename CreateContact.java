package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();//--> for setup the chrome driver
		ChromeDriver driver2= new ChromeDriver();//-->launch the browser
		driver2.get("http://leaftaps.com/opentaps");//-->load URL
		driver2.manage().window().maximize();
		String tit = driver2.getTitle();
		System.out.println(tit);
		driver2.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver2.findElement(By.id("password")).sendKeys("crmsfa");
		driver2.findElement(By.className("decorativeSubmit")).click();
		driver2.findElement(By.linkText("CRM/SFA")).click();
		driver2.findElement(By.linkText("Contacts")).click();
		driver2.findElement(By.linkText("Create Contact")).click();
		driver2.findElement(By.id("firstNameField")).sendKeys("Thenmozhi");
		driver2.findElement(By.id("lastNameField")).sendKeys("S");
		driver2.findElement(By.className("smallSubmit")).click();
		String name=driver2.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(name);
	}

}
