package Dropdown;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbFindElements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");//Assignment-4 Fb data using FindElements
	driver.manage().window().maximize();
	WebElement CreateButton=driver.findElement(By.id("u_0_2"));
	CreateButton.click();
	Thread.sleep(2000);
	List<WebElement> All=driver.findElements(By.cssSelector("input[data-type='text']"));
	System.out.println("Number of All text fields: "+All.size());
	ArrayList<String> data=new ArrayList<String>();
	data.add("Karanbir");
	data.add("Singh");
	data.add("Karan@yopmail.com");
	data.add("karan@yopmail.com");
	data.add("Hello");
	data.add("dummy data");
	for(int i=0;i<4;i++){
		All.get(i).sendKeys(data.get(i));
	}
	WebElement newpass=driver.findElement(By.id("password_step_input"));
	newpass.sendKeys("NewPassword"); 
	WebElement day=driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByIndex(10);
	WebElement month=driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByValue("4");
	WebElement year=driver.findElement(By.name("birthday_year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("1998");
	WebElement gender=driver.findElement(By.id("u_1_6"));
	gender.click();
	All.get(5).sendKeys(data.get(5));
}
}
