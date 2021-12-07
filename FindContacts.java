package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContacts {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();//--> for setup the chrome driver
		ChromeDriver driver3= new ChromeDriver();//-->launch the browser
		driver3.get("http://leaftaps.com/opentaps");//-->load URL
		driver3.manage().window().maximize();
		String tit = driver3.getTitle();
		System.out.println(tit);
		driver3.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver3.findElement(By.id("password")).sendKeys("crmsfa");
		driver3.findElement(By.className("decorativeSubmit")).click();
		driver3.findElement(By.linkText("CRM/SFA")).click();
		driver3.findElement(By.linkText("Contacts")).click();
		driver3.findElement(By.linkText("Find Contacts")).click();
		driver3.findElement(By.linkText("Email")).click();
		driver3.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver3.findElement(By.className("x-btn-text")).click();
		driver3.close();
	}

}
