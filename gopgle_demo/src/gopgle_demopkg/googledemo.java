package gopgle_demopkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\benja\\Documents\\selinium automation\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		//driver.findElement(By.name("q")).sendKeys("cmf");
		
		//driver.findElement(By.name("q")).submit();
		
		WebElement de=driver.findElement(By.name("q"));
		de.sendKeys("cmf");
		de.submit();
	}

}
