import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		/********* by using By.id()************************/
		WebElement link = driver.findElement(By.id("selenium143"));
		link.click();

		/********* by using By.xpath()************************/
		WebElement link1=driver.findElement(By.xpath("//a[@id='selenium143']"));
		link1.click();
   
		 /********by using By.xpath contains Method**********************/
        
		WebElement link2=driver.findElement(By.xpath("//a[contains(text(),'http://www.Selenium143.blogspot.com')]"));
		link2.click();
		
		/******************by using LinkText locator*****************/
		
		WebElement link3=driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
        link3.click();
        
      /************By using ParitialLinkText***********************/       
		WebElement link4 = driver.findElement(By.partialLinkText("http://www.Selenium143"));
		link4.click();

	}

}
