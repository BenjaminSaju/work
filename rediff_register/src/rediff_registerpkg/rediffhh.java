package rediff_registerpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffhh {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
				System.setProperty("WebDriver.chrome.driver", "C:\\Users\\deute\\OneDrive\\Documents\\SOFTWARE TESTING\\selenium automation\\chromedriver-win64\\chromedriver-win64\\chrome.driver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
				
				driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Benjamin Saju");
		        driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("xbenjmin");
		        driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		        driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("benjaminoo7");
		        driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("benjaminoo7");
		        driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("benjaminsaju2003@gmaii.com");
		        driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("1234567890");
		        
		        
		        Select day=new Select(driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]")));
		        Select month=new Select(driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]")));
		        Select year=new Select(driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]")));
		        
		        day.selectByValue("08");
		        month.selectByValue("06");
		        year.selectByValue("2003");
		        
		        driver.findElement(By.xpath("//tbody/tr[24]/td[3]/input[2]")).click();
		        
		        Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		        Select city=new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[3]/select[1]")));
		        
		        country.selectByIndex(0);
		        city.selectByVisibleText("Cochin");
		        
		        driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();        
			}

	}

