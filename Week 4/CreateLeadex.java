package week4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadex {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	//USERNAME
	
	WebElement findElement = driver.findElement(By.xpath("//form[@id='login']//input[@id='username']"));
	findElement.sendKeys("demosalesmanager");
	//PASSWORD
	
	WebElement findElement2 = driver.findElement(By.xpath("//form[@id='login']//input[@id='password']"));
	findElement2.sendKeys("crmsfa");
	//LOGIN
	
	WebElement findElement3 = driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']"));
	findElement3.click();
	
	//click CRM/SFA
	
	WebElement findElement4 = driver.findElement(By.xpath("//div[@id='button']//a[@style='color: black;']"));
	findElement4.click();
	
	//CLICK LEADS
	
	WebElement findElement5 = driver.findElement(By.linkText("Leads"));
	findElement5.click();
	
	//CLICK CREATE LEADS
	
	WebElement findElement6 = driver.findElement(By.linkText("Create Lead"));
	findElement6.click();
	
	//ENTER COMPANY NAME
	
	WebElement findElement7 = driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_companyName']"));
	findElement7.sendKeys("oooo ooooo");
	
	//ENTER FIRST NAME
	
	WebElement findElement8 = driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_firstNameLocal']"));
	findElement8.sendKeys("yogesh");
	
	//ENTER LAST NAME
	
	WebElement findElement9 = driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_lastNameLocal']"));
	findElement9.sendKeys("kumar");
	
	//CREATE LEAD
	
	WebElement findElement10 = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
	findElement10.click();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	
}
}