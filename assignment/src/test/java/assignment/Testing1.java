package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ferdo\\wppool-assignment\\assignment\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost/assignment/wp-admin/");
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("12345");
		driver.findElement(By.id("wp-submit")).click();
		
		driver.findElement(By.id("toplevel_page_wp-dark-mode")).click();
		driver.findElement(By.linkText("Admin Panel Dark Mode")).click();
		driver.findElement(By.xpath("//div[text()='Enable Admin Dashboard Dark Mode']")).click();
		driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
		
		//driver.findElement(By.xpath("//span[text()='Dark']")).click();
		

		
		driver.findElement(By.xpath("//h4[text()='Customization']")).click();
		driver.findElement(By.linkText("Switch Settings")).click();
		
		driver.findElement(By.xpath("//div[@class='main-content-body']/div[@class='rounded text-base']/section[@class='flex ']/div[@class='flex'][2]/div[@class='rounded']/div[@class='rounded'][2]/div[@class='rounded'][2]/div[@class='text-base']/div[@class='flex']/[2]/div[@class='flex']/[2]")).click();
		
		//driver.findElement(By.xpath("//a[@href='http://localhost/assignment/wp-admin/admin.php?page=wp-dark-mode#/frontend'] ")).click();
		
	}

}
