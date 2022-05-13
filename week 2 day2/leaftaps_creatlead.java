package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftaps_creatlead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sri Krishna Fabricators");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yogesh");
	WebElement createLeadForm_dataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select cLFSID = new Select (createLeadForm_dataSourceId);
	cLFSID.selectByVisibleText("Employee");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mister");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3,00,000");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar D");
	WebElement createLeadForm_industryEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select cLFEID = new Select (createLeadForm_industryEnumId);
	cLFEID.selectByIndex(3);
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("20/8/1999");
	WebElement createLeadForm_ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select cLFoID = new Select (createLeadForm_ownershipEnumId);
	cLFoID.selectByValue("OWN_CCORP");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
	WebElement createLeadForm_currencyUomId = driver.findElement(By.id("createLeadForm_currencyUomId"));
	Select cLFUID = new Select (createLeadForm_currencyUomId);
	cLFUID.selectByVisibleText("INR - Indian Rupee");
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
	WebElement createLeadForm_marketingCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select cLFmID = new Select (createLeadForm_marketingCampaignId);
	cLFmID.selectByVisibleText("Automobile");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("05");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srikrishnafabricators@gmail.com");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840340261");
	
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Yogesh Kumar D");
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Hari");
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("1/15");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Bajanai koil street");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Sriperumbudur");
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("602105");
	WebElement createLeadForm_generalCountryGeoId = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select cLFCG = new Select (createLeadForm_generalCountryGeoId);
	cLFCG.selectByValue("IND");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
}
}
