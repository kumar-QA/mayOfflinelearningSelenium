import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//	WebElement	Email=driver.findElement(By.name("email"));
//		   Email.sendKeys("adjj");
//		 WebElement passwordfield=driver.findElement(By.id("pass"));
//		 passwordfield.sendKeys("57556");
//				WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
//						login.click();
						
					WebElement	fl=driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzIwNTk1MzEzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login&next\"]"));
					fl.click();	
	}

}
