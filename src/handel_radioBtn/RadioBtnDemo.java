package handel_radioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/**********************Count No of radio**************/
List<WebElement>elements=driver.findElements(By.xpath("//input[@type='radio']"));
System.out.println("total no of radio button are:   "+elements.size());


/**********************Names No of radio**************/
for (int i = 0; i <elements.size(); i++) {
	System.out.println("radio Btn names are: "+elements.get(i).getAttribute("value"));
}
/**********************multiple ways to find element**************/
//WebElement  btn=driver.findElement(By.id("radio2"));
//  btn.click();

//WebElement  btn=driver.findElement(By.xpath("//input[@id='radio2']"));
//  btn.click();

  WebElement  btn=driver.findElement(By.xpath("//input[@ value='female']"));
  btn.click();
  
  /**********************Check radioButton is status**************/
  if(btn.isSelected()) {
	  System.out.println("element is selected");
  }else {
	  System.out.println("element is not selected");
  }
	}
}
