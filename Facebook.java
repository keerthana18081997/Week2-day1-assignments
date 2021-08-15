package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("keerthana");
		driver.findElement(By.name("lastname")).sendKeys("Ravichandran");
		driver.findElement(By.name("reg_email__")).sendKeys("keerthanaravichandra@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ravichandran18");
	
		WebElement drop1=driver.findElement(By.id("day"));
		 Select dr1=new Select(drop1);
		 dr1.selectByIndex(11);
		 
		 WebElement drop2=driver.findElement(By.id("month"));
		 Select dr2=new Select(drop2);
		 dr2.selectByIndex(8);
		 
		 WebElement drop3=driver.findElement(By.id("year"));
		 Select dr3=new Select(drop3);
		 dr3.selectByIndex(1);
		
		 driver.findElement(By.className("_58mt")).click();
		
}

}