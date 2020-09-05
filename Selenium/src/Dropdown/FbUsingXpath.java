package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FbUsingXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");// Fb signup using xpath
		driver.manage().window().maximize();		
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@*='u_1_b']")).sendKeys("Karan");//firstname
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Singh");//Ssurname
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("abc@yopmail.com");//Email
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("abc@yopmail.com");//Reenter email
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("12367890");//Password
		driver.findElement(By.id("password_step_input")).sendKeys("NewPassword"); 
		WebElement day=driver.findElement(By.id("day"));
		
		Select s=new Select(day);
		s.selectByIndex(10);
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("4");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1998");
		driver.findElement(By.xpath("//input[@type='radio']")).click();//gender
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
}