package org.college;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementButton {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.navigate().to("http://www.leafground.com/pages/Button.html");
	driver.manage().window().maximize();
	
	//CLICK BUTTON TO TRAVEL HOME PAGE
	
	WebElement findElement = driver.findElement(By.xpath("//label[contains(text(),'Click button to travel home page')]/following-sibling::button"));
	findElement.click();
	driver.navigate().back();
	
	//GET POSISTION
	
	WebElement findElement2 = driver.findElement(By.xpath("//button[@id='position']"));
	Point location = findElement2.getLocation();
	int x = location.getX();
	System.out.println("x value is ;"+ x);
	int y = location.getY();
	System.out.println("y value is : "+ y);
	
	//BACKGROUND-COLOR
	
	WebElement findElement3 = driver.findElement(By.xpath("//label[contains(text(),'Find button color')]/following-sibling::button"));
	String cssValue = findElement3.getCssValue("background-color");
	System.out.println("Background-color is :" );
	
	//FIND HEIGHT AND WIDTH
	
	WebElement findElement4 = driver.findElement(By.xpath("//label[contains(text(),'Find the height and width')]/following-sibling::button"));
	int height = findElement4.getSize().getHeight();
	System.out.println("height is :"+ height);
	int width = findElement4.getSize().getWidth();
	System.out.println("width is :"+ width);
}
}
