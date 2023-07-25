package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class CreateLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(source);
		dd.selectByVisibleText("Employee");
		WebElement marketCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));         
        Select mdd=new Select(marketCamp);
        mdd.selectByValue("9001");
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));         
        Select odd=new Select(ownership);
        odd.selectByIndex(5);
        WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));         
        Select coun=new Select(country);
        coun.selectByVisibleText("India");
        driver.findElement(By.name("submitButton")).click();
        Thread.sleep(1000);
        String title1= driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
