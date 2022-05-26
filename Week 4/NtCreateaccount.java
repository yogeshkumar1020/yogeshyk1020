package week4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NtCreateaccount {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	//USERNAME
	
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("demosalesmanager");
		
		//PASSWORD
		
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		
		//LOGIN BUTTON
		
		WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		findElement3.click();
		
		//CRMSFA LINK
		
		WebElement findElement4 = driver.findElement(By.partialLinkText("/SFA"));
		findElement4.click();
		
		//ACCOUNT
		
		WebElement findElement5 = driver.findElement(By.linkText("Accounts"));
		findElement5.click();
		
		//CREATE ACCOUNT
		
		WebElement findElement6 = driver.findElement(By.linkText("Create Account"));
		findElement6.click();
		
		//PREFERED CURRENCT
		
		 WebElement findElement7 = driver.findElement(By.xpath("//form[@name='createAccountForm']//select[@id='currencyUomId']"));
		Select dd1 = new Select (findElement7);
		dd1.selectByValue("INR");
		
		//DESCRIPTION
		
		WebElement findElement8 = driver.findElement(By.name("description"));
		findElement8.sendKeys("NRI ACCOUNT");
		
		//LOCAL NAME
		
		WebElement findElement9 = driver.findElement(By.xpath("//form[@id='createAccountForm']//input[@id='groupNameLocal']"));
		findElement9.sendKeys("s");
		
		//SITENAME
		
		WebElement findElement10 = driver.findElement(By.name("officeSiteName"));
		findElement10.sendKeys("www.srikrishnafabricators.com");
		
		//ANNUAL REVENUE
		
		
		
}
}
