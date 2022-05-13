package day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facbook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwve2TBhByEiwAaktM1DHpE_GaUzDKEHual19BI8jx1PISiM9YDHCJ_Nmpimcc7wQVVCAsRxoCvakQAvD_BwE");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.name("firstname")).sendKeys("nandhini");
		driver.findElement(By.name("lastname")).sendKeys("devi");
		driver.findElement(By.name("reg_email__")).sendKeys("srikrishnafabricator@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("srikrishnafabricator@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("jaisulthan");
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select (day);
		d.selectByValue("20");
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select (month);
		m.selectByValue("8");
		WebElement year = driver.findElement(By.id("year"));
		Select y =new Select(year);
		y.selectByValue("1999");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
} 
}
