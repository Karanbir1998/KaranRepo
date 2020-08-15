package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	
	public void DropdownbyIndex(int index,WebElement day) {
		Select s=new Select(day);
		s.selectByIndex(index);
	}
	public void DropdownbyValue(String pass, WebElement month) {
		Select s=new Select(month);
		s.selectByValue(pass);
	}
	public void DropdownbyVisbletext(String text,WebElement year) {
		Select s=new Select(year);
		s.selectByVisibleText(text);
	}
public static void main(String[] args) throws InterruptedException {
		
	Assignment2 obj=new Assignment2();
		System.setProperty("webdriver.chrome.driver", "../Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Createbutton=driver.findElement(By.id("u_0_2"));
		Createbutton.click();
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Karan");
		WebElement lastname=driver.findElement(By.cssSelector("input#u_1_d"));
		lastname.sendKeys("Singh");
		WebElement email=driver.findElement(By.cssSelector("input[id='u_1_g']"));
		email.sendKeys("Second@email.com");
		WebElement reenter=driver.findElement(By.cssSelector("input[id='u_1_j']"));
		reenter.sendKeys("Second@email.com");
		WebElement newpass=driver.findElement(By.id("password_step_input"));
		newpass.sendKeys("NewPassword"); 
		WebElement day=driver.findElement(By.id("day"));
		obj.DropdownbyIndex(10, day);
		WebElement month=driver.findElement(By.id("month"));
		obj.DropdownbyValue("4", month);
		WebElement year=driver.findElement(By.name("birthday_year"));
		obj.DropdownbyVisbletext("1998", year);
		WebElement gender=driver.findElement(By.id("u_1_5"));
		gender.click();
		WebElement signupbutton=driver.findElement(By.name("websubmit"));
		signupbutton.click();
	}
	}
