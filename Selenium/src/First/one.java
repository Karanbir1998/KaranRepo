package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Karanbir@yopmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Password");
		WebElement button=driver.findElement(By.id("u_0_b"));
		button.click();
}
}
