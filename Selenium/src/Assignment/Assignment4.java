package Assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
	static WebDriver driver;
		@BeforeClass
		public static void FirstStep() throws InterruptedException {
			System.out.println("Before Class method");
			System.setProperty("webdriver.chrome.driver", "../Selenium/chromedriver.exe");
		    driver=new ChromeDriver();
		 	driver.get("https://www.facebook.com");
		    driver.manage().window().maximize();
			WebElement Createbutton=driver.findElement(By.id("u_0_2"));
			Createbutton.click();
			Thread.sleep(3000);
		}
		@Test
		public void RunTest() {
			System.out.println("Test method");
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
			Select s=new Select(day);
			s.selectByIndex(10);
			WebElement month=driver.findElement(By.id("month"));
			Select s1=new Select(month);
			s1.selectByValue("4");
			WebElement year=driver.findElement(By.name("birthday_year"));
			Select s2=new Select(year);
			s2.selectByVisibleText("1998");
			WebElement gender=driver.findElement(By.id("u_1_5"));
			gender.click();
		}
		@After
		public void SecondLast() {
			System.out.println("After method");
			WebElement signupbutton=driver.findElement(By.name("websubmit"));
			signupbutton.click();
			System.out.println("Congratulations your program run successfully!!");
		}
}
