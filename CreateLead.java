package Week2Assignmets;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement webUser = driver.findElement(By.id("username"));
				webUser.sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("virtusa");
			    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("keerthana");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ravichandran");
			
				WebElement drop1=driver.findElement(By.id("createLeadForm_dataSourceId"));
				 Select dr1=new Select(drop1);
				 dr1.selectByValue("LEAD_COLDCALL");
				 
				 WebElement drop2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				 Select dr2=new Select(drop2);
				 dr2.selectByVisibleText("Automobile");
				 
							
				 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("keerthu");
				 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ravi");
				 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("xyz");
				 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("xyz");
				 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information technolgy");
				 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10l");
				 
				 WebElement drop4=driver.findElement(By.id("createLeadForm_currencyUomId"));
				 Select dr4=new Select(drop4);
				 dr4.selectByValue("AFA");
				 
				 WebElement drop3=driver.findElement(By.id("createLeadForm_industryEnumId"));
				 Select dr3=new Select(drop3);
				 dr3.selectByIndex(1);
				 
				 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
				 
				 WebElement drop5=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				 Select dr5=new Select(drop5);
				 dr5.selectByIndex(1);
				 
				 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("636302");
				 driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("minion");
				 driver.findElement(By.id("createLeadForm_description")).sendKeys("nil");
				 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("nil");
				 
	             WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
			     countryCode.clear();
				 countryCode.sendKeys("5");
					
				 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("6363");
				 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567891");
				 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
				 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("malar");
				 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abs@gmail.com");
				 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("xyz.com");
				 
				 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("abc");
				 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("efg");
				 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123");
				 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("456");
				 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("987");
				 
				 WebElement drop6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				 Select dr6=new Select(drop6);
				 dr6.selectByIndex(1);
				 
				 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("302");
				 
				 WebElement drop7=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				 Select dr7=new Select(drop7);
				 dr7.selectByIndex(1);
				 
				 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0421");
				 
				driver.findElement(By.name("submitButton")).click();
				
				 String title2=driver.getTitle();
				 if(title2=="View Lead | opentaps CRM") {
					 System.out.println("lead created");
				 }
				 else {
					 System.out.println("lead not created");
				 }
	}

}

