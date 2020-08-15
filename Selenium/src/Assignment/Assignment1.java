package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "../Selenium/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement Createbutton=driver.findElement(By.id("u_0_2"));
	Createbutton.click();
	Thread.sleep(3000);
	WebElement firstname=driver.findElement(By.name("firstname"));
	firstname.sendKeys("Karanbir");
	WebElement lastname=driver.findElement(By.cssSelector("input#u_1_d"));
	lastname.sendKeys("Singh");
	WebElement email=driver.findElement(By.cssSelector("input[id='u_1_g']"));
	email.sendKeys("Karan@email.com");
	WebElement reenter=driver.findElement(By.cssSelector("input[id='u_1_j']"));
	reenter.sendKeys("Karan@email.com");
	WebElement newpass=driver.findElement(By.id("password_step_input"));
	newpass.sendKeys("NewPassword"); 
	WebElement day=driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByValue("7");
	WebElement month=driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByIndex(5);
	WebElement year=driver.findElement(By.name("birthday_year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("1998");
	WebElement gender=driver.findElement(By.id("u_1_5"));
	gender.click();
	WebElement signupbutton=driver.findElement(By.name("websubmit"));
	signupbutton.click();
}
}
