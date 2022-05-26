package org.college;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementImage {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.leafground.com/pages/Image.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	
	//CLICK TO HOME PAGE
	
	WebElement findElement = driver.findElement(By.xpath("//label[@for='home']/following-sibling::img"));
	findElement.click();
	driver.navigate().back();
	
	//BROKEN IMAGE
	
	WebElement findElement2 = driver.findElement(By.xpath("//label[contains(text(),'Am I Broken Image?')]/following-sibling::img"));
	if (findElement2.getAttribute("naturalWidth").equals(0)) {
		System.out.println("if image is broken");
	}else {
		System.out.println("if image is not broken");
	}
	
	//CLICK IN MOUSE OR KEYBOARD
	
	WebElement findElement3 = driver.findElement(By.xpath("//label[contains(text(),'Click me using Keyboard or Mouse')]/following-sibling::img"));
	if (findElement3.isSelected()) {
		System.out.println("click in mouse");
		
	}else {
		System.out.println("click in keyboard");
	}
	
}
}
