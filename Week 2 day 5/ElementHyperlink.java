package org.college;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementHyperlink {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.leafground.com/pages/Link.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	//GO TO HOME PAGE
	
	WebElement findElement = driver.findElement(By.linkText("Go to Home Page"));
	findElement.click();
	driver.navigate().back();
	
	//FIND WHERE IAM SUPPOSED TO GO
	
	WebElement findElement2 = driver.findElement(By.partialLinkText(" supposed to go without clicking me?"));
	String attribute = findElement2.getAttribute("href");
	System.out.println(attribute);
	
	//VERIFY IAMBROKEN
	
	WebElement findElement3 = driver.findElement(By.linkText("Verify am I broken?"));
	if (findElement3.equals("404")) {
		System.out.println("link is broken");
	}else {
		System.out.println("link is not broken");
		
	}
	
	WebElement findElement4 = driver.findElement(By.linkText("Go to Home Page"));
	findElement4.click();
	driver.navigate().back();
	
	//HOW MANY LINKS ARE AVAILABLE
	
	List<WebElement> findElements = driver.findElements(By.tagName("a"));
	int size = findElements.size();
	System.out.println(size);
	
	
	
}
}