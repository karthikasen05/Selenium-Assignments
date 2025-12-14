package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions option = new ChromeOptions();
		  option.addArguments("--guest");
		  ChromeDriver driver = new ChromeDriver(option);
		
	       driver.get("http://leaftaps.com/opentaps/");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className( "decorativeSubmit")).click();
	       driver.findElement(By.partialLinkText("CRM/SFA")).click();
	       driver.findElement(By.linkText("Accounts")).click();
	       driver.findElement(By.linkText("Create Account")).click();
	       driver.findElement(By.id("accountName")).sendKeys("Karthika");
	       driver.findElement(By.name("description")).sendKeys("\"Selenium Automation Tester");
	       driver.findElement(By.id("numberEmployees")).sendKeys("25");
	       driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	       driver.findElement(By.className("smallSubmit")).click();
	       System.out.println(driver.getTitle());
	       driver.close();
	}

}
