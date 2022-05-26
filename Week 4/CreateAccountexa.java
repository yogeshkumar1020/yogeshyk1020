package week4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountexa {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
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
	
	//ENTER ACCOUNT NAME
	
	WebElement findElement7 = driver.findElement(By.xpath("//input[@id='accountName']"));
	findElement7.sendKeys("MR.YK.D");
	
	//ENTER DESCRIPTION
	
	WebElement findElement8 = driver.findElement(By.xpath("//textarea[@name='description']"));
	findElement8.sendKeys("Selenium Automation Tester");
	
	//ENTER LOCALNAME
	
	WebElement findElement9 = driver.findElement(By.xpath("//input[@id='groupNameLocal']"));
	findElement9.sendKeys("hari");
	
	//ENTER SITE NAME
	
	WebElement findElement10 = driver.findElement(By.xpath("//input[@id='officeSiteName']"));
	findElement10.sendKeys("www.srikrishnafabricators.com");
	
	//ANNUAL REVENUE
	
	WebElement findElement11 = driver.findElement(By.xpath("//input[contains(@id,'annualRevenue')]"));
	findElement11.sendKeys("3,00,000");
	
	//CLICK CREATE ACCOUNT
	
	WebElement findElement12 = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
	findElement12.click();	
}
}
