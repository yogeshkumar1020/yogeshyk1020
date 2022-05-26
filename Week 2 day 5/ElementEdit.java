package org.college;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementEdit {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	
	//ENTER YOUR EMAIL ADDRESS
	
	WebElement findElement = driver.findElement(By.xpath("//label[contains(text(),'Enter your email address')]/following-sibling::input"));
	findElement.sendKeys("mr.yk@123.COM");
	
	//APPEND A TEXT
	
	WebElement findElement2 = driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input"));
	findElement2.sendKeys("amuku dumuku amal dumal");
	
	//GET DEFAULT TEXT
	
	WebElement findElement3 = driver.findElement(By.xpath("//label[contains(text(),'Get default text entered')]/following-sibling::input"));
	String attribute = findElement3.getAttribute("value");
	System.out.println(attribute);
	
	//CLEAR ME
	
	WebElement findElement4 = driver.findElement(By.xpath("//label[contains(text(),'Clear the text')]/following-sibling::input"));
	findElement4.clear();
	
	//THAT FIELD IS DISABLED
	
	WebElement findElement5 = driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is disabled')]/following-sibling::input"));
	boolean enabled = findElement5.isEnabled();
	System.out.println(enabled);
}
}
