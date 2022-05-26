package org.college;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementRadio {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/radio.html");
	driver.manage().window().maximize();
	
	WebElement findElement = driver.findElement(By.id("yes"));
	findElement.click();
	
	WebElement findElement2 = driver.findElement(By.xpath("//input[@name='news'  and @value='1']"));
	boolean selected = findElement2.isSelected();
	System.out.println(selected);
	
	WebElement findElement3 = driver.findElement(By.xpath("//input[@name='age' and @value='1']"));
	boolean selected2 = findElement3.isSelected();
	System.out.println(selected2);
}
}