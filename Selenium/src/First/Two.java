package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
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
		WebElement gender=driver.findElement(By.id("u_1_5"));
		gender.click();
		WebElement signupbutton=driver.findElement(By.name("websubmit"));
		signupbutton.click();
	
}
}
