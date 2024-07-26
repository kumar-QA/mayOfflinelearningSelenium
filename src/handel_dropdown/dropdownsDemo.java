package handel_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsDemo {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	List<WebElement> dropdownElements=driver.findElements(By.tagName("select"));
	System.out.println("Total no of dropdowns are:   "+dropdownElements.size());
	
	
WebElement	monthdropdwon=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));

  Select s=new Select(monthdropdwon);
    s.selectByIndex(1);
    
     s.selectByValue("June");
  
    s.selectByVisibleText("May");
  
	}

}
