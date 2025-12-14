package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
	       driver.findElement(By.linkText("Leads")).click();
	       driver.findElement(By.linkText("Create Lead")).click();
	       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
	       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Senthil");
	       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Teastleaf");
	       driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation seleinum");
	       driver.findElement(By.className("smallSubmit")).click();
	       System.out.println(driver.getTitle());
	       driver.close();
	}

}
