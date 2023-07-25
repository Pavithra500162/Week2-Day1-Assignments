package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[contains(@id,'groupNameLocal')]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[contains(@id,'officeSiteName')]")).sendKeys("stename");
		driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[5]")).sendKeys("2000000");
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select ins=new Select(Industry);
		ins.selectByIndex(3);
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));         
        Select os=new Select(Ownership);
        os.selectByVisibleText("S-Corporation");
        WebElement source = driver.findElement(By.id("dataSourceId"));         
        Select s=new Select(source);
        s.selectByValue("LEAD_EMPLOYEE");
        WebElement mc = driver.findElement(By.id("marketingCampaignId"));
		Select camp=new Select(mc);
		camp.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));         
        Select provience=new Select(state);
        provience.selectByValue("TX");
        driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();
        driver.close();
	}

}
