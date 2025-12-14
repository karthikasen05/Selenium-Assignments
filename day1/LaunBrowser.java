package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a object //
       ChromeDriver driver = new ChromeDriver();
       //FirefoxDriver d1 = new FirefoxDriver (); //
       //EdgeDriver d2 = new EdgeDriver () ; //
       // load the URL //
       driver.get("https://platform.testleaf.com/#/");
       //Maximize //
       driver.manage().window().maximize();
       // to get the Title //
      // String title =driver.getTitle();	
      // System.out.println(title);//
       System.out.println(driver.getTitle());
       
       }

}
