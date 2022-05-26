package org.college;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheckbox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//SELECT THE LANGUAGES
	WebElement findElement = driver.findElement(By.xpath("//div[@class='example']/input[1]"));
	findElement.click();
	
	//CONFIRM SELENIUM IS CHECKED
	
	WebElement findElement2 = driver.findElement(By.xpath("//section[@class='innerblock']/div[2]/input"));
	boolean selected = findElement2.isSelected();
	System.out.println(selected);
	
	//DESELECT ONLY CHECKED
	
	WebElement findElement3 = driver.findElement(By.xpath("//section[@class='innerblock']/div[3]/input"));
	boolean selected2 = findElement3.isSelected();
	System.out.println(selected2);
	
	//SELECT BELOW ALL CHECKBOXES
	
	List<WebElement> findElements = driver.findElements(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input"));
	for (int i = 0; i < findElements.size(); i++) {
		findElements.get(i).click();
	}
}
}

