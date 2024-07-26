import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	int data=driver.findElements(By.tagName("a")).size();
	System.out.println("Total no of links are: "+data);
	
	int data1=driver.findElements(By.tagName("input")).size();
 
	 System.out.println("total no of input element"+data1);
	 
	 int noofRadioBtn=driver.findElements(By.xpath("//input[@type='radio']")).size();
	 
	 System.out.println("no of radio Btn are: "+noofRadioBtn);
	
	  int  noofCheckbox=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	  System.out.println("Total no of checkboxs are:  " +noofCheckbox);
	  
	  int noofimaged=driver.findElements(By.tagName("img")).size();
	  System.out.println("Total no of images are:  "+noofimaged);
	  
	  
	  
	  
	 }
	

}
