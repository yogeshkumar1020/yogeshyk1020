package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_signin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver .manage().window().fullscreen();
	
driver.findElement(By.id("email")).sendKeys("6374182131");
driver.findElement(By.id("pass")).sendKeys("123456");
driver.findElement(By.name("login")).click();
}	

}
